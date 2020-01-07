package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

/*
 * Anzeige für die Anwendung
 * es können arithmetische Ausdrücke eingegeben und ausgewertet werden
 */
public class View extends JFrame {
	private JButton auswertungsButton;
	private JButton syntaxPruefenButton;
	private JTextArea fehlerTextfeld;
	private JTextArea auswertTextfeld;
	private JTextArea ausdruckEingebenTextFeld;

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public View() {
		setTitle("Bearbeitung arithmetischer Ausdr\u00FCcke");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Textfeld für die Eingabe arithmetischer Ausdrücke
		this.ausdruckEingebenTextFeld = new JTextArea();
		ausdruckEingebenTextFeld.setBounds(299, 31, 282, 37);
		contentPane.add(ausdruckEingebenTextFeld);
		
		JLabel lblNewLabel = new JLabel("Ausdruck eingeben");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(75, 31, 156, 37);
		contentPane.add(lblNewLabel);
		
		// Textfeld um ermittelte Werte auszurechnen
		this.auswertTextfeld = new JTextArea();
		auswertTextfeld.setBounds(299, 153, 282, 37);
		contentPane.add(auswertTextfeld);
		
		// Button um arithmetische Ausdrücke auszuwerten
		this.auswertungsButton = new JButton("Auswertung");
		auswertungsButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		auswertungsButton.setBounds(75, 153, 165, 37);
		contentPane.add(auswertungsButton);
		
		// Button um die Syntax eingegebener arithmetischer Ausdrücke zu prüfen
		this.syntaxPruefenButton = new JButton("Syntax pr\u00FCfen");
		syntaxPruefenButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		syntaxPruefenButton.setBounds(75, 266, 165, 37);
		contentPane.add(syntaxPruefenButton);
		
		// Textfeld um Fehler darstellen
		this.fehlerTextfeld = new JTextArea();
		fehlerTextfeld.setBounds(75, 392, 506, 37);
		contentPane.add(fehlerTextfeld);
		
	}
	
	// getter für Auswertbutton
	public JButton getauswertButton() {
		return this.auswertungsButton;
	}
	
	// getter für Syntaxbutton
	public JButton getSyntaxButton() {
		return this.syntaxPruefenButton;
	}
	
	// getter für Fehler Textfeld
	public JTextArea getFehlerTextfeld() {
		return this.fehlerTextfeld;
	}
	
	// getter für Auswert Textfeld
	public JTextArea getAuswertfeld() {
		return this.auswertTextfeld;
	}
	
	// getter für Ausdruck eingeben Textfeld
	public JTextArea getAusdruckEingebenTextfeld() {
		return this.ausdruckEingebenTextFeld;
	}
}
