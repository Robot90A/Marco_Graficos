package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujo2 {

    public static void main(String[]args){

        Cuadro imprimir = new Cuadro();

        imprimir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imprimir.setVisible(true);

    }
    
}


class Cuadro extends JFrame{

    public Cuadro(){

        Toolkit ipconfig = Toolkit.getDefaultToolkit();

        setTitle("Cuadrado del diagrama");

        setSize(400, 400);

        setLocation(0, 0);

        Image img = ipconfig.getImage("src/Graficos/imagen.jpg");
        setIconImage(img);

        color_dibujo DBJ = new color_dibujo();

        add(DBJ);

        DBJ.setBackground(Color.YELLOW); //darle un color a toda la lamina

        //DBJ.setBackground(SystemColor.window); si quieres el color de la ventana de window

    }

}

class color_dibujo extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D G2Figuras = (Graphics2D)g;

        Rectangle2D cuadrado = new Rectangle2D.Double(200,200,200,200);

        G2Figuras.setPaint(Color.BLACK); //pintamos el trazo del rectangulo
        G2Figuras.draw(cuadrado);
        
        G2Figuras.setPaint(Color.RED);// permite rellenar el color del trazo
    
        G2Figuras.fill(cuadrado); // para pedirle que rellene la figura es necesario el metodo fille

        Ellipse2D damecirculo = new Ellipse2D.Double();

        damecirculo.setFrame(cuadrado);

        //Color dameMIlindoCOLO = new Color(100,200,300); //otra forma de aplicar el color 
        
        //sistema RGB PARA CREAR nuevos colores  //tambien se puede usar el metodo "darker" para oscureser el color
        G2Figuras.setPaint(new Color(109,172,59).brighter().darker());//el metodo beighhter nos permite darle brillo a los colores 

        G2Figuras.fill(damecirculo); 

    }
    
}
