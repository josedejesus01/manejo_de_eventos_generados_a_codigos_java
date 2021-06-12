/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

/**
 *
 * @author Alumno
 */
public class principal {
    public static void main(String[] args) {
        ventanas mostrar=new ventanas();// se instancia las clases para poder mostrar los datos
       mostrar.evento_boton();// se mandan a llamar las funciones segun el tipo de metodos
       mostrar.evento_teclado();
       mostrar.iniciar_componentes();
       mostrar.setVisible(true);// la funcion setvisible es para mostrar los datos 
      
    }
}
