package Graficos;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.*;

public class PruebaImagenes {

    public static void main (String[]args){

        tabla figura = new tabla();


    }
    
}

class tabla extends JFrame{

    public tabla(){

        Toolkit CFPantalla = Toolkit.getDefaultToolkit();

        setTitle("marco con imagenes ");

        setBounds(100, 100, 400, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        Image icon = CFPantalla.getImage("src/Graficos/imagen.jpg");

        setIconImage(icon);

        tabla2 figura2 = new tabla2();

        add(figura2);

    }

}

class tabla2 extends JPanel{

    private Image imagen; //creamos un objeto de tipo imagen 

    public tabla2(){

         //creamos un objeto de tipo file que almacena la direccion de la imagen
         File miimagen = new File("src/Graficos/Coche.jpg"); 

         //el metodo ready lanza una exepcion el cual produce un error si la accion no se completa bien
        //toca programar un codigo que sea capas de controlar esa exepcion que es try y catch

        try{ //significa "intenta ": si el programa funciona bien se cumple esta condicion try
        imagen = ImageIO.read(miimagen); //almacenamos la direccion de la imagen en el read(se encarga de buscar direccion de la imagen)
        }
        //si el programa sale mal elegira el catch
        catch(IOException e){ //especificamos el tipo de exepcion que podria ocurrir 

            System.out.println("No se encuentra la imagen"); //en caso de que ocurra un error, sale ese mensaje
        }

    }
    
    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        
        g.drawImage(imagen, 10, 10, null); //dibujamos la imagen y su localizacion 
        
        int anchuraImagen = imagen.getWidth(this); //saber el ancho de la imagen que queremos copiar
        int alturaImagen = imagen.getHeight(this); //saber la altura de la imagen que queremos copiar
        
        for(int i = 0; i<200; i++){ // lo metemos en un bucle for para que la imagen se vaya pegando en x partes de la pantalla

             for(int j = 0; j<150; j++ ){

                g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j); //copiaremos la imagen con esta funcion
        
             }
        }
        
    }
}
