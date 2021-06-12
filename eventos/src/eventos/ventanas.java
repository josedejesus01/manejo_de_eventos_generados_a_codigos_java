/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

// Muestra cadenas en distintos tipos de letra y colores.
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;// sirve para que el programa cierre su ejecucion ,una vez terminado
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ventanas extends JFrame {
    private JPanel mi_panel;
	private JLabel captar_nombre;
        private JLabel captar_apellido;
	private JTextField nombre;
	private JButton btn_aceptar;
        

	public ventanas(){// se crea un metodo para construir la ventana

		setBounds(50, 50, 500, 500);// se establece los tamaños
		iniciar_componentes();// se invoca el metodo 
		setDefaultCloseOperation(EXIT_ON_CLOSE);// el argumento para indicar que el programa debe terminar cuando el usuario cierre la ventana.

	}



	public void iniciar_componentes() {// se crea el metodo
// se mandan a llamar los metodos dentro del metodo iniciar componentes
		panel();
		Etiquetas();
		cajas_de_texto();
		botones();
                Etiquetas1();
                cajas_de_texto2();
                 
	}

	private void panel() {// se inicializa el metodo
		mi_panel = new JPanel();// se inicializa el metodo panel
		mi_panel.setLayout(null);// establece el esquema del marco
		this.add(mi_panel);// se hace referencia al objeto

	}

	private void Etiquetas() {// se crea el metodo
		captar_nombre = new JLabel("Ingrese un nombre:");// se intancia la referencia ala etiqueta

		captar_nombre.setBounds(30, 10, 200, 30);// se establece los tamaños
		mi_panel.add(captar_nombre);// se hace referencia al objeto
	}
        private void Etiquetas1() {// se vuelve a crear el otro metodo
		captar_apellido = new JLabel("Ingrese un apellido:");// se vuelve a instanciar la etiqueta

		captar_apellido.setBounds(30, 100, 200, 30);// se establece los tamaños
		mi_panel.add(captar_apellido);//se vuelve a guardar los datos al panel
	}
	private void cajas_de_texto() {
		nombre = new JTextField();
		nombre.setBounds(30, 50, 300, 30);
		evento_teclado();// se invoca al metodo 
		mi_panel.add(nombre);// se guarda el metodo nombre al panel
	}
        private void cajas_de_texto2() {//se vuelve a crear los metodos 
		nombre = new JTextField();
		nombre.setBounds(30, 130, 300, 30);
		evento_teclado();
		mi_panel.add(nombre);
	}

	private void botones() {// se crea los botones 
		btn_aceptar = new JButton("ACEPTAR");// se instancia el metodo a la libreria Jbutton
		btn_aceptar.setBounds(150, 170, 150, 40);//se establece los tamaños 
		btn_aceptar.setFont(new Font("arial", 0, 15));
		evento_boton();
		mi_panel.add(btn_aceptar);

	}

	public void evento_boton() {// se crea el metodo 
		ActionListener captar_evento = new ActionListener() {//el objeto manejador escucha los eventos

			@Override// se procesa los eventos de campo de texto
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
                                // se utiliza el metodo joptionpane para mostrar un mensaje 
				JOptionPane.showMessageDialog(null, nombre.getText(), "DATOS CAPTURADOS DE:",
						JOptionPane.INFORMATION_MESSAGE);
                                // son los metodos que para modificar y obtener el texto
				nombre.setText("");
                                nombre.getText();
			}
		};
		btn_aceptar.addActionListener(captar_evento);//registra los manejadores de eventos
	}
	public void evento_teclado() {// se inserta el nuevo metodo
		KeyListener eventos_teclado=new KeyListener() {//para manejar eventos de teclas
			
			@Override// sobreescritura de metodos
			public void keyTyped(KeyEvent e) {// es llamado en respuesta a la acción de oprimir
                                                          //una tecla que no sea una tecla de acción.
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {//es llamado cuando la tecla se suelta después de un evento 
                                                             //keyPressed o keyTyped.
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
                                
			JOptionPane.showMessageDialog(null, null, "USTED A PRESIONADO UNA TECLA:",
					JOptionPane.WARNING_MESSAGE);	// se crea un mensaje de que se ha presionado un boton 
			}
		};
		nombre.addKeyListener(eventos_teclado);// se guarda la accion del teclado
	}
}

   

