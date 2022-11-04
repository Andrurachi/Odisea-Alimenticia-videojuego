package interfazusuario;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

import control.Teclado;
import entes.criaturas.Jugador;

public class Recetas extends JPanel {

	private Teclado teclado;
	private Jugador jugador;

	static BufferedImage image;
	public static Boolean imageLoaded;

	// The ImageObserver implementation to observe loading of the image
	ImageObserver myImageObserver = new ImageObserver() {
		public boolean imageUpdate(Image image, int flags, int x, int y, int width, int height) {

			if ((flags & ALLBITS) != 0) {
				imageLoaded = true;
				System.out.println("Image loading finished!");
				return false;
			}
			return true;
		}
	};

	// The image URL - change to where your image file is located!

	String imageURL1 = "Recursos/recetas/receta1.png";
	String imageURL2 = "Recursos/recetas/receta2.png";
	String imageURL3 = "Recursos/recetas/receta3.png";
	String imageURL0 = "Recursos/mapas/prueba2.png";

	Image sourceImage1 = Toolkit.getDefaultToolkit().getImage(imageURL1);
	Image sourceImage2 = Toolkit.getDefaultToolkit().getImage(imageURL2);
	Image sourceImage3 = Toolkit.getDefaultToolkit().getImage(imageURL3);
	Image sourceImage0 = Toolkit.getDefaultToolkit().getImage(imageURL0);

	public void paint(Graphics g) {
		// Retrieve the graphics context; this object is used to paint shapes
		Graphics2D g2d = (Graphics2D) g;

		/**
		 * Draw an Image object The coordinate system of a graphics context is such that
		 * the origin is at the northwest corner and x-axis increases toward the right
		 * while the y-axis increases toward the bottom.
		 */
		int x = 0;
		int y = 0;
		g2d.drawImage(image, x, y, this);

	}

	public Recetas(Teclado teclado) {
		this.teclado = teclado;
	}

	public void dibujarReceta(Graphics g, int numero_receta) {

		while (numero_receta == 4) {
			g.drawImage(sourceImage0, 75, 40, null);
			g.dispose();
			break;
		}
		while (numero_receta == 1) {
			g.drawImage(sourceImage1, 200, 200, null);
			g.dispose();
			break;
		}
		while (numero_receta == 2) {
			g.drawImage(sourceImage2, 200, 200, null);
			g.dispose();
			break;
		}
		while (numero_receta == 3) {
			g.drawImage(sourceImage3, 200, 200, null);
			g.dispose();
			break;
		}

//		g.setColor(new Color(185, 207, 255, 255));
//		g.fillRect(0, 600 - 100, 600, 100);
//		g.setColor(new Color(92, 153, 138, 255));
//		g.fillRect(0, 600 - 100, 600, 10);
//		g.fillRect(0, 600 - 10, 600, 100);
//		g.setColor(new Color(92, 153, 138, 255));
//		g.fillRect(80, 600 - 80, 60, 60);
//		g.fillRect(460, 600 - 80, 60, 60);
//		g.fillRect(270, 600 - 80, 60, 60);
//		g.setColor(new Color(255, 153, 138, 50));
//		g.fillRect(85, 600 - 75, 50, 50);
//		g.fillRect(465, 600 - 75, 50, 50);
//		g.fillRect(275, 600 - 75, 50, 50);

	}

	public void mostrar(final Graphics g, int numero_receta) {
		dibujarReceta(g, numero_receta);
	}

}