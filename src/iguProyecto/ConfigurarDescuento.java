package iguProyecto;

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

public class ConfigurarDescuento extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtDescuento1;
	private JTextField txtDescuento2;
	private JTextField txtDescuento3;
	private JTextField txtDescuento4;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
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
					ConfigurarDescuento frame = new ConfigurarDescuento();
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
	public ConfigurarDescuento() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
		setTitle("Configurar porcentajes de Descuento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("1 a 5 unidades");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(10, 31, 120, 17);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("6 a 10 unidades");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(10, 81, 131, 17);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("11 a 15 unidades");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(10, 128, 120, 17);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("M\u00E1s de 15 unidades");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(10, 180, 131, 17);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtDescuento1 = new JTextField();
			txtDescuento1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtDescuento1KeyTyped(e);
				}
			});
			txtDescuento1.setBounds(178, 31, 86, 20);
			contentPane.add(txtDescuento1);
			txtDescuento1.setColumns(10);
		}
		{
			txtDescuento2 = new JTextField();
			txtDescuento2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtDescuento2KeyTyped(e);
				}
			});
			txtDescuento2.setBounds(178, 81, 86, 20);
			contentPane.add(txtDescuento2);
			txtDescuento2.setColumns(10);
		}
		{
			txtDescuento3 = new JTextField();
			txtDescuento3.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtDescuento3KeyTyped(e);
				}
			});
			txtDescuento3.setBounds(178, 128, 86, 20);
			contentPane.add(txtDescuento3);
			txtDescuento3.setColumns(10);
		}
		{
			txtDescuento4 = new JTextField();
			txtDescuento4.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtDescuento4KeyTyped(e);
				}
			});
			txtDescuento4.setBounds(178, 180, 86, 20);
			contentPane.add(txtDescuento4);
			txtDescuento4.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("%");
			lblNewLabel_4.setBounds(274, 34, 46, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(274, 84, 46, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("%");
			lblNewLabel_6.setBounds(274, 131, 46, 14);
			contentPane.add(lblNewLabel_6);
		}
		{
			lblNewLabel_7 = new JLabel("%");
			lblNewLabel_7.setBounds(274, 180, 46, 14);
			contentPane.add(lblNewLabel_7);
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
		dato.descuento1 = Double.parseDouble(txtDescuento1.getText());
		dato.descuento2 = Double.parseDouble(txtDescuento2.getText());
		dato.descuento3 = Double.parseDouble(txtDescuento3.getText());
		dato.descuento4 = Double.parseDouble(txtDescuento4.getText());
		this.dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.dispose();
	}
	
	//Metodo que muestra los valores actuales
	protected void thisWindowOpened(WindowEvent e) {
		txtDescuento1.setText("" + dato.descuento1);
		txtDescuento2.setText("" + dato.descuento2);
		txtDescuento3.setText("" + dato.descuento3);
		txtDescuento4.setText("" + dato.descuento4);
	}
	
	//Metodos que validan que el ingreso de teclas sean validos
	protected void txtDescuento1KeyTyped(KeyEvent e) {
		validarDouble(getKeyEvent(e),e);
	}
	protected void txtDescuento2KeyTyped(KeyEvent e) {
		validarDouble(getKeyEvent(e),e);
	}
	protected void txtDescuento3KeyTyped(KeyEvent e) {
		validarDouble(getKeyEvent(e),e);
	}
	protected void txtDescuento4KeyTyped(KeyEvent e) {
		validarDouble(getKeyEvent(e),e);
	}
	
	//Metodo que obtiene la tecla 
	public char getKeyEvent(KeyEvent e) {
		char letra = e.getKeyChar();
		return letra;
	}
	public void validarDouble(char letra, KeyEvent e) {
		if ((letra < '0' || letra > '9') && letra != KeyEvent.VK_BACK_SPACE && letra != '.') {
			e.consume();
		}
	}
}
