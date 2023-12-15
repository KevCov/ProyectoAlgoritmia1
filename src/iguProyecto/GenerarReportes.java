package iguProyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class GenerarReportes extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox cboTipoReporte;
	private JButton btnCerrar;
	private JTextArea txtReporte;
	
	//VARIABLES GLOBALES DE GENERAR REPORTES
	String tipoReporte;
	double aporteCuotaDiaria1, aporteCuotaDiaria2, aporteCuotaDiaria3, aporteCuotaDiaria4, aporteCuotaDiaria5, aporteCuotaDiaria6, 
	precioPromedio, precioMayor, precioMenor, comparacion1, comparacion2, comparacion3, comparacion4, comparacion5, comparacion6, 
	comparacionCO1,comparacionCO2, comparacionCO3, comparacionCO4, comparacionCO5, comparacionCO6; 
	
	//INSTANCIANDO LA CLASE VARIABLESGLOBALES
	VariablesGlobales dato = new VariablesGlobales();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes frame = new GenerarReportes();
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
	public GenerarReportes() {
		setTitle("Generar reportes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 731, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Tipo de reporte ");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(30, 40, 136, 19);
			contentPane.add(lblNewLabel);
		}
		{
			cboTipoReporte = new JComboBox();
			cboTipoReporte.setBackground(Color.LIGHT_GRAY);
			cboTipoReporte.addActionListener(this);
			cboTipoReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Comparación de precios con el precio promedio", "Comparación de fertilizantes vendidos con la cantidad óptima", "Estadistica sobre el precio"}));
			cboTipoReporte.setBorder(new LineBorder(new Color(0, 0, 0), 0));
			cboTipoReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
			cboTipoReporte.setBounds(156, 38, 356, 27);
			contentPane.add(cboTipoReporte);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBorder(null);
			btnCerrar.setBackground(Color.LIGHT_GRAY);
			btnCerrar.addActionListener(this);
			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnCerrar.setBounds(560, 38, 99, 22);
			contentPane.add(btnCerrar);
		}
		{
			txtReporte = new JTextArea();
			txtReporte.setEditable(false);
			txtReporte.setFont(new Font("Monospaced", Font.PLAIN, 15));
			txtReporte.setLineWrap(true);
			
			JScrollPane scroll = new JScrollPane(txtReporte, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			scroll.setBounds(10, 99, 697, 400);
			contentPane.add(scroll);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTipoReporte) {
			actionPerformedCboTipoReporte(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtncerrar(e);
		}
	}
	
	public String mensaje(double comparacion , double vendidas, double cantidadOptima) {

		String mensaje = "";		
		if(vendidas > cantidadOptima)
			mensaje = ( -1*comparacion) + " mas que la cantidad óptima";
		else if(vendidas < cantidadOptima)
			mensaje =   comparacion + " menos que la cantidad óptima";
		else mensaje = "es igual que la cantidad óptima";
		
		return mensaje;
	}
	
	//METODO QUE CON PARAMETROS DE ENTRADA QUE COMPARA EL PRECIO CON EL PRECIO PROMEDIO
	public String mensaje2(double comparacion , double precio, double precioPromedio) {

		String mensaje = "";		
		if(precio > precioPromedio)
			mensaje = String.format("%.2f", ( -1*comparacion)) + " más que el precio promedio";
		else if(precio < precioPromedio)
			mensaje =   String.format("%.2f", comparacion) + " menos que el precio promedio";
		else mensaje = "es igual que el precio promedio";
		
		return mensaje;
	}
	
	//METOODO APORTE A LA CUOTA DIARIA
	void aporteCuotaDiaria() {
		//CALCULO APORTE A LA CUOTA DIARIA
		aporteCuotaDiaria1 = (dato.acumuladorImpTotal1 * 100) / dato.cuotaDiaria;
		aporteCuotaDiaria2 = (dato.acumuladorImpTotal2 * 100) / dato.cuotaDiaria;
		aporteCuotaDiaria3 = (dato.acumuladorImpTotal3 * 100) / dato.cuotaDiaria;
		aporteCuotaDiaria4 = (dato.acumuladorImpTotal4 * 100) / dato.cuotaDiaria;
		aporteCuotaDiaria5 = (dato.acumuladorImpTotal5 * 100) / dato.cuotaDiaria;
		aporteCuotaDiaria6 = (dato.acumuladorImpTotal6 * 100) / dato.cuotaDiaria;
		}
	//METOODO CALCULO DE PROMEDIOS
	void calculoPrecioPromedio() {
		// CALCULO DE PROMEDIOS
		precioPromedio = (dato.precio1 + dato.precio2 + dato.precio3 + dato.precio4 + dato.precio5 + dato.precio6) /6;
		}
	//METOODO COMPARACIONES
	void comparacionPrecioPromedio() {
		// CALCULO DE COMPARACIONES
		comparacion1 = precioPromedio - dato.precio1;
		comparacion2 = precioPromedio - dato.precio2;
		comparacion3 = precioPromedio - dato.precio3;
		comparacion4 = precioPromedio - dato.precio4;
		comparacion5 = precioPromedio - dato.precio5;
		comparacion6 = precioPromedio - dato.precio6;
		}
	//METOODO COMPARACION CON LA CANTIDAD OPTIMA
	void comparacionCantidadOptima() {
		// CALCULO COMPARACION CON LA CANTIDAD OPTIMA
		comparacionCO1 = dato.cantidadOptima - dato.acumuladorCajas1;
		comparacionCO2 = dato.cantidadOptima - dato.acumuladorCajas2;
		comparacionCO3 = dato.cantidadOptima - dato.acumuladorCajas3;
		comparacionCO4 = dato.cantidadOptima - dato.acumuladorCajas4;
		comparacionCO5 = dato.cantidadOptima - dato.acumuladorCajas5;
		comparacionCO6 = dato.cantidadOptima - dato.acumuladorCajas6;
		}
		
	//METODO CALCULO DE PRECIO MAYOR
	void calculoPrecioMayor() {
		// CALCULO DE PRECIO MAYOR
		if(dato.precio1 > dato.precio2 && dato.precio1 > dato.precio3 && dato.precio1 > dato.precio4 && dato.precio1 > dato.precio5 && 
				dato.precio1 > dato.precio6 )
			precioMayor = dato.precio1;
		else if(dato.precio2 > dato.precio1 && dato.precio2 > dato.precio3 && dato.precio2 > dato.precio4 && dato.precio2 > dato.precio5 && 
				dato.precio2 > dato.precio6 )
			precioMayor = dato.precio2;
		else if(dato.precio3 > dato.precio1 && dato.precio3 > dato.precio2 && dato.precio3 > dato.precio4 && dato.precio3 > dato.precio5 && 
				dato.precio3 > dato.precio6 )
			precioMayor = dato.precio3;
		else if(dato.precio4 > dato.precio1 && dato.precio4 > dato.precio2 && dato.precio4 > dato.precio3 && dato.precio4 > dato.precio5 && 
				dato.precio4 > dato.precio6 )
			precioMayor = dato.precio4;
		else if(dato.precio5 > dato.precio1 && dato.precio5 > dato.precio2 && dato.precio5 > dato.precio3 && dato.precio5 > dato.precio4 && 
				dato.precio5 > dato.precio6 )
			precioMayor= dato.precio5;
		else precioMayor = dato.precio6;
		}
	//METODO CALCULO DE PRECIO MENOR
		void calculoPrecioMenor() {
	
		// CALCULO DE PRECIO MENOR
		if(dato.precio1 < dato.precio2 && dato.precio1<dato.precio3 && dato.precio1 < dato.precio4 && dato.precio1 < dato.precio5 && 
				dato.precio1 < dato.precio6 )
			precioMenor = dato.precio1;
		else if(dato.precio2 < dato.precio1 && dato.precio2<dato.precio3 && dato.precio2 < dato.precio4 && dato.precio2 < dato.precio5 && 
				dato.precio2 < dato.precio6 )
			precioMenor = dato.precio2;
		else if(dato.precio3 < dato.precio1 && dato.precio3<dato.precio2 && dato.precio3 < dato.precio4 && dato.precio3 < dato.precio5 && 
				dato.precio3 < dato.precio6 )
			precioMenor = dato.precio3;
		else if(dato.precio4 < dato.precio1 && dato.precio4<dato.precio2 && dato.precio4 < dato.precio3 && dato.precio4 < dato.precio5 && 
				dato.precio4 < dato.precio6 )
			precioMenor = dato.precio4;
		else if(dato.precio5< dato.precio1 && dato.precio5<dato.precio2 && dato.precio5 < dato.precio3 && dato.precio5 < dato.precio4 && 
				dato.precio5 < dato.precio6 )
			precioMenor = dato.precio5;
		else precioMenor = dato.precio6;
		}
		//METODO GENERAR REPORTES
		void generarReportes() {

		//GENERAR REPORTES
		
		switch (tipoReporte) {

		case "Ventas por modelo":
			
			txtReporte.setText(" VENTAS POR MODELO" + "\n");
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                        : " + dato.fertilizante1 + "\n");
			txtReporte.append(" Cantidad ventas               : " + dato.acumuladorVentas1 + "\n");
			txtReporte.append(" Canidad de cajas adquiridas   : " + dato.acumuladorCajas1 + "\n");
			txtReporte.append(" Importe total vendido         : S/." + String.format("%.2f",dato.acumuladorImpTotal1) + "\n");
			txtReporte.append(" Aporte a la cuota diaria      : " + String.format("%.2f",aporteCuotaDiaria1) + "%" + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                        : " + dato.fertilizante2 + "\n");
			txtReporte.append(" Cantidad ventas               : " + dato.acumuladorVentas2 + "\n");
			txtReporte.append(" Cantidad de cajas adquiridas  : " + dato.acumuladorCajas2 + "\n");
			txtReporte.append(" Importe total vendido         : S/." + String.format("%.2f",dato.acumuladorImpTotal2) + "\n");
			txtReporte.append(" Aporte a la cuota diaria      : " + String.format("%.2f",aporteCuotaDiaria2) + "%" + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                        : " + dato.fertilizante3 + "\n");
			txtReporte.append(" Cantidad ventas               : " + dato.acumuladorVentas3 + "\n");
			txtReporte.append(" Cantidad de cajas adquiridas  : " + dato.acumuladorCajas3 + "\n");
			txtReporte.append(" Importe total vendido         : S/." + String.format("%.2f",dato.acumuladorImpTotal3) + "\n");
			txtReporte.append(" Aporte a la cuota diaria      : " + String.format("%.2f",aporteCuotaDiaria3) + "%" + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                        : " + dato.fertilizante4 + "\n");
			txtReporte.append(" Cantidad ventas               : " + dato.acumuladorVentas4 + "\n");
			txtReporte.append(" Cantidad de cajas adquiridas  : " + dato.acumuladorCajas4 + "\n");
			txtReporte.append(" Importe total vendido         : S/." + String.format("%.2f",dato.acumuladorImpTotal4) + "\n");
			txtReporte.append(" Aporte a la cuota diaria      : " + String.format("%.2f",aporteCuotaDiaria4) + "%" + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                        : " + dato.fertilizante5 + "\n");
			txtReporte.append(" Cantidad ventas               : " + dato.acumuladorVentas5 + "\n");
			txtReporte.append(" Cantidad de cajas adquiridas  : " + dato.acumuladorCajas5 + "\n");
			txtReporte.append(" Importe total vendido         : S/." + String.format("%.2f",dato.acumuladorImpTotal5) + "\n");
			txtReporte.append(" Aporte a la cuota diaria      : " + String.format("%.2f",aporteCuotaDiaria5) + "%" + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                        : " + dato.fertilizante6 + "\n");
			txtReporte.append(" Cantidad ventas               : " + dato.acumuladorVentas6 + "\n");
			txtReporte.append(" Cantidad de cajas adquiridas  : " + dato.acumuladorCajas6 + "\n");
			txtReporte.append(" Importe total vendido         : S/." + String.format("%.2f",dato.acumuladorImpTotal6) + "\n");
			txtReporte.append(" Aporte a la cuota diaria      : " + String.format("%.2f",aporteCuotaDiaria6) + "%" + "\n");
			break;
			
		case ("Comparación de precios con el precio promedio"):
			
			txtReporte.setText(" COMPARACION DE PRECIOS CON EL PRECIO PROMEDIO" + "\n");
			txtReporte.append("\n");
		
			txtReporte.append(" Modelo                       : " + dato.fertilizante1 + "\n");
			txtReporte.append(" Precio                       : S/. " + dato.precio1 + "\n");
			txtReporte.append(" Precio promedio              : S/. " + String.format("%.2f", precioPromedio) + "\n");
			txtReporte.append(" Comparación                  : S/. " + mensaje2(comparacion1,dato.precio1, precioPromedio) + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante2 + "\n");
			txtReporte.append(" Precio                       : S/. " + dato.precio2 + "\n");
			txtReporte.append(" Precio promedio              : S/. " + String.format("%.2f", precioPromedio) + "\n");
			txtReporte.append(" Comparación                  : S/. " + mensaje2(comparacion2,dato.precio2, precioPromedio) + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante3 + "\n");
			txtReporte.append(" Precio                       : S/. " + dato.precio3 + "\n");
			txtReporte.append(" Precio promedio              : S/. " + String.format("%.2f", precioPromedio) + "\n");
			txtReporte.append(" Comparación                  : S/. " + mensaje2(comparacion3,dato.precio3, precioPromedio) + "\n");
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante4 + "\n");
			txtReporte.append(" Precio                       : S/. " + dato.precio4 + "\n");
			txtReporte.append(" Precio promedio              : S/. " + String.format("%.2f", precioPromedio) + "\n");
			txtReporte.append(" Comparación                  : S/. " + mensaje2(comparacion4,dato.precio4, precioPromedio) + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante5 + "\n");
			txtReporte.append(" Precio                       : S/. " + dato.precio5 + "\n");
			txtReporte.append(" Precio promedio              : S/. " + String.format("%.2f", precioPromedio) + "\n");
			txtReporte.append(" Comparación                  : S/. " + mensaje2(comparacion5,dato.precio5, precioPromedio) + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante6 + "\n");
			txtReporte.append(" Precio                       : S/. " + dato.precio6 + "\n");
			txtReporte.append(" Precio promedio              : S/. " + String.format("%.2f", precioPromedio) + "\n");
			txtReporte.append(" Comparación                  : S/. " + mensaje2(comparacion6,dato.precio6, precioPromedio) + "\n");
			
			txtReporte.append("\n");
			break;
		
		case ("Comparación de fertilizantes vendidos con la cantidad óptima"):
			
			txtReporte.setText(" COMPARACION DE FERTILIZANTES CON LA CANTIDAD ÓPTIMA" + "\n");
			txtReporte.append("\n");
		
			txtReporte.append(" Modelo                       : " + dato.fertilizante1 + "\n");
			txtReporte.append(" Fertilizantes vendidos       : " + dato.acumuladorCajas1 + "\n");
			txtReporte.append(" Cantidad óptima              : " + dato.cantidadOptima + "\n");
			txtReporte.append(" Comparación                  : " + mensaje(comparacionCO1,dato.acumuladorCajas1, dato.cantidadOptima) + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante2 + "\n");
			txtReporte.append(" Fertilizantes vendidos       : " + dato.acumuladorCajas2 + "\n");
			txtReporte.append(" Cantidad óptima              : " + dato.cantidadOptima + "\n");
			txtReporte.append(" Comparación                  : " + mensaje(comparacionCO2,dato.acumuladorCajas2, dato.cantidadOptima) + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante3 + "\n");
			txtReporte.append(" Fertilizantes vendidos       : " + dato.acumuladorCajas3 + "\n");
			txtReporte.append(" Cantidad óptima              : " + dato.cantidadOptima + "\n");
			txtReporte.append(" Comparación                  : " + mensaje(comparacionCO3, dato.acumuladorCajas3,dato.cantidadOptima) + "\n");
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante4 + "\n");
			txtReporte.append(" Fertilizantes vendidos       : " + dato.acumuladorCajas4 + "\n");
			txtReporte.append(" Cantidad óptima              : " + dato.cantidadOptima + "\n");
			txtReporte.append(" Comparación                  : " + mensaje(comparacionCO4, dato.acumuladorCajas4,dato.cantidadOptima) + "\n");
			
			txtReporte.append("\n");
			
			txtReporte.append(" Modelo                       : " + dato.fertilizante5 + "\n");
			txtReporte.append(" Fertilizantes vendidos       : " + dato.acumuladorCajas5 + "\n");
			txtReporte.append(" Cantidad óptima              : " + dato.cantidadOptima + "\n");
			txtReporte.append(" Comparación                  : " + mensaje(comparacionCO5,dato.acumuladorCajas5, dato.cantidadOptima) + "\n");
			
			txtReporte.append("\n");
			txtReporte.append(" Modelo                       : " + dato.fertilizante6 + "\n");
			txtReporte.append(" Fertilizantes vendidos       : " + dato.acumuladorCajas6 + "\n");
			txtReporte.append(" Cantidad óptima              : " + dato.cantidadOptima + "\n");
			txtReporte.append(" Comparación                  : " + mensaje(comparacionCO6,dato.acumuladorCajas6, dato.cantidadOptima) + "\n");
			
			txtReporte.append("\n");
			break;
			
		case ("Estadistica sobre el precio"):
			
			txtReporte.setText(" ESTADISTICAS SOBRE EL PRECIO" + "\n");
			txtReporte.append("\n");
		
			txtReporte.append(" Precio promedio              : " + "S/. " + String.format("%.2f", precioPromedio) + "\n");
			txtReporte.append(" Precio mayor                 : " + "S/. " + String.format("%.2f", precioMayor) + "\n");
			txtReporte.append(" Precio menor                 : " + "S/. " + String.format("%.2f", precioMenor) + "\n");
	
			txtReporte.append("\n");
			break;
		}
		}

	//EVENTO QUE MUESTRA LA INFORMACION DEL REPORTE SELECCIONADO EN EL COMBO BOX
	protected void actionPerformedCboTipoReporte(ActionEvent e) {
		//ALMACENANDO EL ITEM SELECCIONADO
		tipoReporte = cboTipoReporte.getSelectedItem().toString();
		
		//LLAMADO DE METODOS
		aporteCuotaDiaria();
		calculoPrecioPromedio();
		aporteCuotaDiaria();
		comparacionPrecioPromedio();
		comparacionCantidadOptima();
		calculoPrecioPromedio();
		calculoPrecioMayor();
		calculoPrecioMenor();
		generarReportes();
			
	}
	//EVENTO QUE CIERRA LA VENTANA
	protected void actionPerformedBtncerrar(ActionEvent e) {
		this.dispose();
	}
}
