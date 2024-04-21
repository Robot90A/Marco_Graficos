package Graficos;

import javax.swing.*; //primero se debe importar el paquete para utilizar todas sus funciones

public class CreandoMarcos{

    public static void main(String[]args){

        miMarco marco1 = new miMarco(); //instaciamos la clase 

        marco1.setVisible(true); //con setVisible podemos hacer visible la ventana
        
        //con esta funcion nos permite decirle a la ventana que hacer cuando se cierre, en este caso que se cierre
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


    }

}

class miMarco extends JFrame{ //se debe herdar de la clase JFrame para usar usu funciones

    public miMarco(){

        //se debe establecer el tamaño que tendra la ventana

        //setSize(500,300); //con la funcion setSize podemos establacer el ancho y largo de la ventana
        
        //setLocation(500,300); //establecer la ubicacion del marco en pantalla (eje de cordenadas)
        
        //este metodo nos permite hacer lo mismo que los 2 de arriba, elegir la ubicacion del marco
        //y darle ancho y largo
        setBounds(500, 300, 550, 250); //width: ancho y height: altura

        setResizable(true); //elegir si el usuario puede o no redimencionar el marco(cambiar tamaño)

        //setExtendedState(Frame.MAXIMIZED_BOTH); //permite que el marco se abra a pantalla completa

        setTitle("Hola mundo"); //ponerle un tutulo al marco
    }

}