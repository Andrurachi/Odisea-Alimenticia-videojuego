package entes.criaturas;

import control.Teclado;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;

public class Jugador extends Criatura {

	private Teclado teclado;

	private int animacion;

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
	}

	public void interactua() {
		if (teclado.interactua) {
			if (obtenerPosicionX() < 157) {
				if (obtenerPosicionX() > 100) {
					if (obtenerPosicionY() > 190) {
						if (obtenerPosicionY() < 248) {
							System.out.print('a');
						}
					}
				}
			}
		}

		if (teclado.interactua) {
			if (obtenerPosicionX() < 705) {
				if (obtenerPosicionX() > 643) {
					if (obtenerPosicionY() > 505) {
						if (obtenerPosicionY() < 567) {
							System.out.print('b');
						}
					}
				}
			}
		}
		if (teclado.interactua) {
			if (obtenerPosicionX() < 159) {
				if (obtenerPosicionX() > 104) {
					if (obtenerPosicionY() > 419) {
						if (obtenerPosicionY() < 479) {
							System.out.print('c');
						}
					}
				}
			}
		}
	}

	public void direccionJugador(char direccion) {

	}

}
