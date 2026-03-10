package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Logica.Operador;
import Logica.Procesos;

public class RegistroOperadorGUI extends JFrame  implements ActionListener{
		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField txtDocumento;
		private JTextField txtNombre;
		private JTextField txtSueldo;
		private JTextField txtAntiguedad;
		private JLabel lblResSueldoN;
		private JLabel lblPorAumentoFin;
		private JButton btnRegistrar;
		private JButton btnCancelar;		
		
		
	

		public RegistroOperadorGUI() {
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setBounds(100, 100, 704, 327);
		    
		    contentPane = new JPanel();
		    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		    setContentPane(contentPane);
		    contentPane.setLayout(null);

		    iniciarComponentes();
		}

		private void iniciarComponentes() {

		    JLabel lblTitulo = new JLabel("REGISTRO DE OPERADORES");
		    lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		    lblTitulo.setFont(new Font("Monaco", Font.PLAIN, 25));
		    lblTitulo.setBounds(6, 19, 692, 43);
		    contentPane.add(lblTitulo);

		    txtDocumento = new JTextField();
		    txtDocumento.setBounds(521, 92, 130, 26);
		    contentPane.add(txtDocumento);
		    txtDocumento.setColumns(10);

		    txtNombre = new JTextField();
		    txtNombre.setColumns(10);
		    txtNombre.setBounds(131, 92, 296, 26);
		    contentPane.add(txtNombre);

		    txtSueldo = new JTextField();
		    txtSueldo.setColumns(10);
		    txtSueldo.setBounds(131, 130, 78, 26);
		    contentPane.add(txtSueldo);

		    txtAntiguedad = new JTextField();
		    txtAntiguedad.setColumns(10);
		    txtAntiguedad.setBounds(349, 130, 78, 26);
		    contentPane.add(txtAntiguedad);

		    JLabel lblNombre = new JLabel("Nombre");
		    lblNombre.setBounds(29, 97, 90, 16);
		    contentPane.add(lblNombre);

		    JLabel lblSueldo = new JLabel("Sueldo");
		    lblSueldo.setBounds(29, 135, 90, 16);
		    contentPane.add(lblSueldo);
		    
		    JLabel lblAntiguedad = new JLabel("Antiguedad");
		    lblAntiguedad.setBounds(256, 135, 90, 16);
		    contentPane.add(lblAntiguedad);

		    JLabel lblDocumento = new JLabel("Documento");
		    lblDocumento.setBounds(446, 97, 90, 16);
		    contentPane.add(lblDocumento);

		    btnCancelar = new JButton("Cancelar");
		    btnCancelar.setBounds(534, 237, 117, 29);		    
		    btnCancelar.addActionListener(this);
		    contentPane.add(btnCancelar);

		    btnRegistrar = new JButton("Registrar");
		    btnRegistrar.setBounds(405, 237, 117, 29);
		    btnRegistrar.addActionListener(this);			    
		    contentPane.add(btnRegistrar);
		    
		    JLabel lblSueldonuevo = new JLabel("SueldoNuevo");
		    lblSueldonuevo.setBounds(29, 184, 102, 16);
		    contentPane.add(lblSueldonuevo);

		    lblResSueldoN = new JLabel("");
		    lblResSueldoN.setForeground(Color.BLUE);
		    lblResSueldoN.setBounds(131, 184, 102, 16);
		    contentPane.add(lblResSueldoN);

		    JLabel lblPorAumento = new JLabel("");
		    lblPorAumento.setBounds(256, 184, 102, 16);
		    contentPane.add(lblPorAumento);

		    lblPorAumentoFin = new JLabel("");
		    lblPorAumentoFin.setForeground(Color.BLUE);
		    lblPorAumentoFin.setBounds(358, 184, 102, 16);
		    contentPane.add(lblPorAumentoFin);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btnRegistrar) {
				registrarOperador();
				
			}
			else if(e.getSource()== btnCancelar) {
				limpiar();
				
				
			}
			
		}


		private void registrarOperador() {
			Operador miOperador = new Operador();
			
			miOperador.setDocumento(txtDocumento.getText());
			miOperador.setNombre(txtNombre.getText());
			miOperador.setSueldo(Double.parseDouble(txtSueldo.getText()));
			miOperador.setAntiguedad(Integer.parseInt(txtAntiguedad.getText()));
			Procesos miProcesos = new Procesos();			
			miProcesos.calcularSueldoNuevo(miOperador);			
			lblResSueldoN.setText(miOperador.getSueldoNuevo()+"");
			lblPorAumentoFin.setText(miOperador.getAumento()+"");
		}
		
		private void limpiar() {
			txtDocumento.setText("");
			txtNombre.setText("");
			txtSueldo.setText("");
			txtAntiguedad.setText("");
			lblResSueldoN.setText("");
			lblPorAumentoFin.setText(""); 
			
			
		}
		
	


}

