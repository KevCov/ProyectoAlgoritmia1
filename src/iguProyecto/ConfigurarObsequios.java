package iguProyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConfigurarObsequios extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtObsequio;
	private JTextField txtCantObsequio1;
	private JTextField txtCantObsequio2;
	private JTextField txtCantObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	//INSTANCIANDO A LA CLASE VARIABLES GLOBALES
	VariablesGlobales dato = new VariablesGlobales();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequios frame = new ConfigurarObsequios();
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
	public ConfigurarObsequios() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
		setTitle("Configurar Obsequios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Tipo de Obsequio");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(10, 31, 136, 17);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("1 a 5 unidades");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(10, 81, 97, 17);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("6 a 10 unidades");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(10, 128, 105, 17);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("11 a m\u00E1s unidades");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(10, 180, 120, 17);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtObsequio = new JTextField();
			txtObsequio.setBounds(178, 31, 86, 20);
			contentPane.add(txtObsequio);
			txtObsequio.setColumns(10);
		}
		{
			txtCantObsequio1 = new JTextField();
			txtCantObsequio1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtCantObsequio1KeyTyped(e);
				}
			});
			txtCantObsequio1.setBounds(178, 81, 86, 20);
			contentPane.add(txtCantObsequio1);
			txtCantObsequio1.setColumns(10);
		}
		{
			txtCantObsequio2 = new JTextField();
			txtCantObsequio2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtCantObsequio2KeyTyped(e);
				}
			});
			txtCantObsequio2.setBounds(178, 128, 86, 20);
			contentPane.add(txtCantObsequio2);
			txtCantObsequio2.setColumns(10);
		}
		{
			txtCantObsequio3 = new JTextField();
			txtCantObsequio3.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtCantObsequio3KeyTyped(e);
				}
			});
			txtCantObsequio3.setBounds(178, 180, 86, 20);
			contentPane.add(txtCantObsequio3);
			txtCantObsequio3.setColumns(10);
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
			btnAceptar.setBounds(341, 30, 89, 17);
			contentPane.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBackground(Color.LIGHT_GRAY);
			btnCancelar.setBorder(null);
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnCancelar(e);
				}
			});
			btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCancelar.setBounds(341, 56, 89, 17);
			contentPane.add(btnCancelar);
		}
	}
	
	protected void btnAceptarActionPerformed(ActionEvent e) {
		dato.obsequio = txtObsequio.getText();
		dato.obsequio1 = Integer.parseInt(txtCantObsequio1.getText());
		dato.obsequio2 = Integer.parseInt(txtCantObsequio2.getText());
		dato.obsequio3 = Integer.parseInt(txtCantObsequio3.getText());
		this.dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.dispose();
	}
	
	//Metodo que muestra los valores actuales
	protected void thisWindowOpened(WindowEvent e) {
		txtObsequio.setText("" + dato.obsequio);
		txtCantObsequio1.setText("" + dato.obsequio1);
		txtCantObsequio2.setText("" + dato.obsequio2);
		txtCantObsequio3.setText("" + dato.obsequio3);
	}
	
	//Metodos que validan que el ingreso de teclas sean validos
	protected void txtCantObsequio1KeyTyped(KeyEvent e) {
		validarEntero(getKeyEvent(e), e);
	}
	protected void txtCantObsequio2KeyTyped(KeyEvent e) {
		validarEntero(getKeyEvent(e), e);
	}
	protected void txtCantObsequio3KeyTyped(KeyEvent e) {
		validarEntero(getKeyEvent(e), e);
	}
	
	
	//Metodo que obtiene la tecla 
	public char getKeyEvent(KeyEvent e) {
		char letra = e.getKeyChar();
		return letra;
	}
	public void validarEntero(char letra, KeyEvent e) {
		if ((letra < '0' || letra > '9') && letra != KeyEvent.VK_BACK_SPACE) {
			e.consume();
		}
	}
}
