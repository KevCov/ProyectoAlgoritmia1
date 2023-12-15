package iguProyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ListaFertilizante extends JFrame {

	private JPanel contentPane;
	private JButton btnCerrarLF;
	private JButton btnListarLF;
	private JTextArea txtResultadoLF;

	// INSTANCIANDO LA CLASE VARIABLESGLOBALES
	VariablesGlobales dato = new VariablesGlobales();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaFertilizante frame = new ListaFertilizante();
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
	public ListaFertilizante() {
		setTitle("Listado de Fertilizantes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 718, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		{
			btnCerrarLF = new JButton("Cerrar");
			btnCerrarLF.setBounds(243, 499, 85, 18);
			btnCerrarLF.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnNewButtonActionPerformed(e);
				}
			});
			contentPane.setLayout(null);
			btnCerrarLF.setBackground(Color.LIGHT_GRAY);
			btnCerrarLF.setBorder(null);
			btnCerrarLF.setFont(new Font("Tahoma", Font.BOLD, 9));
			contentPane.add(btnCerrarLF);
		}
		{
			btnListarLF = new JButton("Listar");
			btnListarLF.setBounds(367, 499, 85, 18);
			btnListarLF.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnListarLFActionPerformed(e);
				}
			});
			btnListarLF.setBackground(Color.LIGHT_GRAY);
			btnListarLF.setBorder(null);
			btnListarLF.setFont(new Font("Tahoma", Font.BOLD, 9));
			contentPane.add(btnListarLF);
		}
		{
			txtResultadoLF = new JTextArea();
			txtResultadoLF.setEditable(false);
			txtResultadoLF.setFont(new Font("Monospaced", Font.PLAIN, 15));
			txtResultadoLF.setLineWrap(true);

			JScrollPane scroll = new JScrollPane(txtResultadoLF, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			scroll.setBounds(10, 23, 684, 466);
			contentPane.add(scroll);
		}
	}

	// EVENTO QUE LISTA LOS DATOS DE LOS FERTILIZANTES
	protected void btnListarLFActionPerformed(ActionEvent e) {
		imprimirDatos();
	}

	public void imprimirDatos() {
		// SE OBTIENE LOS VALORES DE LAS VARIABLESGLOBALES A TRAVES DEL OBJETO DATO
		txtResultadoLF.setText(" LISTADO DE FERTILIZANTES" + "\n");

		txtResultadoLF.append("\n");

		txtResultadoLF.append(" Fertilizante   : " + dato.fertilizante1 + "\n");
		txtResultadoLF.append(" Tipo           : " + dato.tipoFertilizante1 + "\n");
		txtResultadoLF.append(" Precio         : " + dato.precio1 + "\n");
		txtResultadoLF.append(" Peso           : " + dato.peso1 + "\n");
		txtResultadoLF.append(" Apecto         : " + dato.aspecto1 + "\n");
		txtResultadoLF.append(" Composición    : " + dato.composicion1 + "\n");

		txtResultadoLF.append("\n");

		txtResultadoLF.append(" Fertilizante   : " + dato.fertilizante2 + "\n");
		txtResultadoLF.append(" Tipo           : " + dato.tipoFertilizante2 + "\n");
		txtResultadoLF.append(" Precio         : " + dato.precio2 + "\n");
		txtResultadoLF.append(" Peso           : " + dato.peso2 + "\n");
		txtResultadoLF.append(" Apecto         : " + dato.aspecto2 + "\n");
		txtResultadoLF.append(" Composición    : " + dato.composicion2 + "\n");

		txtResultadoLF.append("\n");

		txtResultadoLF.append(" Fertilizante   : " + dato.fertilizante3 + "\n");
		txtResultadoLF.append(" Tipo           : " + dato.tipoFertilizante3 + "\n");
		txtResultadoLF.append(" Precio         : " + dato.precio3 + "\n");
		txtResultadoLF.append(" Peso           : " + dato.peso3 + "\n");
		txtResultadoLF.append(" Apecto         : " + dato.aspecto3 + "\n");
		txtResultadoLF.append(" Composición    : " + dato.composicion3 + "\n");

		txtResultadoLF.append("\n");

		txtResultadoLF.append(" Fertilizante   : " + dato.fertilizante4 + "\n");
		txtResultadoLF.append(" Tipo           : " + dato.tipoFertilizante4 + "\n");
		txtResultadoLF.append(" Precio         : " + dato.precio4 + "\n");
		txtResultadoLF.append(" Peso           : " + dato.peso4 + "\n");
		txtResultadoLF.append(" Apecto         : " + dato.aspecto4 + "\n");
		txtResultadoLF.append(" Composición    : " + dato.composicion4 + "\n");

		txtResultadoLF.append("\n");

		txtResultadoLF.append(" Fertilizante   : " + dato.fertilizante5 + "\n");
		txtResultadoLF.append(" Tipo           : " + dato.tipoFertilizante5 + "\n");
		txtResultadoLF.append(" Precio         : " + dato.precio5 + "\n");
		txtResultadoLF.append(" Peso           : " + dato.peso5 + "\n");
		txtResultadoLF.append(" Apecto         : " + dato.aspecto5 + "\n");
		txtResultadoLF.append(" Composición    : " + dato.composicion5 + "\n");

		txtResultadoLF.append("\n");

		txtResultadoLF.append(" Fertilizante   : " + dato.fertilizante6 + "\n");
		txtResultadoLF.append(" Tipo           : " + dato.tipoFertilizante6 + "\n");
		txtResultadoLF.append(" Precio         : " + dato.precio6 + "\n");
		txtResultadoLF.append(" Peso           : " + dato.peso6 + "\n");
		txtResultadoLF.append(" Apecto         : " + dato.aspecto6 + "\n");
		txtResultadoLF.append(" Composición    : " + dato.composicion6 + "\n");
	}

	// EVENTO QUE CIERRA LA VENTANA
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		this.dispose();
	}
}
