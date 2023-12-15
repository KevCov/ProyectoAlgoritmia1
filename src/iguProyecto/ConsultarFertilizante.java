package iguProyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class ConsultarFertilizante extends JFrame {

	private JPanel contentPane;
	private JComboBox cbxFertilizantes;
	private JTextField txtPrecio;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtPeso;
	private JTextField txtAspecto;
	private JTextField txtComposicion;
	private JButton btnCerrar;
	private JLabel lblNewLabel_5;
	private JTextField txttipoFertilizante;

	// INSTANCIANDO LA CLASE VARIABLESGLOBALES
	VariablesGlobales dato = new VariablesGlobales();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFertilizante frame = new ConsultarFertilizante();
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
	public ConsultarFertilizante() {
		setTitle("Consultar Fertilizante");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			cbxFertilizantes = new JComboBox();
			cbxFertilizantes.setBackground(Color.LIGHT_GRAY);
			cbxFertilizantes.setFont(new Font("Tahoma", Font.PLAIN, 9));
			cbxFertilizantes.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					cbxFertilizantesItemStateChanged(e);
				}
			});
			cbxFertilizantes.setModel(
					new DefaultComboBoxModel(new String[] { "Urea Agricola", "Sulfato de Amonio", "Sulfato de Potasio",
							"Cloruro de Potasio", "Sulfato de Zinc Heptahidratado", "Fosfato Diamónico" }));
			cbxFertilizantes.setSelectedIndex(0);
			cbxFertilizantes.setBounds(96, 28, 226, 17);
			contentPane.add(cbxFertilizantes);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(96, 110, 200, 17);
			contentPane.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Fertilizante");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setBounds(10, 26, 78, 21);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Precio");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_1.setBounds(10, 108, 78, 21);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Peso");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2.setBounds(10, 151, 78, 21);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Aspecto");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_3.setBounds(10, 197, 78, 21);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Composición");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_4.setBounds(10, 242, 78, 21);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtPeso = new JTextField();
			txtPeso.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtPeso.setEditable(false);
			txtPeso.setBounds(96, 153, 200, 17);
			contentPane.add(txtPeso);
			txtPeso.setColumns(10);
		}
		{
			txtAspecto = new JTextField();
			txtAspecto.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtAspecto.setEditable(false);
			txtAspecto.setBounds(96, 199, 200, 17);
			contentPane.add(txtAspecto);
			txtAspecto.setColumns(10);
		}
		{
			txtComposicion = new JTextField();
			txtComposicion.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtComposicion.setEditable(false);
			txtComposicion.setBounds(96, 244, 200, 17);
			contentPane.add(txtComposicion);
			txtComposicion.setColumns(10);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 9));
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnCerrarActionPerformed(e);
				}
			});
			btnCerrar.setBorder(null);
			btnCerrar.setBackground(Color.LIGHT_GRAY);
			btnCerrar.setBounds(369, 28, 78, 17);
			contentPane.add(btnCerrar);
		}
		{
			lblNewLabel_5 = new JLabel("Tipo");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_5.setBounds(10, 63, 78, 21);
			contentPane.add(lblNewLabel_5);
		}
		{
			txttipoFertilizante = new JTextField();
			txttipoFertilizante.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txttipoFertilizante.setEditable(false);
			txttipoFertilizante.setColumns(10);
			txttipoFertilizante.setBounds(96, 65, 200, 17);
			contentPane.add(txttipoFertilizante);
		}
	}

	// Evento al abrir la ventana, muestra los datos del primer item en el cbx.
	protected void thisWindowOpened(WindowEvent e) {
		abrirVentanaInfo(indiceCbx());
	}

	// Evento que muestra los datos del item seleccionado en el cbx.
	protected void cbxFertilizantesItemStateChanged(ItemEvent e) {
		muestraInfo(indiceCbx());
	}

	// EVENTO QUE CIERRA LA VENTANA
	protected void btnCerrarActionPerformed(ActionEvent e) {
		this.dispose();
	}

	public int indiceCbx() {
		int indice = cbxFertilizantes.getSelectedIndex();
		return indice;
	}

	public void abrirVentanaInfo(int indice) {
		// Establece los datos en la cajas de txt para ser visualizados.
		if (indice == 0) {
			txttipoFertilizante.setText(dato.tipoFertilizante1);
			txtPrecio.setText(String.valueOf(dato.precio1));
			txtPeso.setText(String.valueOf(dato.peso1));
			txtAspecto.setText(dato.aspecto1);
			txtComposicion.setText(dato.composicion1);
		}
	}

	public void muestraInfo(int indice) {
		// Evalua la coincidencia entre el caso y el valor de la variable item.
		switch (indice) {
		case 0:
			// Se obtienen los valores de las VariablesGlobales a traves del objeto dato.
			// Se establecen en la caja txt para ser visualizado.
			txttipoFertilizante.setText(dato.tipoFertilizante1);
			txtPrecio.setText(String.valueOf(dato.precio1));
			txtPeso.setText(String.valueOf(dato.peso1));
			txtAspecto.setText(dato.aspecto1);
			txtComposicion.setText(dato.composicion1);
			break;
		case 1:
			txttipoFertilizante.setText(dato.tipoFertilizante2);
			txtPrecio.setText(String.valueOf(dato.precio2));
			txtPeso.setText(String.valueOf(dato.peso2));
			txtAspecto.setText(dato.aspecto2);
			txtComposicion.setText(dato.composicion2);
			break;
		case 2:
			txttipoFertilizante.setText(dato.tipoFertilizante3);
			txtPrecio.setText(String.valueOf(dato.precio3));
			txtPeso.setText(String.valueOf(dato.peso3));
			txtAspecto.setText(dato.aspecto3);
			txtComposicion.setText(dato.composicion3);
			break;
		case 3:
			txttipoFertilizante.setText(dato.tipoFertilizante4);
			txtPrecio.setText(String.valueOf(dato.precio4));
			txtPeso.setText(String.valueOf(dato.peso4));
			txtAspecto.setText(dato.aspecto4);
			txtComposicion.setText(dato.composicion4);
			break;
		case 4:
			txttipoFertilizante.setText(dato.tipoFertilizante5);
			txtPrecio.setText(String.valueOf(dato.precio5));
			txtPeso.setText(String.valueOf(dato.peso5));
			txtAspecto.setText(dato.aspecto5);
			txtComposicion.setText(dato.composicion5);
			break;
		case 5:
			txttipoFertilizante.setText(dato.tipoFertilizante6);
			txtPrecio.setText(String.valueOf(dato.precio6));
			txtPeso.setText(String.valueOf(dato.peso6));
			txtAspecto.setText(dato.aspecto6);
			txtComposicion.setText(dato.composicion6);
			break;
		}
	}
}
