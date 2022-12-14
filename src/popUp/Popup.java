package popUp;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.PopupFactory;
import javax.swing.UIManager;

public class Popup extends JFrame implements ActionListener {
	// popup
	javax.swing.Popup po;

	// frame
	JFrame f;

	// panel
	JPanel p;

	// popupfactory
	PopupFactory pf;

	// constructor
	Popup() {
		// create a frame
		f = new JFrame("pop");

		f.setSize(250, 200);

		pf = new PopupFactory();

		// create a label
		JLabel l = new JLabel("This  is a popup menu");

		// create a new button
		JButton b19 = new JButton("OK");

		// add action listener
		b19.addActionListener(this);

		try {
			// set windows look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}

		// create a panel
		p = new JPanel();

		p.setBackground(Color.blue);

		// create a font
		Font fo = new Font("BOLD", 1, 14);

		l.setFont(fo);

		// add contents to panel
		p.add(l);
		p.add(b19);

		p.setLayout(new GridLayout(2, 1));

		// create a popup
		po = pf.getPopup(f, p, 180, 100);

		// create a button
		JButton b = new JButton("click");

		// add action listener
		b.addActionListener(this);

		// create a panel
		JPanel p1 = new JPanel();

		p1.add(b);
		f.add(p1);
		f.show();
	}

	// if the button is pressed
	public void actionPerformed(ActionEvent e) {
		String d = e.getActionCommand();
		// if ok button is pressed hide the popup
		if (d.equals("OK")) {
			po.hide();

			// create a popup
			po = pf.getPopup(f, p, 180, 100);
		} else
			po.show();
	}

	// main class
	public static void main(String args[]) {
		Popup p = new Popup();
	}
}
