package graficos;

import entes.criaturas.Jugador;
import mapa.cuadro.Cuadro;

public final class Pantalla {

	private final int ancho;

	private final int alto;

	private int diferenciaX;

	private int diferenciaY;

	public final int[] pixeles;// Pixeles para la pantalla

	public Pantalla(final int ancho, final int alto) {

		this.ancho = ancho;

		this.alto = alto;

		pixeles = new int[ancho * alto];

	}

	public void limpiar() {// Limpia la pantalla borrando lo anterior

		for (int i = 0; i < pixeles.length; i++) {

			pixeles[i] = 0;// 0 es el color negro, esto para el fondo

		}

	}

//	public void interactua (int compensacionX, int compensacionY, Cuadro cuadro, Jugador jugador,  )

	public void mostrarCuadro(int compensacionX, int compensacionY, Cuadro cuadro) {
		compensacionX -= diferenciaX;
		compensacionY -= diferenciaY;

		for (int y = 0; y < cuadro.sprite.obtenLado(); y++) {
			int posicionY = y + compensacionY;
			for (int x = 0; x < cuadro.sprite.obtenLado(); x++) {
				int posicionX = x + compensacionX;
				if (posicionX < -cuadro.sprite.obtenLado() || posicionX >= ancho || posicionY < 0
						|| posicionY >= alto) {
					break;
				}
				if (posicionX < 0) {
					posicionX = 0;
				}
				pixeles[posicionX + posicionY * ancho] = cuadro.sprite.pixeles[x + y * cuadro.sprite.obtenLado()];
			}
		}
	}

	public void mostrarCuadro(int compensacionX, int compensacionY, Cuadro cuadro, boolean transparencia) {
		compensacionX -= diferenciaX;
		compensacionY -= diferenciaY;

		for (int y = 0; y < cuadro.sprite.obtenLado(); y++) {
			int posicionY = y + compensacionY;
			for (int x = 0; x < cuadro.sprite.obtenLado(); x++) {
				int posicionX = x + compensacionX;
				if (posicionX < -cuadro.sprite.obtenLado() || posicionX >= ancho || posicionY < 0
						|| posicionY >= alto) {
					break;
				}
				if (posicionX < 0) {
					posicionX = 0;
				}
				int colorPixel = cuadro.sprite.pixeles[x + y * cuadro.sprite.obtenLado()];
				if (colorPixel != 0xfff68bcd) {
					pixeles[posicionX + posicionY * ancho] = colorPixel;
				}
			}
		}
	}

	public void mostrarJugador(int compensacionX, int compensacionY, Jugador jugador) {

		compensacionX -= diferenciaX;
		compensacionY -= diferenciaY;

		for (int y = 0; y < jugador.obtenSprite().obtenLado(); y++) {
			int posicionY = y + compensacionY;
			for (int x = 0; x < jugador.obtenSprite().obtenLado(); x++) {

				int posicionX = x + compensacionX;
				if (posicionX < -jugador.obtenSprite().obtenLado() || posicionX >= ancho || posicionY < 0
						|| posicionY >= alto) {
					break;

				}
				if (posicionX < 0) {
					posicionX = 0;
				}
//				pixeles[posicionX + posicionY * ancho] = jugador.obtenSprite().pixeles[x
//						+ y * jugador.obtenSprite().obtenLado()];
				int colorPixelJugador = jugador.obtenSprite().pixeles[x + y * jugador.obtenSprite().obtenLado()];
				if (colorPixelJugador != 0xff00ffc4) {
					pixeles[posicionX + posicionY * ancho] = colorPixelJugador;
				}
			}
		}
	}

	public void estableceDiferencia(final int diferenciaX, final int diferenciaY) {

		this.diferenciaX = diferenciaX;

		this.diferenciaY = diferenciaY;

	}

	public int obtenAncho() {

		return ancho;

	}

	public int obtenAlto() {

		return alto;

	}

}
