package Graficos;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;

public class CreandoMarcoCentrado {

    public static void main(String[]args){

        MarcoCentrado miMarco = new MarcoCentrado();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);

        
    }
    
}

class MarcoCentrado extends JFrame{

    public MarcoCentrado(){

        Toolkit mipantalla = Toolkit.getDefaultToolkit(); //el objeto "mipantalla" contiene el sistema nativo de nuestra ventana

        Dimension tamanoPantalla = mipantalla.getScreenSize(); //"tamanoPantalla" ahora contiene la resolucion de mi pantalla

        int alturaPantalla = tamanoPantalla.height; //tenemos el alto de la resolucion que estaba almacendo en "tamanoPantalla"
        int anchoPantalla = tamanoPantalla.width; //tenemos el largo de la resolucion que estaba almacendo en "tamanoPantalla"
        
        //creamos un marco que tenga tanto la mitad de ancho y largo de la pantalla 
        setSize(anchoPantalla/2, alturaPantalla/2);

        //colocar el marco en el centro de la pantalla
        setLocation(anchoPantalla/4, alturaPantalla/4);

        setTitle("Marco Centrado");
        
        //cambiar el icono de imagen del marco
        Image miIcono = mipantalla.getImage("src/Graficos/imagen.jpg"); //tambien podemos establecer la ubicacion de la imagen
        setIconImage(miIcono); //establecer el icono seleccionado

    }


}
