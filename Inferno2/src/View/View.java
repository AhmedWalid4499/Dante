package View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.PopupFactory;

import Infenro1.SinDemon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import com.sun.prism.Image;
public class View extends JFrame implements ActionListener{
	private JFrame f;
	private JButton b;
	private JFrame r;
	private JButton a;
	private JButton c;
	private JButton d;
	public  View() throws Exception{
		gui();

	}
	public void gui() throws Exception{	
		f = new JFrame("Dante's Inferno");
		f.setVisible(true);
		f.setExtendedState(f.MAXIMIZED_BOTH);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton b = new JButton("Abonden all hope behind, yee who enter here!");
		JPanel p = new JPanel();
		b.setActionCommand("yEE");
		b.addActionListener(this);
		p.setBackground(Color.CYAN);
		f.add(p);
		p.add(b);
	 r = new JFrame("Get Ready for hell");
		r.setVisible(false);
		 a = new JButton("14");
		 c = new JButton("13");
		 d = new JButton("15");
		JTextPane pane = new JTextPane();
		a.setActionCommand("a");
		a.addActionListener(this);
		c.setActionCommand("c");
		c.addActionListener(this);
		d.setActionCommand("d");
		d.addActionListener(this);
		JPanel y = new JPanel();
		y.add(a);
		y.add(c);
		y.add(d);
		y.add(pane);
		r.add(y);
	}
	public static void main(String [] args) throws Exception{
		View v = new View();
	}
	@Override
	public void actionPerformed(ActionEvent bttn) {
		if(bttn.getActionCommand()=="yEE"){
			f.setVisible(false);
			r.setVisible(true);
			r.setVisible(true);
			r.setExtendedState(f.MAXIMIZED_BOTH);
			r.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		if(bttn.getActionCommand() == "a"){
		}

	}

}
