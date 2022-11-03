package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {

	public int x;
	public int y;

	public Sprite sprite;

	private boolean solido;
	private boolean transparencia;

	public static final int LADO = 32;

	// Coleccion de cuadros

	public static final Cuadro VACIO = new Cuadro(Sprite.VACIO, true);
	public static final Cuadro PASTO = new Cuadro(Sprite.PASTO);
	public static final Cuadro AWA = new Cuadro(Sprite.AWA);
	public static final Cuadro PASTO_UP_IZQ = new Cuadro(Sprite.PASTO_UP_IZQ);
	public static final Cuadro PASTO_UP_DER = new Cuadro(Sprite.PASTO_UP_DER);
	public static final Cuadro ARBUSTO_UP_IZQ = new Cuadro(Sprite.ARBUSTO_UP_IZQ, true);
	public static final Cuadro ARBUSTO_UP_DER = new Cuadro(Sprite.ARBUSTO_UP_DER, true);
	public static final Cuadro PASTO_PLANTA_UP_IZQ = new Cuadro(Sprite.PASTO_PLANTA_UP_IZQ);
	public static final Cuadro PASTO_PLANTA_UP_DER = new Cuadro(Sprite.PASTO_PLANTA_UP_DER);
	public static final Cuadro ROCAS_UNO = new Cuadro(Sprite.ROCAS_UNO);
	public static final Cuadro ROCAS_DOS = new Cuadro(Sprite.ROCAS_DOS);
	public static final Cuadro FLOR = new Cuadro(Sprite.FLOR);
	public static final Cuadro PASTO_HIERBA = new Cuadro(Sprite.PASTO_HIERBA);
	public static final Cuadro PASTO_DOWN_IZQ = new Cuadro(Sprite.PASTO_DOWN_IZQ);
	public static final Cuadro PASTO_DOWN_DER = new Cuadro(Sprite.PASTO_DOWN_DER);
	public static final Cuadro ARBUSTO_DOWN_IZQ = new Cuadro(Sprite.ARBUSTO_DOWN_IZQ, true);
	public static final Cuadro ARBUSTO_DOWN_DER = new Cuadro(Sprite.ARBUSTO_DOWN_DER, true);
	public static final Cuadro PASTO_PLANTA_DOWN_IZQ = new Cuadro(Sprite.PASTO_PLANTA_DOWN_IZQ);
	public static final Cuadro PASTO_PLANTA_DOWN_DER = new Cuadro(Sprite.PASTO_PLANTA_DOWN_DER);
	public static final Cuadro PUERTA_UNO = new Cuadro(Sprite.PUERTA_UNO, true);
	public static final Cuadro TIERRA = new Cuadro(Sprite.TIERRA);
	public static final Cuadro ARBUSTO_ARRIBA = new Cuadro(Sprite.ARBUSTO_ARRIBA, true);
	public static final Cuadro TIERRA_UP_IZQ = new Cuadro(Sprite.TIERRA_UP_IZQ);
	public static final Cuadro TIERRA_UP_DER = new Cuadro(Sprite.TIERRA_UP_DER);
	public static final Cuadro VENTANA = new Cuadro(Sprite.VENTANA, true);
	public static final Cuadro PARED_UNO = new Cuadro(Sprite.PARED_UNO, true);
	public static final Cuadro PARED_DOS = new Cuadro(Sprite.PARED_DOS, true);
	public static final Cuadro PARED_TRES = new Cuadro(Sprite.PARED_TRES, true);
	public static final Cuadro PARED_CUATRO = new Cuadro(Sprite.PARED_CUATRO, true);
	public static final Cuadro CAMINO_IZQ = new Cuadro(Sprite.CAMINO_IZQ);
	public static final Cuadro CAMINO_DER = new Cuadro(Sprite.CAMINO_DER);
	public static final Cuadro ARBUSTO_MEDIO = new Cuadro(Sprite.ARBUSTO_MEDIO, true);
	public static final Cuadro TIERRA_DOWN_IZQ = new Cuadro(Sprite.TIERRA_DOWN_IZQ);
	public static final Cuadro TIERRA_DOWN_DER = new Cuadro(Sprite.TIERRA_DOWN_DER);
	public static final Cuadro TIERRA_HIERBA_UNO = new Cuadro(Sprite.TIERRA_HIERBA_UNO);
	public static final Cuadro TIERRA_HIERBA_DOS = new Cuadro(Sprite.TIERRA_HIERBA_DOS);
	public static final Cuadro TIERRA_HIERBA_TRES = new Cuadro(Sprite.TIERRA_HIERBA_TRES);
	public static final Cuadro TIERRA_HIERBA_CUATRO = new Cuadro(Sprite.TIERRA_HIERBA_CUATRO);
	public static final Cuadro PUERTA_DOS = new Cuadro(Sprite.PUERTA_DOS, true);
	public static final Cuadro CAMINO_ARRIBA = new Cuadro(Sprite.CAMINO_ARRIBA);
	public static final Cuadro CAMINO_ABAJO = new Cuadro(Sprite.CAMINO_ABAJO);
	public static final Cuadro ARBUSTO_ABAJO = new Cuadro(Sprite.ARBUSTO_ABAJO, true);
	public static final Cuadro TECHO_PARED_UP_IZQ = new Cuadro(Sprite.TECHO_PARED_UP_IZQ, true);
	public static final Cuadro TECHO_ESQ_UP_IZQ = new Cuadro(Sprite.TECHO_ESQ_UP_IZQ, true);
	public static final Cuadro TECHO_UP_UNO = new Cuadro(Sprite.TECHO_UP_UNO, true);
	public static final Cuadro TECHO_UP_DOS = new Cuadro(Sprite.TECHO_UP_DOS, true);
	public static final Cuadro PASTO_CENTRO_ARRIBA = new Cuadro(Sprite.PASTO_CENTRO_ARRIBA, true);
	public static final Cuadro PASTO_CENTRO_ABAJO = new Cuadro(Sprite.PASTO_CENTRO_ABAJO, true);
	public static final Cuadro CAMINO_VACIO = new Cuadro(Sprite.CAMINO_VACIO);
	public static final Cuadro PASTO_CENTRO_IZQUIERDA = new Cuadro(Sprite.PASTO_CENTRO_IZQUIERDA, true);
	public static final Cuadro PASTO_CENTRO_DERECHA = new Cuadro(Sprite.PASTO_CENTRO_DERECHA, true);
	public static final Cuadro PASTO_CENTRO = new Cuadro(Sprite.PASTO_CENTRO, true);
	public static final Cuadro TECHO_ESQ_UP_DER = new Cuadro(Sprite.TECHO_ESQ_UP_DER, true);
	public static final Cuadro TECHO_PARED_UP_DER = new Cuadro(Sprite.TECHO_PARED_UP_DER, true);
	public static final Cuadro TECHO_2_1 = new Cuadro(Sprite.TECHO_2_1, true);
	public static final Cuadro TECHO_2_2 = new Cuadro(Sprite.TECHO_2_2, true);
	public static final Cuadro TECHO_2_3 = new Cuadro(Sprite.TECHO_2_3, true);
	public static final Cuadro TECHO_2_4 = new Cuadro(Sprite.TECHO_2_4, true);
	public static final Cuadro TECHO_2_5 = new Cuadro(Sprite.TECHO_2_5, true);
	public static final Cuadro TECHO_2_6 = new Cuadro(Sprite.TECHO_2_6, true);
	public static final Cuadro TECHO_3_1 = new Cuadro(Sprite.TECHO_3_1, true);
	public static final Cuadro TECHO_3_2 = new Cuadro(Sprite.TECHO_3_2, true);
	public static final Cuadro TECHO_3_3 = new Cuadro(Sprite.TECHO_3_3, true);
	public static final Cuadro TECHO_3_4 = new Cuadro(Sprite.TECHO_3_4, true);
	public static final Cuadro TECHO_3_5 = new Cuadro(Sprite.TECHO_3_5, true);
	public static final Cuadro TECHO_3_6 = new Cuadro(Sprite.TECHO_3_6, true);
	public static final Cuadro TECHO_4_2 = new Cuadro(Sprite.TECHO_4_2, true);
	public static final Cuadro TECHO_4_3 = new Cuadro(Sprite.TECHO_4_3, true);
	public static final Cuadro TECHO_4_4 = new Cuadro(Sprite.TECHO_4_4, true);
	public static final Cuadro TECHO_4_5 = new Cuadro(Sprite.TECHO_4_5, true);
	public static final Cuadro VALLA_CENTRO_DERECHA = new Cuadro(Sprite.VALLA_CENTRO_DERECHA, true);
	public static final Cuadro VALLA_CENTRO_ABAJO = new Cuadro(Sprite.VALLA_CENTRO_ABAJO, true);
	public static final Cuadro VALLA_ESQUINA_IZQUIERDA_ABAJO = new Cuadro(Sprite.VALLA_ESQUINA_IZQUIERDA_ABAJO, true);
	public static final Cuadro VALLA_ESQUINA_DERECHA_ABAJO = new Cuadro(Sprite.VALLA_ESQUINA_DERECHA_ABAJO, true);
	public static final Cuadro VALLA_ESQUINA_DERECHA_ARRIBA = new Cuadro(Sprite.VALLA_ESQUINA_DERECHA_ARRIBA, true);
	public static final Cuadro VALLA_ESQUINA_IZQUIERDA_ARRIBA = new Cuadro(Sprite.VALLA_ESQUINA_IZQUIERDA_ARRIBA, true);
	public static final Cuadro ARBOL_BOLITA_ESQUINA_IZQUIERDA_ARRIBA = new Cuadro(
			Sprite.ARBOL_BOLITA_ESQUINA_IZQUIERDA_ARRIBA, true);
	public static final Cuadro ARBOL_BOLITA_ESQUINA_DERECHA_ARRIBA = new Cuadro(
			Sprite.ARBOL_BOLITA_ESQUINA_DERECHA_ARRIBA, true);
	public static final Cuadro ARBOL_BOLITA_MIITAD_IZQUIERDA = new Cuadro(Sprite.ARBOL_BOLITA_MIITAD_IZQUIERDA, true);
	public static final Cuadro ARBOL_BOLITA_MIITAD_DERECHA = new Cuadro(Sprite.ARBOL_BOLITA_MIITAD_DERECHA, true);
	public static final Cuadro ARBOL_BOLITA_ESQUINA_IZQUIERDA_ABAJO = new Cuadro(
			Sprite.ARBOL_BOLITA_ESQUINA_IZQUIERDA_ABAJO, true);
	public static final Cuadro ARBOL_BOLITA_ESQUINA_DERECHA_ABAJO = new Cuadro(
			Sprite.ARBOL_BOLITA_ESQUINA_DERECHA_ABAJO, true);
	public static final Cuadro PARADO_UNO = new Cuadro(Sprite.PARADO_UNO, true, true);
	public static final Cuadro PARADO_DOS = new Cuadro(Sprite.PARADO_DOS, true, true);
	public static final Cuadro PARADO_TRES = new Cuadro(Sprite.PARADO_TRES, true, true);

	// Fin de la coleccion cuadros

	public Cuadro(Sprite sprite) {

		this.sprite = sprite;
		solido = false;
	}

	public Cuadro(Sprite sprite, boolean solido) {
		this.sprite = sprite;
		this.solido = solido;
	}

	public Cuadro(Sprite sprite, boolean solido, boolean transparencia) {
		this.sprite = sprite;
		this.solido = solido;
		this.transparencia = transparencia;
	}

	public Cuadro(Sprite sprite, int posicionX, int posicionY) {
		this.sprite = sprite;
		this.x = posicionX;
		this.y = posicionY;
	}

	public void mostrar(Pantalla pantalla) {
		pantalla.mostrarCuadro(x, y, this);
	}

	public void mostrar(int x, int y, Pantalla pantalla) {

		pantalla.mostrarCuadro(x << 5, y << 5, this);

	}

	public boolean esSolido() {// Revisa si el cuadro es solido.

		return solido;

	}

}