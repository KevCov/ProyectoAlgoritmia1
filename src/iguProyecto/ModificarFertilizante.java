package iguProyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ModificarFertilizante extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtPrecio;
	private JTextField txtPeso;
	private JTextField txtAspecto;
	private JTextField txtComposicion;
	private JComboBox cbxFertilizantes;
	private JButton btnCerrar;
	private JButton btnGrabar;
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
					ModificarFertilizante frame = new ModificarFertilizante();
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
	public ModificarFertilizante() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
		setTitle("Modificar Fertilizante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Fertilizantes");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setBounds(10, 25, 80, 21);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Precio");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_1.setBounds(10, 116, 80, 21);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Peso");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2.setBounds(10, 162, 80, 21);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Aspecto");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_3.setBounds(10, 207, 80, 21);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Composicón");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_4.setBounds(10, 247, 80, 21);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtPrecioKeyTyped(e);
				}
			});
			txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtPrecio.setMinimumSize(new Dimension(7, 17));
			txtPrecio.setBounds(122, 117, 200, 17);
			contentPane.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtPeso = new JTextField();
			txtPeso.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtPesoKeyTyped(e);
				}
			});
			txtPeso.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtPeso.setBounds(122, 163, 200, 17);
			contentPane.add(txtPeso);
			txtPeso.setColumns(10);
		}
		{
			txtAspecto = new JTextField();
			txtAspecto.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtAspectoKeyTyped(e);
				}
			});
			txtAspecto.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtAspecto.setBounds(122, 208, 200, 17);
			contentPane.add(txtAspecto);
			txtAspecto.setColumns(10);
		}
		{
			txtComposicion = new JTextField();
			txtComposicion.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txtComposicion.setBounds(122, 248, 200, 17);
			contentPane.add(txtComposicion);
			txtComposicion.setColumns(10);
		}
		{
			cbxFertilizantes = new JComboBox();
			cbxFertilizantes.setBackground(Color.LIGHT_GRAY);
			cbxFertilizantes.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					cbxFertilizantesItemStateChanged(e);
				}
			});
			cbxFertilizantes.setFont(new Font("Tahoma", Font.PLAIN, 9));
			cbxFertilizantes.setModel(
					new DefaultComboBoxModel(new String[] { "Urea Agricola", "Sulfato de Amonio", "Sulfato de Potasio",
							"Cloruro de Potasio", "Sulfato de Zinc Heptahidratado", "Fosfato Diamónico" }));
			cbxFertilizantes.setSelectedIndex(0);
			cbxFertilizantes.setBounds(122, 26, 212, 19);
			contentPane.add(cbxFertilizantes);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnCerrarActionPerformed(e);
				}
			});
			btnCerrar.setBorder(null);
			btnCerrar.setBackground(Color.LIGHT_GRAY);
			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 9));
			btnCerrar.setBounds(383, 26, 85, 19);
			contentPane.add(btnCerrar);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnGrabarActionPerformed(e);
				}
			});
			btnGrabar.setBorder(null);
			btnGrabar.setBackground(Color.LIGHT_GRAY);
			btnGrabar.setFont(new Font("Tahoma", Font.BOLD, 9));
			btnGrabar.setBounds(383, 57, 85, 19);
			contentPane.add(btnGrabar);
		}
		{
			lblNewLabel_5 = new JLabel("Tipo");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_5.setBounds(10, 72, 80, 21);
			contentPane.add(lblNewLabel_5);
		}
		{
			txttipoFertilizante = new JTextField();
			txttipoFertilizante.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txttipoFertilizanteKeyTyped(e);
				}
			});
			txttipoFertilizante.setFont(new Font("Tahoma", Font.PLAIN, 10));
			txttipoFertilizante.setBounds(122, 73, 200, 17);
			contentPane.add(txttipoFertilizante);
			txttipoFertilizante.setColumns(10);
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

	// Evento que obtiene el valor escrito en la caja txt y lo guarda en
	// VariablesGlobales
	protected void btnGrabarActionPerformed(ActionEvent e) {
		grabarInfo(indiceCbx());
	}

	// Evento que cierra la ventana.
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

	public void grabarInfo(int indice) {
		// Evalua la coincidencia entre el caso y el valor de la variable item.
		switch (indice) {
		case 0:
			// Obtiene el valor de la caja txt.
			// Guarda el valor obtenido en las VariablesGlobales a traves del objeto dato.
			dato.tipoFertilizante1 = txttipoFertilizante.getText();
			dato.precio1 = Double.parseDouble(txtPrecio.getText());
			dato.peso1 = Integer.parseInt(txtPeso.getText());
			dato.aspecto1 = txtAspecto.getText();
			dato.composicion1 = txtComposicion.getText();
			break;
		case 1:
			dato.tipoFertilizante2 = txttipoFertilizante.getText();
			dato.precio2 = Double.parseDouble(txtPrecio.getText());
			dato.peso2 = Integer.parseInt(txtPeso.getText());
			dato.aspecto2 = txtAspecto.getText();
			dato.composicion2 = txtComposicion.getText();
			break;
		case 2:
			dato.tipoFertilizante3 = txttipoFertilizante.getText();
			dato.precio3 = Double.parseDouble(txtPrecio.getText());
			dato.peso3 = Integer.parseInt(txtPeso.getText());
			dato.aspecto3 = txtAspecto.getText();
			dato.composicion3 = txtComposicion.getText();
			break;
		case 3:
			dato.tipoFertilizante4 = txttipoFertilizante.getText();
			dato.precio4 = Double.parseDouble(txtPrecio.getText());
			dato.peso4 = Integer.parseInt(txtPeso.getText());
			dato.aspecto4 = txtAspecto.getText();
			dato.composicion4 = txtComposicion.getText();
			break;
		case 4:
			dato.tipoFertilizante5 = txttipoFertilizante.getText();
			dato.precio5 = Double.parseDouble(txtPrecio.getText());
			dato.peso5 = Integer.parseInt(txtPeso.getText());
			dato.aspecto5 = txtAspecto.getText();
			dato.composicion5 = txtComposicion.getText();
			break;
		case 5:
			dato.tipoFertilizante6 = txttipoFertilizante.getText();
			dato.precio6 = Double.parseDouble(txtPrecio.getText());
			dato.peso6 = Integer.parseInt(txtPeso.getText());
			dato.aspecto6 = txtAspecto.getText();
			dato.composicion6 = txtComposicion.getText();
			break;
		}
		this.dispose();
	}
	
	//Metodos que validan que el ingreso de teclas sean validos
	protected void txttipoFertilizanteKeyTyped(KeyEvent e) {		
		validarTexto(getKeyEvent(e), e);
	}
	protected void txtPrecioKeyTyped(KeyEvent e) {
		validarDouble(getKeyEvent(e),e);
	}
	protected void txtPesoKeyTyped(KeyEvent e) {
		validarDouble(getKeyEvent(e),e);
	}
	protected void txtAspectoKeyTyped(KeyEvent e) {
		validarTexto(getKeyEvent(e), e);
	}
	
	
	
	public char getKeyEvent(KeyEvent e) {
		char letra = e.getKeyChar();
		return letra;
	}
	public void validarDouble(char letra, KeyEvent e) {
		if ((letra < '0' || letra > '9') && letra != KeyEvent.VK_BACK_SPACE && letra != '.') {
			e.consume();
		}
	}
	public void validarTexto(char letra, KeyEvent e) {
		if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra >'Z') && letra != KeyEvent.VK_BACK_SPACE && letra != KeyEvent.VK_SPACE) {
			e.consume();
		}
	}
}
