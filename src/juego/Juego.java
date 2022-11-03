package juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import control.Teclado;
import entes.criaturas.Jugador;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;
import mapa.MapaCargado;
import mapa.cuadro.Cuadro;

public class Juego extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	private static final int ANCHO = 600;
	private static final int ALTO = 600;

	private static volatile boolean enFuncionamiento = false;

	private static final String NOMBRE = "Juego";

	private static int aps = 0;
	private static int fps = 0;

	private static int x = 0;
	private static int y = 0;

	private static JFrame ventana;
	private static Thread thread;
	private static Teclado teclado;
	private static Pantalla pantalla;
	private static Mapa mapa;
	private static Jugador jugador;
	private static Cuadro persona;
	private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
	private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
	private static final ImageIcon icono = new ImageIcon(Juego.class.getResource("/icono/icono.png"));

	private Juego() {

		setPreferredSize(new Dimension(ANCHO, ALTO));

		pantalla = new Pantalla(ANCHO, ALTO);

//		mapa = new MapaGenerado(128, 128);

		teclado = new Teclado();
		addKeyListener(teclado);

		mapa = new MapaCargado("/mapas/nuevominimapa.png");
		jugador = new Jugador(mapa, teclado, Sprite.FRENTE, 370, 245);
		persona = new Cuadro(Sprite.PARADO_UNO, 367, 245);

		ventana = new JFrame(NOMBRE);// Nombre para la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cierra la ventana
		ventana.setResizable(false);// No podras cambiar el tamaño de la ventana
		ventana.setIconImage(icono.getImage());// Mostrar Icono ventana
		ventana.setLayout(new BorderLayout());
		ventana.add(this, BorderLayout.CENTER);// Centra la ventana fondo
		ventana.pack();// Ajusta el tamaño de la ventana que has definido
		ventana.setLocationRelativeTo(null);// Centra la ventana en si.
		ventana.setVisible(true);// Muestra la ventana.

	}

	public static void main(String[] args) {
		Juego juego = new Juego();

		juego.iniciar();// Llama a iniciar.

	}

	private synchronized void iniciar() {// Va con volatile
		enFuncionamiento = true;
		thread = new Thread(this, "Graficos");
		thread.start();
	}

	private synchronized void detener() {
		enFuncionamiento = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void actualizar() {
		teclado.actualizar();

		jugador.actualizar();
		jugador.interactua();

		if (teclado.salir) {
			System.exit(0);
		}

		aps++;

		if (teclado.cuadro) {

		}

	}

	private void mostrar() {
		BufferStrategy estrategia = getBufferStrategy();
		if (estrategia == null) {
			createBufferStrategy(3);
			return;
		}

//		pantalla.limpiar();
		mapa.mostrar(jugador.obtenerPosicionX() - pantalla.obtenAncho() / 2 + jugador.obtenSprite().obtenLado() / 2,
				jugador.obtenerPosicionY() - pantalla.obtenAlto() / 2 + jugador.obtenSprite().obtenLado() / 2,
				pantalla);// Mapa

		jugador.mostrar(pantalla);

		System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);

//  for (int i = 0; i < pixeles.length; i++) {

//   pixeles[i] = pantalla.pixeles[i];

//  }

		Graphics g = estrategia.getDrawGraphics();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
		g.setColor(Color.blue);
		g.drawString("X: " + jugador.obtenerPosicionX(), 10, 50);
		g.drawString("Y: " + jugador.obtenerPosicionY(), 10, 65);
		g.dispose();// Destruye g
		estrategia.show();

		fps++;

	}

	public void run() {

		final int NS_POR_SEGUNDO = 1000000000;
		final byte APS_OBJETIVO = 60;
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;
		long referenciaActualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();
		double tiempoTranscurrido;
		double delta = 0;

		requestFocus();// Evita click en la ventana el focus

		while (enFuncionamiento) {
			final long inicioBucle = System.nanoTime();
			tiempoTranscurrido = inicioBucle - referenciaActualizacion;
			referenciaActualizacion = inicioBucle;
			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;
			while (delta >= 1) {
				actualizar();
				delta--;
			}
			mostrar();

			if (System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				ventana.setTitle(NOMBRE + " || APS: " + aps + " || FPS: " + fps);
				aps = 0;
				fps = 0;
				referenciaContador = System.nanoTime();

			}

		}

		// System.out.println("El thread 2 se esta ejecutando con exito");

	}

}
