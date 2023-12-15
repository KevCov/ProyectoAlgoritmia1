package iguProyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setTitle("TIENDA PRINCIPAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 563);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnNewMenu = new JMenu("Archivo");
				mnNewMenu.setFont(new Font("SansSerif", Font.PLAIN, 12));
				menuBar.add(mnNewMenu);
				{
					mntmNewMenuItem = new JMenuItem("Salir");
					mntmNewMenuItem.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItemActionPerformed(e);
						}
					});
					mntmNewMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu.add(mntmNewMenuItem);
				}
			}
			{
				mnNewMenu_1 = new JMenu("Mantenimiento");
				mnNewMenu_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
				menuBar.add(mnNewMenu_1);
				{
					mntmNewMenuItem_1 = new JMenuItem("Consultar Fertilizante");
					mntmNewMenuItem_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_1ActionPerformed(e);
						}
					});
					mntmNewMenuItem_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_1.add(mntmNewMenuItem_1);
				}
				{
					mntmNewMenuItem_2 = new JMenuItem("Modificar Fertilizante");
					mntmNewMenuItem_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_2ActionPerformed(e);
						}
					});
					mntmNewMenuItem_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_1.add(mntmNewMenuItem_2);
				}
				{
					mntmNewMenuItem_3 = new JMenuItem("Listar Fertilizantes");
					mntmNewMenuItem_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_3ActionPerformed(e);
						}
					});
					mntmNewMenuItem_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_1.add(mntmNewMenuItem_3);
				}
			}
			{
				mnNewMenu_2 = new JMenu("Ventas");
				mnNewMenu_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
				menuBar.add(mnNewMenu_2);
				{
					mntmNewMenuItem_4 = new JMenuItem("Vender");
					mntmNewMenuItem_4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_4ActionPerformed(e);
						}
					});
					mntmNewMenuItem_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_2.add(mntmNewMenuItem_4);
				}
				{
					mntmNewMenuItem_5 = new JMenuItem("Generar reportes");
					mntmNewMenuItem_5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_5ActionPerformed(e);
						}
					});
					mntmNewMenuItem_5.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_2.add(mntmNewMenuItem_5);
				}
			}
			{
				mnNewMenu_3 = new JMenu("Configuración");
				mnNewMenu_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
				menuBar.add(mnNewMenu_3);
				{
					mntmNewMenuItem_6 = new JMenuItem("Configurar descuentos");
					mntmNewMenuItem_6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_6ActionPerformed(e);
						}
					});
					mntmNewMenuItem_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_3.add(mntmNewMenuItem_6);
				}
				{
					mntmNewMenuItem_8 = new JMenuItem("Configurar cantidad óptima");
					mntmNewMenuItem_8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_8ActionPerformed(e);
						}
					});
					{
						mntmNewMenuItem_7 = new JMenuItem("Configurar Obsequio");
						mntmNewMenuItem_7.setFont(new Font("SansSerif", Font.PLAIN, 12));
						mntmNewMenuItem_7.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								mntmNewMenuItem_7ActionPerformed(e);
							}
						});
						mnNewMenu_3.add(mntmNewMenuItem_7);
					}
					mntmNewMenuItem_8.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_3.add(mntmNewMenuItem_8);
				}
				{
					mntmNewMenuItem_9 = new JMenuItem("Configurar cuota diaria");
					mntmNewMenuItem_9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_9ActionPerformed(e);
						}
					});
					mntmNewMenuItem_9.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_3.add(mntmNewMenuItem_9);
				}
			}
			{
				mnNewMenu_4 = new JMenu("Ayuda");
				mnNewMenu_4.setFont(new Font("SansSerif", Font.PLAIN, 12));
				menuBar.add(mnNewMenu_4);
				{
					mntmNewMenuItem_10 = new JMenuItem("Acerca de Tienda");
					mntmNewMenuItem_10.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mntmNewMenuItem_10ActionPerformed(e);
						}
					});
					mntmNewMenuItem_10.setFont(new Font("SansSerif", Font.PLAIN, 12));
					mnNewMenu_4.add(mntmNewMenuItem_10);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	
	
	//SE INSTANCIA LA VENTANA CONSULTAR FERTILIZANTE, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_1ActionPerformed(ActionEvent e) {
		ConsultarFertilizante consult = new ConsultarFertilizante();
		consult.setVisible(true);
		consult.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA MODIFICAR FERTILIZANTE, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_2ActionPerformed(ActionEvent e) {
		ModificarFertilizante modifi = new ModificarFertilizante();
		modifi.setVisible(true);
		modifi.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA LISTA FERTILIZANTE, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_3ActionPerformed(ActionEvent e) {
		ListaFertilizante lista = new ListaFertilizante();
		lista.setVisible(true);
		lista.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA CONSULTARFERTILIZANTE, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_4ActionPerformed(ActionEvent e) {
		Vender venta = new Vender();
		venta.setVisible(true);
		venta.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA GENERAR REPORTES, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_5ActionPerformed(ActionEvent e) {
		GenerarReportes reporte = new GenerarReportes();
		reporte.setVisible(true);
		reporte.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA CONFIGURAR DESCUENTO, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_6ActionPerformed(ActionEvent e) {
		ConfigurarDescuento descuento = new ConfigurarDescuento();
		descuento.setVisible(true);
		descuento.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA CONFIGURAR OBSEQUIO, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_7ActionPerformed(ActionEvent e) {
		ConfigurarObsequios obsequios = new ConfigurarObsequios();
		obsequios.setVisible(true);
		obsequios.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA CONFIGURAR CANT OPTIMA, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_8ActionPerformed(ActionEvent e) {
		ConfigurarCantOptima cantidadOptima = new ConfigurarCantOptima();
		cantidadOptima.setVisible(true);
		cantidadOptima.setLocationRelativeTo(null);
	}
	
	//SE INSTANCIA LA VENTANA CONFIGURAR CUOTA DIARIA, SE HACE VISIBLE Y SE CENTRA
	protected void mntmNewMenuItem_9ActionPerformed(ActionEvent e) {
		ConfigurarCuotaDiaria cuotaDiaria = new ConfigurarCuotaDiaria();
		cuotaDiaria.setVisible(true);
		cuotaDiaria.setLocationRelativeTo(null);
	}
	protected void mntmNewMenuItem_10ActionPerformed(ActionEvent e) {
		AcercaDeTienda acercaDe = new AcercaDeTienda();
		acercaDe.setVisible(true);
		acercaDe.setLocationRelativeTo(null);
	}
	//EVENTO QUE CIERRA EL PROGRAMA
	protected void mntmNewMenuItemActionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
}
