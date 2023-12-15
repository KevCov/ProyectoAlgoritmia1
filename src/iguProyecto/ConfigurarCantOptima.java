package iguProyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConfigurarCantOptima extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField txtCantidadOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	//INSTANCIANDO A LA CLASE VARIABLESGLOBALES
	VariablesGlobales dato = new VariablesGlobales();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCantOptima frame = new ConfigurarCantOptima();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConfigurarCantOptima() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
		setTitle("Configurar Cantidad Optima");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 128);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel_1 = new JLabel("6 a 10 unidades");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(10, 37, 119, 17);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCantidadOptima = new JTextField();
			txtCantidadOptima.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtCantidadOptimaKeyTyped(e);
				}
			});
			txtCantidadOptima.setBounds(150, 37, 86, 20);
			contentPane.add(txtCantidadOptima);
			txtCantidadOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBackground(Color.LIGHT_GRAY);
			btnAceptar.setBorder(null);
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnAceptarActionPerformed(e);
				}
			});
			btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAceptar.setBounds(341, 22, 89, 17);
			contentPane.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBackground(Color.LIGHT_GRAY);
			btnCancelar.setBorder(null);
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnCancelarActionPerformed(e);
				}
			});
			btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCancelar.setBounds(341, 49, 89, 17);
			contentPane.add(btnCancelar);
		}
	}
	//EVENTO PARA EL BOTON ACEPTAR
	protected void btnAceptarActionPerformed(ActionEvent e) {
		dato.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());
		this.dispose();
	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
		this.dispose();
	}
	
	//Metodo que muestra los valores actuales al abrir la ventana
	protected void thisWindowOpened(WindowEvent e) {
		txtCantidadOptima.setText("" + dato.cantidadOptima);
	}
	
	//Metodos que validan que el ingreso de teclas sean validos
	protected void txtCantidadOptimaKeyTyped(KeyEvent e) {
		validarEntero(getKeyEvent(e), e);
	}
	
	//Metodo que obtiene la tecla 
	public char getKeyEvent(KeyEvent e) {
		char letra = e.getKeyChar(); //A
		return letra;
	}
	public void validarEntero(char letra, KeyEvent e) {
		if ((letra < '0' || letra > '9') && letra != KeyEvent.VK_BACK_SPACE) {
			e.consume();  
		}
	}
}
