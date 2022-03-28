package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_01.Docente;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_1_1 extends JFrame implements ActionListener {
	
		
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1_1 frame = new Problema_1_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_1_1() {
		setTitle("Problema_1_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	
	// Código del boton procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		// Declare y cree un objeto de tipo Docente
		// d1 es el objeto creado a partir de la clase Docente
		Docente d1 = new Docente();
		
		// Ingresas datos fijos
		d1.codigo = 1000;
		d1.nombre = "Now";
		d1.horasTrabajadas = 30;
		d1.tarifaHoraria = 50;
		//Visualice todos sus datos
		
		imprimir("Código: " + d1.codigo);
		imprimir("Nombre: " + d1.nombre);
		imprimir("Horas: " + d1.horasTrabajadas);
		imprimir("Tarifa: " + d1.tarifaHoraria);
		
		imprimir("S.Bruto: " + d1.sueldoBruto());
		imprimir("Descuento: " + d1.descuento());
		imprimir("Sueldo Neto: " + d1.sueldoNeto());
		
		
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}