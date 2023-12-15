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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JSeparator;

public class AcercaDeTienda extends JFrame {

	private JPanel contentPane;
	private JButton BtnLimpiar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaDeTienda frame = new AcercaDeTienda();
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
	public AcercaDeTienda() {
		setTitle("Acerca de Tienda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		{
			BtnLimpiar = new JButton("Cancelar");
			BtnLimpiar.setBorder(null);
			BtnLimpiar.setBackground(Color.LIGHT_GRAY);
			BtnLimpiar.setBounds(215, 240, 89, 23);
			BtnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnNewButton_1(e);
				}
			});
			contentPane.setLayout(null);
			BtnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 13));
			contentPane.add(BtnLimpiar);
		}
		{
			lblNewLabel = new JLabel("Angie Giamille Garcia Ruiz");
			lblNewLabel.setBounds(141, 93, 271, 19);
			lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 16));
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Kevin Victor Cordova Aquije");
			lblNewLabel_1.setBounds(141, 142, 271, 19);
			lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 16));
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Diego Alonso Bernal Pando");
			lblNewLabel_2.setBounds(141, 187, 271, 19);
			lblNewLabel_2.setFont(new Font("Consolas", Font.PLAIN, 16));
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_4 = new JLabel("FERTILAB");
			lblNewLabel_4.setForeground(new Color(47, 79, 79));
			lblNewLabel_4.setBounds(215, 10, 116, 20);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("Autores");
			lblNewLabel_5.setBounds(215, 43, 89, 20);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
			contentPane.add(lblNewLabel_5);
		}
		{
			separator = new JSeparator();
			separator.setBackground(Color.BLACK);
			separator.setBounds(86, 40, 371, 11);
			contentPane.add(separator);
		}
	}
	//Boton Cancelar
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		this.dispose();
	}
}
