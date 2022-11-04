package entes.criaturas;

import control.Teclado;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;

public class Jugador extends Criatura {

	private Teclado teclado;

	private int animacion;

	private boolean receta_abierta = false;

	private int num_receta;

	public Jugador(Mapa mapa, Teclado teclado, Sprite sprite) {
		this.mapa = mapa;
		this.teclado = teclado;
		this.sprite = sprite;
	}

	public Jugador(Mapa mapa, Teclado teclado, Sprite sprite, int posicionX, int posicionY) {
		this.mapa = mapa;
		this.teclado = teclado;
		this.sprite = sprite;
		this.x = posicionX;
		this.y = posicionY;
	}

	public void actualizar() {

		int desplazamientoX = 0;
		int desplazamientoY = 0;
		if (animacion < 32767) {
			animacion++;
		} else {
			animacion = 0;
		}

		if (teclado.arriba) {
			desplazamientoY--;
		}
		if (teclado.abajo) {
			desplazamientoY++;
		}
		if (teclado.izquierda) {
			desplazamientoX--;
		}
		if (teclado.derecha) {
			desplazamientoX++;
		}

		if (desplazamientoX != 0 || desplazamientoY != 0) {
			mover(desplazamientoX, desplazamientoY);
			enMovimiento = true;
		} else {
			enMovimiento = false;
		}

		if (direccion == 'n') {
			sprite = Sprite.ATRAS;
			if (enMovimiento) {
				if (animacion % 30 > 15) {
					sprite = Sprite.ATRAS_IZQUIERDA;
				} else {
					sprite = Sprite.ATRAS_DERECHA;
				}
			}
		}
		if (direccion == 's') {
			sprite = Sprite.FRENTE;
			if (enMovimiento) {
				if (animacion % 30 > 15) {
					sprite = Sprite.FRENTE_IZQUIERDA;
				} else {
					sprite = Sprite.FRENTE_DERECHA;
				}
			}
		}
		if (direccion == 'o') {
			sprite = Sprite.IZQUIERDA_QUIETO;
			if (enMovimiento) {
				if (animacion % 30 > 15) {
					sprite = Sprite.IZQUIERDA_1;
				} else {
					sprite = Sprite.IZQUIERDA_2;
				}
			}
		}
		if (direccion == 'e') {
			sprite = Sprite.DERECHA_QUIETO;
			if (enMovimiento) {
				if (animacion % 30 > 15) {
					sprite = Sprite.DERECHA_1;
				} else {
					sprite = Sprite.DERECHA_2;
				}
			}
		}
	}

	public void mostrar(Pantalla pantalla) {
		pantalla.mostrarJugador(x, y, this);
		interactua();
	}

	public void interactua() {
		if (obtenerPosicionX() < 157 && obtenerPosicionX() > 100 && obtenerPosicionY() > 190
				&& obtenerPosicionY() < 248) {
			num_receta = 1;
		} else if (obtenerPosicionX() < 705 && obtenerPosicionX() > 643 && obtenerPosicionY() > 505
				&& obtenerPosicionY() < 567) {
			num_receta = 2;
		} else if (obtenerPosicionX() < 159 && obtenerPosicionX() > 104 && obtenerPosicionY() > 419
				&& obtenerPosicionY() < 479) {
			num_receta = 3;
		} else if (obtenerPosicionX() < 395 && obtenerPosicionX() > 342 && obtenerPosicionY() > 227
				&& obtenerPosicionY() < 231) {
			num_receta = 4;
		} else {
			num_receta = 0;
		}
	}

	public int obtenerReceta() {
		return num_receta;
	}

	public void direccionJugador(char direccion) {

	}

}
