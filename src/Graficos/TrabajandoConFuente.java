package Graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class TrabajandoConFuente {

    public static void main(String[]args){

        tamaño DGM = new tamaño();

        DGM.setVisible(true);
        DGM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
    
}

class tamaño extends JFrame{

    public tamaño(){

        Toolkit confi = Toolkit.getDefaultToolkit();

        setTitle("MARCO con el texto ");

        setSize(400,400);

        setLocation(0,0);

        Image IMgen = confi.getImage("src/Graficos/imagen.jpg");

        setIconImage(IMgen);

        Colores panel = new Colores();
        add(panel);

        panel.setForeground(Color.BLUE); //ponen en ese color, todo lo que escriba en el panel

    }

}

class Colores extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D D2D = (Graphics2D)g;

        Rectangle2D RCTGLE = new Rectangle2D.Double(200,200,200,200);
        
        D2D.draw(RCTGLE);

        Ellipse2D ELLip = new Ellipse2D.Double();

        ELLip.setFrame(RCTGLE);

        D2D.draw(ELLip);

        Font miFuente = new Font("Arial", Font.BOLD, 26); //podemos cambiar el tipo de letra

        D2D.setFont(miFuente); //importamos el tipo de letra

        D2D.setPaint(Color.RED); //le aplicamos color a la letra

        D2D.drawString("Sebastian", 100, 100); //con el metodo "drawString" provamos el tipo de letra 

        D2D.setFont(new Font("Calibri", Font.ITALIC, 12)); //otra forma de instanciar el Font

        D2D.setColor(new Color(200,20,200)); //alicamos rgb

        D2D.drawString("BEBESITA UA", 100, 200);

    }


}


