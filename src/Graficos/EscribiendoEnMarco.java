package Graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[]args){

        marcoContexto mimarco = new marcoContexto();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        



    }
    
}
class marcoContexto extends JFrame{

    public marcoContexto(){

        setSize(600,450);

        setLocation(400, 200);

        setTitle("Pimer Texto");

        lamina milamina = new lamina(); //ya contruimos una lamina, de la clase "lamina"
        add(milamina); // agregamos la lamina al marco

        setVisible(true); //debe estar siempre en el ultimo lugar 

    }

}

class lamina extends JPanel{ //creamos una lamina que estara arriba del marco, 

    public void paintComponent(Graphics g){
        
        super.paintComponent(g); //le decimos que cumplas sus funciones

        g.drawString("Estamos Aprendiendo swing", 100, 100); //le pedimos que imprima un texto


    }

}