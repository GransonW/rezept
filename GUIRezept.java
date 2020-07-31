import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.JTextComponent;

import java.util.ArrayList;
import java.util.List;




public class GUIRezept extends JFrame {
  
    private JTextField textSuchen;
    private JButton buttonSuchen;
    private JButton buttonNeu;
    private JList listRezepte ;
      private DefaultListModel listRezepteModel;
      private JScrollPane listRezepteScrollPane;
    private JLabel labelKochrezepte;
    private JTextArea textBeschreibung;
      private JScrollPane textBeschreibungScrollPane ;
    private JList listZutaten;
      private DefaultListModel listZutatenModel ;
      private JScrollPane listZutatenScrollPane ;
  
  
  public GUIRezept() { 
	  
    super();
    
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    int frameWidth = 896; 
    int frameHeight = 665;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUIRezept");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    
    //Objekte und Array
    Rezept rezept1 = new Rezept("Spaghetti");
	Rezept rezept2 = new Rezept("Pelmeni");
	Rezept rezept3 = new Rezept("Manti");
	Rezept rezept4 = new Rezept("Tscheburek");
	Rezept rezept5 = new Rezept("Pizza");
	
	Zutat zutat1 = new Zutat("Mehl");
	
	rezept1.setZutat(zutat1);
	rezept1.setBeschreibung("Herzhafte Spaghetti");
	rezept2.setBeschreibung("Nice Pelmeni");
	
	
	ArrayList<Rezept> arrRezepte = new ArrayList<Rezept>();
	arrRezepte.add(rezept1);
	arrRezepte.add(rezept2);
	arrRezepte.add(rezept3);
	arrRezepte.add(rezept4);
	arrRezepte.add(rezept5);
	
	
	Object[] rez = arrRezepte.toArray();
	
	listRezepte = new JList(rez);

	
	JScrollPane listRezepteScrollPane = new JScrollPane(listRezepte);

	
	 textBeschreibung = new JTextArea(((Rezept) rez[0]).getBeschreibung());
	 textBeschreibungScrollPane = new JScrollPane(textBeschreibung);
	 

	 
	
	MouseListener mouseListener = new MouseAdapter() {
	     public void mouseClicked(MouseEvent e) {
	         if (e.getClickCount() == 2) {
	        	 
	             int index = listRezepte.locationToIndex(e.getPoint());
	             System.out.println(index);
	        	//listRezepte.getSelectedValue();
	        	textBeschreibung.setText(((Rezept) rez[index]).getBeschreibung());
	             //System.out.println("Double clicked on Item " + index);
	          }
	     }
	 };
	 listRezepte.addMouseListener(mouseListener);
	
    
    initComponents();
    
  
    textSuchen.setBounds(40, 127, 214, 20);
    cp.add(textSuchen);
    buttonSuchen.setBounds(273, 125, 75, 25);
    buttonSuchen.setText("Suchen");
    buttonSuchen.setMargin(new Insets(2, 2, 2, 2));
    buttonSuchen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonSuchen_ActionPerformed(evt);
      }
    });
    cp.add(buttonSuchen);
    //listRezepte.setModel(listRezepteModel);
    listRezepteScrollPane.setBounds(40, 171, 342, 396);
    //listRezepte.setBounds(40, 171, 342, 396);
    
    
    buttonNeu.setBounds(360, 125, 90, 25);
    buttonNeu.setText("Erstellen");
    buttonNeu.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			create();
			
		}
	});
    
    
    
    cp.add(buttonNeu);
    
    
    cp.add(listRezepteScrollPane);
    //cp.add(listRezepte);
    labelKochrezepte.setBounds(344, 32, 190, 41);
    labelKochrezepte.setText("Kochrezepte");
    labelKochrezepte.setFont(new Font("Arial Black", Font.BOLD, 26));
    cp.add(labelKochrezepte);
    textBeschreibungScrollPane.setBounds(476, 358, 344, 204);
    cp.add(textBeschreibungScrollPane);
    cp.setBackground(new Color(0xFFC800));

    listZutaten.setModel(listZutatenModel);
    listZutatenScrollPane.setBounds(476, 193, 344, 140);
    listZutaten.addListSelectionListener(new ListSelectionListener() { 
      public void valueChanged(ListSelectionEvent evt) { 
        
      }
    });
    cp.add(listZutatenScrollPane);
   
    
    setVisible(true);
  } 
  //Initialisierung der Komponenten
  void initComponents() {
	  
	   textSuchen = new JTextField();
	   buttonSuchen = new JButton();
	   buttonNeu = new JButton();
	  //listRezepte = new JList();
	    listRezepteModel = new DefaultListModel();
	   // listRezepteScrollPane = new JScrollPane(listRezepte);
	  labelKochrezepte = new JLabel();
	  //textBeschreibung = new JTextArea("");
	  //  textBeschreibungScrollPane = new JScrollPane(textBeschreibung);
	  listZutaten = new JList();
	    listZutatenModel = new DefaultListModel();
	    listZutatenScrollPane = new JScrollPane(listZutaten);
	  
  }
  
  public void create() {
	JPanel panel = new JPanel(new FlowLayout());
	JButton buttonOK = new JButton();
	JTextField fieldName = new JTextField();
	JTextField fieldBeschreibung = new JTextField();

	
	panel.setSize(200, 140);
	panel.add(fieldName);
	panel.add(fieldBeschreibung);
	panel.add(buttonOK);
	String text = JOptionPane.showInputDialog(panel);
	
  } 
  
  
  
  public static void main(String[] args) {
    new GUIRezept();
  } 
  
  public void buttonSuchen_ActionPerformed(ActionEvent evt) {
    
    
  } 
}



  

