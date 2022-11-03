package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import mapa.cuadro.Cuadro;

public class MapaCargado extends Mapa {

	private int[] pixeles;

	public MapaCargado(String ruta) {
		super(ruta);
	}

	protected void cargarMapa(String ruta) {
		try {
			BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
			ancho = imagen.getWidth();
			alto = imagen.getHeight();

			cuadrosCatalogo = new Cuadro[ancho * alto];
			pixeles = new int[ancho * alto];

			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void generarMapa() {
		for (int i = 0; i < pixeles.length; i++) {
			switch (pixeles[i]) {
			case 0xff22203c:
				cuadrosCatalogo[i] = Cuadro.PUERTA_DOS;
				continue;
			case 0xff975948:
				cuadrosCatalogo[i] = Cuadro.TIERRA;
				continue;
			case 0xffd69a4e:
				cuadrosCatalogo[i] = Cuadro.CAMINO_ARRIBA;
				continue;
			case 0xFF83a828:
				cuadrosCatalogo[i] = Cuadro.TIERRA_HIERBA_UNO;
				continue;
			case 0xFF9bcd1f:
				cuadrosCatalogo[i] = Cuadro.CAMINO_ABAJO;
				continue;
			case 0xff66841a:
				cuadrosCatalogo[i] = Cuadro.CAMINO_DER;
				continue;
			case 0xff84681a:
				cuadrosCatalogo[i] = Cuadro.CAMINO_VACIO;
				continue;
			case 0xff1a4084:
				cuadrosCatalogo[i] = Cuadro.TIERRA_DOWN_DER;
				continue;
			case 0xff6bc572:
				cuadrosCatalogo[i] = Cuadro.TIERRA_DOWN_IZQ;
				continue;
			case 0xFF1c5320:
				cuadrosCatalogo[i] = Cuadro.TIERRA_UP_DER;
				continue;
			case 0xFF3d9143:
				cuadrosCatalogo[i] = Cuadro.TIERRA_UP_IZQ;
				continue;
			case 0xff595671:
				cuadrosCatalogo[i] = Cuadro.PUERTA_UNO;
				continue;
			case 0xffbcb8c5:
				cuadrosCatalogo[i] = Cuadro.VENTANA;
				continue;
			case 0xFFc0afe2:
				cuadrosCatalogo[i] = Cuadro.PARED_UNO;
				continue;
			case 0xff6d6184:
				cuadrosCatalogo[i] = Cuadro.PARED_CUATRO;
				continue;
			case 0xffd7cdec:
				cuadrosCatalogo[i] = Cuadro.PARED_DOS;
				continue;
			case 0xffb19cda:
				cuadrosCatalogo[i] = Cuadro.PARED_TRES;
				continue;
			case 0xffede8f8:
				cuadrosCatalogo[i] = Cuadro.FLOR;
				continue;
			case 0xff4580d2:
				cuadrosCatalogo[i] = Cuadro.TECHO_PARED_UP_IZQ;
				continue;
			case 0xff789ccd:
				cuadrosCatalogo[i] = Cuadro.TECHO_ESQ_UP_IZQ;
				continue;
			case 0xff3857c0:
				cuadrosCatalogo[i] = Cuadro.TECHO_4_5;
				continue;
			case 0xffafdd65:
				cuadrosCatalogo[i] = Cuadro.PASTO_CENTRO;
				continue;
			case 0xff66a600:
				cuadrosCatalogo[i] = Cuadro.ARBUSTO_UP_DER;
				continue;
			case 0xffc6fc70:
				cuadrosCatalogo[i] = Cuadro.ARBUSTO_UP_IZQ;
				continue;
			case 0xff2c4800:
				cuadrosCatalogo[i] = Cuadro.PASTO_CENTRO_ARRIBA;
				continue;
			case 0xff92c87a:
				cuadrosCatalogo[i] = Cuadro.PASTO_HIERBA;
				continue;
			case 0xffce6dd2:
				cuadrosCatalogo[i] = Cuadro.TECHO_2_1;
				continue;
			case 0xFF64bb6a:
				cuadrosCatalogo[i] = Cuadro.TIERRA_HIERBA_DOS;
				continue;
			case 0xFF11b61c:
				cuadrosCatalogo[i] = Cuadro.CAMINO_IZQ;
				continue;
			case 0xFF7fb81f:
				cuadrosCatalogo[i] = Cuadro.ARBUSTO_DOWN_DER;
				continue;
			case 0xFFa8c873:
				cuadrosCatalogo[i] = Cuadro.ARBUSTO_DOWN_IZQ;
				continue;
			case 0xFF829c59:
				cuadrosCatalogo[i] = Cuadro.PASTO_CENTRO_ABAJO;
				continue;
			case 0xFF8ebd44:
				cuadrosCatalogo[i] = Cuadro.PASTO_CENTRO_DERECHA;
				continue;
			case 0xFFcde2ad:
				cuadrosCatalogo[i] = Cuadro.PASTO_CENTRO_IZQUIERDA;
				continue;
			case 0xFF758c51:
				cuadrosCatalogo[i] = Cuadro.PASTO;
				continue;
			case 0xFFb0d1ff:
				cuadrosCatalogo[i] = Cuadro.TECHO_UP_UNO;
				continue;
			case 0xFF81a1cd:
				cuadrosCatalogo[i] = Cuadro.TECHO_ESQ_UP_DER;
				continue;
			case 0xFF4872ab:
				cuadrosCatalogo[i] = Cuadro.TECHO_PARED_UP_DER;
				continue;
			case 0xFF334762:
				cuadrosCatalogo[i] = Cuadro.TECHO_3_1;
				continue;
			case 0xFF618dc8:
				cuadrosCatalogo[i] = Cuadro.TECHO_3_2;
				continue;
			case 0xFF1a519c:
				cuadrosCatalogo[i] = Cuadro.TECHO_3_3;
				continue;
			case 0xFFc3cedd:
				cuadrosCatalogo[i] = Cuadro.TECHO_3_5;
				continue;
			case 0xFF91b2df:
				cuadrosCatalogo[i] = Cuadro.TECHO_3_6;
				continue;
			case 0xFF3d59b6:
				cuadrosCatalogo[i] = Cuadro.TECHO_4_2;
				continue;
			case 0xFF72788c:
				cuadrosCatalogo[i] = Cuadro.TECHO_4_3;
				continue;
			case 0xFFf1a2f4:
				cuadrosCatalogo[i] = Cuadro.TECHO_2_2;
				continue;
			case 0xFF945296:
				cuadrosCatalogo[i] = Cuadro.TECHO_2_3;
				continue;
			case 0xFFe976ec:
				cuadrosCatalogo[i] = Cuadro.TECHO_2_5;
				continue;
			case 0xFF8051a3:
				cuadrosCatalogo[i] = Cuadro.TECHO_2_6;
				continue;
			case 0xFFfbff00:
				cuadrosCatalogo[i] = Cuadro.VALLA_CENTRO_DERECHA;
				continue;
			case 0xFFe5aecb:
				cuadrosCatalogo[i] = Cuadro.VALLA_CENTRO_ABAJO;
				continue;
			case 0xFF002333:
				cuadrosCatalogo[i] = Cuadro.VALLA_ESQUINA_IZQUIERDA_ABAJO;
				continue;
			case 0xFFa73d03:
				cuadrosCatalogo[i] = Cuadro.VALLA_ESQUINA_DERECHA_ABAJO;
				continue;
			case 0xFFc26c6e:
				cuadrosCatalogo[i] = Cuadro.VALLA_ESQUINA_DERECHA_ARRIBA;
				continue;
			case 0xFFe47410:
				cuadrosCatalogo[i] = Cuadro.VALLA_ESQUINA_IZQUIERDA_ARRIBA;
				continue;
			case 0xFF6a6a6a:
				cuadrosCatalogo[i] = Cuadro.ARBOL_BOLITA_ESQUINA_IZQUIERDA_ARRIBA;
				continue;
			case 0xFF18b44e:
				cuadrosCatalogo[i] = Cuadro.ARBOL_BOLITA_ESQUINA_DERECHA_ARRIBA;
				continue;
			case 0xFFd95d2b:
				cuadrosCatalogo[i] = Cuadro.ARBOL_BOLITA_MIITAD_IZQUIERDA;
				continue;
			case 0xFFa0a0a0:
				cuadrosCatalogo[i] = Cuadro.ARBOL_BOLITA_MIITAD_DERECHA;
				continue;
			case 0xFF62412d:
				cuadrosCatalogo[i] = Cuadro.ARBOL_BOLITA_ESQUINA_IZQUIERDA_ABAJO;
				continue;
			case 0xFFe0c943:
				cuadrosCatalogo[i] = Cuadro.ARBOL_BOLITA_ESQUINA_DERECHA_ABAJO;
				continue;
			case 0xFFcd3e96:
				cuadrosCatalogo[i] = Cuadro.PARADO_UNO;
				continue;
			case 0xFF5d4581:
				cuadrosCatalogo[i] = Cuadro.PARADO_DOS;
				continue;
			case 0xFF641d2b:
				cuadrosCatalogo[i] = Cuadro.PARADO_TRES;
				continue;

			default:
				cuadrosCatalogo[i] = Cuadro.VACIO;

			}

		}
	}

}