package Graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;
public class TipoLetra {

    public static void main(String[]args){

        String fuente = JOptionPane.showInputDialog("Introduce Fuente");

        boolean estalafuente = false;

        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(int i = 0; i<nombresDeFuentes.length; i++){

            if(nombresDeFuentes.equals(fuente)){

                estalafuente = true;
            }

        }

        if(estalafuente){

            System.out.println("Fuente instalada");

        }else {

            System.out.println("no esta instalada la fuente");
        }

    }
    
}
