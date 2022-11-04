//sprite
package graficos;

public class Sprite {
	private final int lado;

	private int x;
	private int y;

	public int[] pixeles;
	private HojaSprites hoja;

	// coleccion de sprites del personaje
	public static final Sprite FRENTE_DERECHA = new Sprite(32, 0, 0, HojaSprites.personaje);
	public static final Sprite FRENTE = new Sprite(32, 1, 0, HojaSprites.personaje);
	public static final Sprite FRENTE_IZQUIERDA = new Sprite(32, 2, 0, HojaSprites.personaje);
	public static final Sprite IZQUIERDA_1 = new Sprite(32, 1, 1, HojaSprites.personaje);
	public static final Sprite IZQUIERDA_QUIETO = new Sprite(32, 0, 1, HojaSprites.personaje);
	public static final Sprite IZQUIERDA_2 = new Sprite(32, 2, 1, HojaSprites.personaje);
	public static final Sprite ATRAS_DERECHA = new Sprite(32, 0, 2, HojaSprites.personaje);
	public static final Sprite ATRAS = new Sprite(32, 1, 2, HojaSprites.personaje);
	public static final Sprite ATRAS_IZQUIERDA = new Sprite(32, 2, 2, HojaSprites.personaje);
	public static final Sprite DERECHA_1 = new Sprite(32, 0, 3, HojaSprites.personaje);
	public static final Sprite DERECHA_QUIETO = new Sprite(32, 2, 3, HojaSprites.personaje);
	public static final Sprite DERECHA_2 = new Sprite(32, 1, 3, HojaSprites.personaje);

	// final de colleccion de sprites personajes
	public static final Sprite PARADO_UNO = new Sprite(32, 9, 6, HojaSprites.granja);
	public static final Sprite PARADO_DOS = new Sprite(32, 9, 7, HojaSprites.granja);
	public static final Sprite PARADO_TRES = new Sprite(32, 8, 6, HojaSprites.granja);
	// coleccion sprites persona 1

	// fin coeccion swprites persona 1

	// coleccion de sprites
	public static final Sprite VACIO = new Sprite(32, 1, 0, HojaSprites.granja);
	public static final Sprite PASTO = new Sprite(32, 0, 0, HojaSprites.granja);
	public static final Sprite AWA = new Sprite(32, 1, 0, HojaSprites.granja);
	public static final Sprite PASTO_UP_IZQ = new Sprite(32, 2, 0, HojaSprites.granja);
	public static final Sprite PASTO_UP_DER = new Sprite(32, 3, 0, HojaSprites.granja);
	public static final Sprite ARBUSTO_UP_IZQ = new Sprite(32, 4, 0, HojaSprites.granja);
	public static final Sprite ARBUSTO_UP_DER = new Sprite(32, 5, 0, HojaSprites.granja);
	public static final Sprite PASTO_PLANTA_UP_IZQ = new Sprite(32, 6, 0, HojaSprites.granja);
	public static final Sprite PASTO_PLANTA_UP_DER = new Sprite(32, 7, 0, HojaSprites.granja);
	public static final Sprite ROCAS_UNO = new Sprite(32, 8, 0, HojaSprites.granja);
	public static final Sprite ROCAS_DOS = new Sprite(32, 9, 0, HojaSprites.granja);
	public static final Sprite FLOR = new Sprite(32, 0, 1, HojaSprites.granja);
	public static final Sprite PASTO_HIERBA = new Sprite(32, 1, 1, HojaSprites.granja);
	public static final Sprite PASTO_DOWN_IZQ = new Sprite(32, 2, 1, HojaSprites.granja);
	public static final Sprite PASTO_DOWN_DER = new Sprite(32, 3, 1, HojaSprites.granja);
	public static final Sprite ARBUSTO_DOWN_IZQ = new Sprite(32, 4, 1, HojaSprites.granja);
	public static final Sprite ARBUSTO_DOWN_DER = new Sprite(32, 5, 1, HojaSprites.granja);
	public static final Sprite PASTO_PLANTA_DOWN_IZQ = new Sprite(32, 6, 1, HojaSprites.granja);
	public static final Sprite PASTO_PLANTA_DOWN_DER = new Sprite(32, 7, 1, HojaSprites.granja);
	public static final Sprite PUERTA_UNO = new Sprite(32, 8, 1, HojaSprites.granja);
	public static final Sprite TIERRA = new Sprite(32, 9, 1, HojaSprites.granja);
	public static final Sprite ARBUSTO_ARRIBA = new Sprite(32, 0, 2, HojaSprites.granja);
	public static final Sprite TIERRA_UP_IZQ = new Sprite(32, 1, 2, HojaSprites.granja);
	public static final Sprite TIERRA_UP_DER = new Sprite(32, 2, 2, HojaSprites.granja);
	public static final Sprite VENTANA = new Sprite(32, 3, 2, HojaSprites.granja);
	public static final Sprite PARED_UNO = new Sprite(32, 4, 2, HojaSprites.granja);
	public static final Sprite PARED_DOS = new Sprite(32, 5, 2, HojaSprites.granja);
	public static final Sprite PARED_TRES = new Sprite(32, 6, 2, HojaSprites.granja);
	public static final Sprite PARED_CUATRO = new Sprite(32, 7, 2, HojaSprites.granja);
	public static final Sprite CAMINO_IZQ = new Sprite(32, 8, 2, HojaSprites.granja);
	public static final Sprite CAMINO_DER = new Sprite(32, 9, 2, HojaSprites.granja);
	public static final Sprite ARBUSTO_MEDIO = new Sprite(32, 0, 3, HojaSprites.granja);
	public static final Sprite TIERRA_DOWN_IZQ = new Sprite(32, 1, 3, HojaSprites.granja);
	public static final Sprite TIERRA_DOWN_DER = new Sprite(32, 2, 3, HojaSprites.granja);
	public static final Sprite TIERRA_HIERBA_UNO = new Sprite(32, 3, 3, HojaSprites.granja);
	public static final Sprite TIERRA_HIERBA_DOS = new Sprite(32, 4, 3, HojaSprites.granja);
	public static final Sprite TIERRA_HIERBA_TRES = new Sprite(32, 5, 3, HojaSprites.granja);
	public static final Sprite TIERRA_HIERBA_CUATRO = new Sprite(32, 6, 3, HojaSprites.granja);
	public static final Sprite PUERTA_DOS = new Sprite(32, 7, 3, HojaSprites.granja);
	public static final Sprite CAMINO_ARRIBA = new Sprite(32, 8, 3, HojaSprites.granja);
	public static final Sprite CAMINO_ABAJO = new Sprite(32, 9, 3, HojaSprites.granja);
	public static final Sprite ARBUSTO_ABAJO = new Sprite(32, 0, 4, HojaSprites.granja);
	public static final Sprite TECHO_PARED_UP_IZQ = new Sprite(32, 1, 4, HojaSprites.granja);
	public static final Sprite TECHO_ESQ_UP_IZQ = new Sprite(32, 2, 4, HojaSprites.granja);
	public static final Sprite TECHO_UP_UNO = new Sprite(32, 3, 4, HojaSprites.granja);
	public static final Sprite TECHO_UP_DOS = new Sprite(32, 4, 4, HojaSprites.granja);
	public static final Sprite TECHO_ESQ_UP_DER = new Sprite(32, 5, 4, HojaSprites.granja);
	public static final Sprite TECHO_PARED_UP_DER = new Sprite(32, 6, 4, HojaSprites.granja);
	public static final Sprite PASTO_CENTRO_ARRIBA = new Sprite(32, 7, 4, HojaSprites.granja);
	public static final Sprite PASTO_CENTRO_ABAJO = new Sprite(32, 8, 4, HojaSprites.granja);
	public static final Sprite CAMINO_VACIO = new Sprite(32, 9, 4, HojaSprites.granja);
	public static final Sprite TECHO_2_1 = new Sprite(32, 1, 5, HojaSprites.granja);
	public static final Sprite TECHO_2_2 = new Sprite(32, 2, 5, HojaSprites.granja);
	public static final Sprite TECHO_2_3 = new Sprite(32, 3, 5, HojaSprites.granja);
	public static final Sprite TECHO_2_4 = new Sprite(32, 4, 5, HojaSprites.granja);
	public static final Sprite TECHO_2_5 = new Sprite(32, 5, 5, HojaSprites.granja);
	public static final Sprite TECHO_2_6 = new Sprite(32, 6, 5, HojaSprites.granja);
	public static final Sprite PASTO_CENTRO_IZQUIERDA = new Sprite(32, 7, 5, HojaSprites.granja);
	public static final Sprite PASTO_CENTRO_DERECHA = new Sprite(32, 8, 5, HojaSprites.granja);
	public static final Sprite PASTO_CENTRO = new Sprite(32, 9, 5, HojaSprites.granja);
	public static final Sprite TECHO_3_1 = new Sprite(32, 1, 6, HojaSprites.granja);
	public static final Sprite TECHO_3_2 = new Sprite(32, 2, 6, HojaSprites.granja);
	public static final Sprite TECHO_3_3 = new Sprite(32, 3, 6, HojaSprites.granja);
	public static final Sprite TECHO_3_4 = new Sprite(32, 4, 6, HojaSprites.granja);
	public static final Sprite TECHO_3_5 = new Sprite(32, 5, 6, HojaSprites.granja);
	public static final Sprite TECHO_3_6 = new Sprite(32, 6, 6, HojaSprites.granja);
	public static final Sprite TECHO_4_2 = new Sprite(32, 2, 7, HojaSprites.granja);
	public static final Sprite TECHO_4_3 = new Sprite(32, 3, 7, HojaSprites.granja);
	public static final Sprite TECHO_4_4 = new Sprite(32, 4, 7, HojaSprites.granja);
	public static final Sprite TECHO_4_5 = new Sprite(32, 5, 7, HojaSprites.granja);
	public static final Sprite VALLA_CENTRO_DERECHA = new Sprite(32, 0, 8, HojaSprites.granja);
	public static final Sprite VALLA_CENTRO_ABAJO = new Sprite(32, 1, 8, HojaSprites.granja);
	public static final Sprite VALLA_ESQUINA_IZQUIERDA_ABAJO = new Sprite(32, 2, 8, HojaSprites.granja);
	public static final Sprite VALLA_ESQUINA_DERECHA_ABAJO = new Sprite(32, 0, 9, HojaSprites.granja);
	public static final Sprite VALLA_ESQUINA_DERECHA_ARRIBA = new Sprite(32, 1, 9, HojaSprites.granja);
	public static final Sprite VALLA_ESQUINA_IZQUIERDA_ARRIBA = new Sprite(32, 2, 9, HojaSprites.granja);
	public static final Sprite ARBOL_BOLITA_ESQUINA_IZQUIERDA_ARRIBA = new Sprite(32, 7, 8, HojaSprites.granja);
	public static final Sprite ARBOL_BOLITA_ESQUINA_DERECHA_ARRIBA = new Sprite(32, 8, 8, HojaSprites.granja);
	public static final Sprite ARBOL_BOLITA_MIITAD_IZQUIERDA = new Sprite(32, 7, 9, HojaSprites.granja);
	public static final Sprite ARBOL_BOLITA_MIITAD_DERECHA = new Sprite(32, 8, 9, HojaSprites.granja);
	public static final Sprite ARBOL_BOLITA_ESQUINA_IZQUIERDA_ABAJO = new Sprite(32, 9, 8, HojaSprites.granja);
	public static final Sprite ARBOL_BOLITA_ESQUINA_DERECHA_ABAJO = new Sprite(32, 9, 9, HojaSprites.granja);

	// recetas
	public static final Sprite receta1 = new Sprite(32, 9, 9, HojaSprites.granja);
	// fin recetas

	// fin de la coleccion

	public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja) {
		this.lado = lado;

		pixeles = new int[lado * lado];

		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;

		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.obtenAncho()];
			}
		}
	}

	public Sprite(final int lado, final int color) {
		this.lado = lado;
		pixeles = new int[lado * lado];

		for (int i = 0; i < pixeles.length; i++) {
			pixeles[i] = color;
		}
	}

	public int obtenLado() {
		return lado;
	}
}