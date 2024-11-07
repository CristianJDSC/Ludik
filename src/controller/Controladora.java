/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
/**
 *
 * @author Cristian De Sousa
 */
public class Controladora {
    JFrame ventana;
    
    public Controladora(JFrame ventana){
       this.ventana = ventana;
    }
    
    public void iniciaVentana(JFrame ventana, String ruta){
       ventana.setLocationRelativeTo(null); //permite centrar la ventana
       ventana.setIconImage(new ImageIcon(ruta).getImage()); 
      //ImageIcon permite agregar un icono en el frame superior (hacia la
      //izquierda) de la ventana para evitar que salga la taza de java por 
      //defecto, debe importarse la librería javax.swing.ImageIcon
       ventana.setResizable(false); // no permite que el usuario cambie el tamaño 
      // de la ventana, de lo contrario los componentes pueden verse afectados
       ventana.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         //para evitar cerrar con la "X", solo se sale de la ventana a través
        // del botón Salir del Sistema.
    }
    
    public void activaVentana(JFrame ventana,JFrame ventana2) {
        
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana2.dispose(); //elimina la ventana de la memoria, incluyendo datos
        //el dispose() garantiza que no dejes ventanas ejecutándose
        //no se almacenan datos en este ejemplo
     }
    
}
