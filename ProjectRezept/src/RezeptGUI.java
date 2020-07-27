import java.awt.*;

import javax.swing.*;


@SuppressWarnings("serial")
public class RezeptGUI extends JFrame {
	
	private JTextField fieldSuchleiste;
	private JLabel labelRezeptliste;
	private JList<String> listRezepte;
	
	private String suchleistenString;
	
	GridBagConstraints c = new GridBagConstraints();
	
	public RezeptGUI (String titel) {
		
		setTitle(titel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		
		
		
		setSize(1300,900);
		setResizable(false);
		
		initComponents();
		
		add(fieldSuchleiste,c);
		add(labelRezeptliste,c);
		add(listRezepte,c);
		
		fieldSuchleiste.setLocation(400, 500);
		labelRezeptliste.setLocation(50,150);
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	private void initComponents() {
		
		fieldSuchleiste = new JTextField(16);	
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		labelRezeptliste = new JLabel("Rezeptliste");
		c.gridx = 0;
		c.gridy = 1;
		listRezepte = new JList<String>();
		c.gridx = 0;
		c.gridy = 2;
	}
	

}
