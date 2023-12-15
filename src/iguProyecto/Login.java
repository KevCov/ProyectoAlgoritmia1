package iguProyecto;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtUsuario;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JPasswordField txtPassword;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("INICIO DE SESION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("LOGIN");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel.setBounds(178, 10, 79, 35);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("USUARIO:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(14, 55, 120, 27);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setBorder(null);
			txtUsuario.setBounds(144, 56, 193, 27);
			contentPane.add(txtUsuario);
			txtUsuario.setColumns(10);
		}
		{
			btnIngresar = new JButton("Ingresar");
			btnIngresar.setBorder(null);
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnIngresarActionPerformed(e);
				}
			});
			btnIngresar.setBackground(Color.LIGHT_GRAY);
			btnIngresar.setBounds(105, 161, 91, 21);
			contentPane.add(btnIngresar);
		}
		{
			btnSalir = new JButton("Salir");
			btnSalir.setBorder(null);
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnSalirActionPerformed(e);
				}
			});
			btnSalir.setBackground(Color.LIGHT_GRAY);
			btnSalir.setBounds(246, 161, 91, 21);
			contentPane.add(btnSalir);
		}
		{
			txtPassword = new JPasswordField();
			txtPassword.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					txtPasswordKeyPressed(e);
				}
			});
			txtPassword.setBorder(null);
			txtPassword.setBounds(143, 108, 194, 27);
			contentPane.add(txtPassword);
		}
		{
			lblNewLabel_2 = new JLabel("CONTRASEÑA:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2.setBounds(14, 107, 120, 27);
			contentPane.add(lblNewLabel_2);
		}
	}
	
	//EVENTO QUE VERIFICA EL USUARIO Y PASSWORD USANDO EL BOTON INGRESAR
	protected void btnIngresarActionPerformed(ActionEvent e) {
		
		//OBTIENE LOS DATOS INGRESADOS
		String usuario = txtUsuario.getText();
		String password = txtPassword.getText();
		
		if (usuario.equals("Admin") && password.equals("1234")) {
			//CIERRA LA VENTANA DE LOGIN
			Login.this.dispose();
			//MUESTRA UN MENSAJE DE BIENVENIDA
			JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Ingreso correcto", JOptionPane.INFORMATION_MESSAGE);
			//INSTANCIA A LA CLASE MENU PRINCIPAL, LO HACE VISIBLE Y CENTRA
			MenuPrincipal abrir = new MenuPrincipal();
			abrir.setVisible(true);
			abrir.setLocationRelativeTo(null);
		} else {
			//MUESTRA UN MENSAJE DE DATOS INCORRECTOS
			JOptionPane.showMessageDialog(null,"USUARIO Y CONTRASEÑA INCORRECTOS", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			txtUsuario.setText("");
			txtPassword.setText("");
			txtUsuario.requestFocus();
		}
	}
	
	//EVENTO QUE VERIFICA EL USUARIO Y PASSWORD USANDO LA TECLA "ENTER" EN LA CAJA TXT PASSWORD
	protected void txtPasswordKeyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER){ //VERIFICA QUE EL BOTON APRETADO SEA EL "ENTER"
			//OBTIENE LOS DATOS INGRESADOS
			String usuario = txtUsuario.getText();
			String password = txtPassword.getText();
			
			if (usuario.equals("Admin") && password.equals("1234")) {
				//CIERRA LA VENTANA DE LOGIN
				Login.this.dispose();
				//MUESTRA UN MENSAJE DE BIENVENIDA
				JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Ingreso correcto", JOptionPane.INFORMATION_MESSAGE);
				MenuPrincipal abrir = new MenuPrincipal();
				abrir.setVisible(true);
				abrir.setLocationRelativeTo(null);
			} else {
				//MUESTRA UN MENSAJE DE DATOS INCORRECTOS
				JOptionPane.showMessageDialog(null,"USUARIO Y CONTRASEÑA INCORRECTOS", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				txtUsuario.setText("");
				txtPassword.setText("");
				txtUsuario.requestFocus();
			}
		}
	}
	
	//EVENTO QUE SALE DEL PROGRAMA
	protected void btnSalirActionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
