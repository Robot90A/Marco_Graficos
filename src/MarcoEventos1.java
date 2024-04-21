import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MarcoEventos1 {

    public static void main(String[]args){

        MarcoFrame objetoEven = new MarcoFrame();

        objetoEven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objetoEven.setVisible(true);

    }
    
}

class MarcoFrame extends JFrame{

    public MarcoFrame(){

        setTitle("Eventos");

        setSize(500, 300);

        setLocation(100, 100);

        MarcoFrame2 lamina = new MarcoFrame2();
        add(lamina);

    }

}

class MarcoFrame2 extends JPanel implements ActionListener{

    JButton  botonAzul = new JButton("Azul"); //creamos un boton

    JButton botonAmarillo = new JButton("Amarillo");

    JButton botonRojo = new JButton("Rojo");

    public MarcoFrame2(){ 

        add(botonAzul); //agregamos el boton

        add(botonAmarillo);

        add(botonRojo);
        
        //el "addActionLister" es de tipo "Click"
        botonAzul.addActionListener(this); //elijimos el oyente que en este caso es "MarcoFrame" que es la lamina

        botonRojo.addActionListener(this);

        botonAmarillo.addActionListener(this);


    }
    
    @Override
    public void actionPerformed(ActionEvent e){ //implementamos el metodo de "ActionListener"
        
        Object botonPulsado = e.getSource(); //permite captura el origen del evento 

        if(botonPulsado == botonAzul ){

            setBackground(Color.BLUE); //programamos lo que vamos hacer
        }

        else if(botonPulsado == botonRojo){

            setBackground(Color.RED);
        }

        else{

            setBackground(Color.YELLOW);
        }
        

    }


}
