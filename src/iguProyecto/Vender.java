package iguProyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;



import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Vender extends JFrame implements ItemListener, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JTextField txtcantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JComboBox cbnfertilizante;
	private JTextArea txtBoleta;
	private JScrollPane scrollPane_1;
	
	//VARIABLES GLOBALES PARA VENDER
	int cantidad, obsequio;
	double precio, importePagar, importeCompra, descuento, montoVentaProducto, pCuotaDiaria = 0.0;
	String fertilizante;

	//INSTANCIANDO LA CLASE VARIABLESGLOABLES
	VariablesGlobales dato = new VariablesGlobales();
	private JTextField txtprecio;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Fertilizante");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(22, 34, 119, 13);
			contentPane.add(lblNewLabel);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblPrecio.setBounds(22, 78, 119, 13);
			contentPane.add(lblPrecio);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblCantidad.setBounds(22, 120, 119, 13);
			contentPane.add(lblCantidad);
		}
		{
			txtcantidad = new JTextField();
			txtcantidad.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					txtcantidadKeyTyped(e);
				}
			});

			txtcantidad.setBorder(new LineBorder(new Color(171, 173, 179), 2));
			txtcantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtcantidad.setColumns(10);
			txtcantidad.setBounds(151, 119, 304, 21);
			contentPane.add(txtcantidad);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.setBorder(null);
			btnVender.setBackground(Color.LIGHT_GRAY);
			btnVender.addActionListener(this);

			btnVender.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnVender.setBounds(532, 31, 119, 21);
			contentPane.add(btnVender);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBorder(null);
			btnCerrar.setBackground(Color.LIGHT_GRAY);
			btnCerrar.addActionListener(this);

			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnCerrar.setBounds(532, 75, 119, 21);
			contentPane.add(btnCerrar);
		}
		{
			cbnfertilizante = new JComboBox();
			cbnfertilizante.setBackground(Color.LIGHT_GRAY);
			cbnfertilizante.addItemListener(this);
			cbnfertilizante.setFont(new Font("Tahoma", Font.PLAIN, 14));
			cbnfertilizante.setBorder(new LineBorder(new Color(0, 0, 0), 0));
			cbnfertilizante.setModel(new DefaultComboBoxModel(new String[] {"Urea Agricola", "Sulfato de Amonio", "Sulfato de Potasio", "Cloruro de Potasio", "Sulfato de Zinc Heptahidratado", "Fosfato Diamónico"}));
			cbnfertilizante.setSelectedIndex(0);
			cbnfertilizante.setBounds(151, 31, 304, 21);
			contentPane.add(cbnfertilizante);
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(22, 174, 657, 144);
			contentPane.add(scrollPane_1);
			{
				txtBoleta = new JTextArea();
				txtBoleta.setEditable(false);
				scrollPane_1.setViewportView(txtBoleta);
				txtBoleta.setBorder(new LineBorder(new Color(0, 0, 0), 0));
				txtBoleta.setFont(new Font("Monospaced", Font.PLAIN, 14));
			}
		}
		{
			txtprecio = new JTextField();
			txtprecio.setEditable(false);
			txtprecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtprecio.setColumns(10);
			txtprecio.setBorder(new LineBorder(new Color(171, 173, 179), 2));
			txtprecio.setBounds(151, 77, 304, 21);
			contentPane.add(txtprecio);
		}
	}
	
	//METODO FERTILIZANTES ESTABLECE EL PRECIO DEL FERTILIZANTE SELECCIONADO
	void fertilizantes() {

		fertilizante = cbnfertilizante.getSelectedItem().toString();

		switch (fertilizante) {
		case "Urea Agricola":
			txtprecio.setText(String.valueOf(dato.precio1));
			break;

		case "Sulfato de Amonio":
			txtprecio.setText(String.valueOf(dato.precio2));
			break;

		case "Sulfato de Potasio":
			txtprecio.setText(String.valueOf(dato.precio3));
			break;

		case "Cloruro de Potasio":
			txtprecio.setText(String.valueOf(dato.precio4));
			break;

		case "Sulfato de Zinc Heptahidratado":
			txtprecio.setText(String.valueOf(dato.precio5));
			break;

		case "Fosfato Diamónico":
			txtprecio.setText(String.valueOf(dato.precio6));
			break;
		}
	}
		
		//METODO QUE OBTIENE DATOS
		void obtenerDatos() {
			
		//OBTIENE LOS DATOS
		fertilizante = cbnfertilizante.getSelectedItem().toString();
		precio = Double.parseDouble(txtprecio.getText());
		cantidad = Integer.parseInt(txtcantidad.getText());
		}
		
		//METODO CALCULO DE IMPORTE DE COMPRA
		void calculoImporteCompra() {
			
		//CALCULO DE IMPORTE DE COMPRA
		importeCompra = precio * cantidad;
		}
		
		//METODO CALCULO DE DESCUENTO
		void calculoDescuento() {
	
		// CALCULO DEL DESCUENTO
		//descuento esta en int debe pasar a decimal por el %
		if (cantidad >= 1 && cantidad <= 5)
			descuento = importeCompra * (dato.descuento1 / 100); 
		else if (cantidad >= 6 && cantidad <= 10)
			descuento = importeCompra * (dato.descuento2/ 100);
		else if (cantidad >= 11 && cantidad <= 15)
			descuento = importeCompra * (dato.descuento3 / 100);
		else
			descuento = importeCompra * (dato.descuento4 / 100);
		}
		
		//METODO IMPORTE A PAGAR
		void calculoImportePagar() {
	
		// CALCULO DE IMPORTE A PAGAR
		importePagar = importeCompra - descuento;
		}
		
		// CALCULO DE OBSEQUIOS
		void calculoObsequios() {

		// CALCULO DE CANTIDAD DE OBSEQUIOS
		if (cantidad >= 1 && cantidad <= 5)
			obsequio = cantidad * dato.obsequio1;
		else if (cantidad >= 6 && cantidad <= 10)
			obsequio = cantidad * dato.obsequio2;
		else
			obsequio = cantidad * dato.obsequio3;
		}
		//METODO QUE ACUMULA EL MONTO DE VENTAS
		void acumuladorVentasTotales() {

		//ACUMULADOR DE VENTAS
		dato.montoTotal += importeCompra;
		
		// ALERTA CUANDOS SE REALICEN 5 VENTAS
		dato.contador++; //contador comienza en 0 y aumenta de 1 en 1 usando en "++"
		if (dato.contador == 5 | dato.contador == 10 | dato.contador == 15 | dato.contador == 20 | dato.contador == 25) {
			pCuotaDiaria = (dato.montoTotal * 100) / dato.cuotaDiaria;
			JOptionPane.showMessageDialog(null,
					"Venta N." + dato.contador + "\nImporte total general acumulado: S/. " + String.format("%.2f", dato.montoTotal)
					+ "\nPorcentaje de la cuota diara: " + String.format("%.2f", pCuotaDiaria) + "%");
		}
		}
		
		//METODO QUE GENERA BOLETA
		void boleta() {
			
		//IMPRIME LOS DATOS DE LA BOLETA
		txtBoleta.setText("BOLETA DE VENTA\n" + "\n");
		txtBoleta.append("Precio unitario               : " + String.format("%.2f",precio) + "\n");
		txtBoleta.append("Cantidad de cajas adquiridas  : " + cantidad + "\n");
		txtBoleta.append("Importe de compra             : " + String.format("%.2f",importeCompra) + "\n");
		txtBoleta.append("Importe de descuento          : " + String.format("%.2f",descuento) + "\n");
		txtBoleta.append("Importe a pagar               : " + String.format("%.2f",importePagar)+ "\n");
		txtBoleta.append("Tipo de obsequio y cantidad   : " + obsequio +" " + dato.obsequio + "\n");
		//MOFICIAR TIPO OBSEQUIO Y CANTIDAD EN CONFIGURACION
		}
		
		//METODO QUE ACUMULA UNIDADES, VENTAS E IMPORTE TOTAL
		void acumuladoresVentas() {
		
		// AUMENTO DE ACUMULADORES (UNIDADES, VENTAS, IMPORTE TOTAL)
		if (fertilizante.equals("Urea Agricola")) {
			dato.acumuladorCajas1 += cantidad; // "+=" ES LO MISMO QUE acumuladorCajas1 = acumuladorCajas1 + cantidad
			dato.acumuladorVentas1 += 1;
			dato.acumuladorImpTotal1 += importePagar;
		}
		if (fertilizante.equals("Sulfato de Amonio")) {
			dato.acumuladorCajas2 += cantidad;
			dato.acumuladorVentas2 += 1;
			dato.acumuladorImpTotal2 += importePagar;
			
		}
		if (fertilizante.equals("Sulfato de Potasio")) {
			dato.acumuladorCajas3 += cantidad;
			dato.acumuladorVentas3 += 1;
			dato.acumuladorImpTotal3 += importePagar;
		}
		if (fertilizante.equals("Cloruro de Potasio")) {
			dato.acumuladorCajas4 += cantidad;
			dato.acumuladorVentas4 += 1;
			dato.acumuladorImpTotal4 += importePagar;
		}
		if (fertilizante.equals("Sulfato de Zinc Heptahidratado")) {
			dato.acumuladorCajas5 += cantidad;
			dato.acumuladorVentas5 += 1;
			dato.acumuladorImpTotal5 += importePagar;
		}
		if (fertilizante.equals("Fosfato Diamónico")) {
			dato.acumuladorCajas6 += cantidad;
			dato.acumuladorVentas6 += 1;
			dato.acumuladorImpTotal6 += importePagar;
		}	
		}
	void metodoCall() {
		obtenerDatos();
		calculoImporteCompra();
		calculoDescuento();
		calculoImportePagar();
		calculoObsequios();
		acumuladorVentasTotales();
		acumuladoresVentas();
		boleta();
	}
	
	//SE LLAMA AL METODO FERTILIZANTES EN EL EVENTO DEL CAMBIO EN EL COMBO BOX
	protected void itemStateChangedCbnfertilizante(ItemEvent e) {
		fertilizantes();
	}
	
	//SE LLAMA AL METODOCALL EN LA ACCION DEL BOTON VENDER
	protected void actionPerformedBtnVender(ActionEvent e) {
		metodoCall();
	}

	//EVENTO CERRAR VENTANA
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cbnfertilizante) {
			itemStateChangedCbnfertilizante(e);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
			
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	
	//Metodo que valida que se ingrese solo numeros
	protected void txtcantidadKeyTyped(KeyEvent e) {
		char letra = e.getKeyChar();
		if ((letra < '0' || letra > '9') && letra != KeyEvent.VK_BACK_SPACE) {
			e.consume();
		}
	}
}