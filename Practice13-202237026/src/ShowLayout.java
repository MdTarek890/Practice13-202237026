	import java. awt.*;
	import javax.swing.*;

public class ShowLayout extends JFrame {
		PanelGridLayout pannelGrid;
		PanelNullLayout panelNull;
		JTabbedPane p;
		ShowLayout () {
		pannelGrid = new PanelGridLayout ();
		panelNull=new PanelNullLayout();
		p= new JTabbedPane();
		p. add("Grid Layout Panel" ,pannelGrid);
		p. add("Null layout panel ",panelNull);
		add (p, BorderLayout.CENTER);
		add(new JButton("Using BorderLayout for Frame"),BorderLayout. NORTH);
		add (new JButton ("south"),BorderLayout.SOUTH);
		add (new JButton ("west"), BorderLayout.WEST);
		add (new JButton("east"),BorderLayout.EAST);
		setBounds(10, 10, 570,390);
		setVisible(true);
		setDefaultCloseOperation (JFrame. DISPOSE_ON_CLOSE);
		validate();
	}

}
