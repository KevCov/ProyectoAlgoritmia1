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

public class ConfigurarCuotaDiaria extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField txtCuotaDiaria;
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
					ConfigurarCuotaDiaria frame = new ConfigurarCuotaDiaria();
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
	public ConfigurarCuotaDiaria() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
		setTitle("Configurar Cuota Diaria");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 128);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel_1 = new JLabel("Cuota diaria esperada(/S.)");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(10, 37, 187, 17);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCuotaDiaria = new JTextField();
			txtCuotaDiaria.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtCuotaDiariaKeyTyped(e);
				}
			});
			txtCuotaDiaria.setBounds(207, 38, 86, 20);
			contentPane.add(txtCuotaDiaria);
			txtCuotaDiaria.setColumns(10);
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
			btnAceptar.setBounds(341, 24, 89, 17);
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
			btnCancelar.setBounds(341, 51, 89, 17);
			contentPane.add(btnCancelar);
		}
	}
	protected void btnAceptarActionPerformed(ActionEvent e) {
		dato.cuotaDiaria = Double.parseDouble(txtCuotaDiaria.getText());
		this.dispose();
	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
		this.dispose();
	}
	
	//Metodo que muestra los valores actuales
	protected void thisWindowOpened(WindowEvent e) {
		txtCuotaDiaria.setText("" + dato.cuotaDiaria);
	}
	
	//Metodos que validan que el ingreso de teclas sean validos
	protected void txtCuotaDiariaKeyTyped(KeyEvent e) {
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
