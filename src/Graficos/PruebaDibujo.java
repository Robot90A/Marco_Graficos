package Graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaDibujo {

    public static void main(String[]args){

        MarcoConDibujos mimarco = new MarcoConDibujos();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    
}

class MarcoConDibujos extends JFrame{

    public MarcoConDibujos(){

        Toolkit confiPantalla = Toolkit.getDefaultToolkit();

        setTitle("Prueba de libujo");

        setSize(400, 400);

        setLocation(0, 0);

        LaminaConFiguras milamina = new LaminaConFiguras();
        add(milamina);

        Image imagen = confiPantalla.getImage("src/Graficos/imagen.jpg");
        setIconImage(imagen);
        
        setVisible(true);

    }

}
class LaminaConFiguras extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g; //creamos una refundicion para convertir un objeto Graphics en Graphics2D
        
        //
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        
        //creamos la figura implementando objeto Graphics2D con las dimensiones del Rectangulo u otra figura
        g2.draw(rectangulo);
        
        //creamos un elipse, pero no le agregamos parametros porque usaremos el cuadrado como soporte para crear
        //el elipse
        Ellipse2D elipse = new Ellipse2D.Double();
        
        //con el metodo "setFrame" nos permite usar diferentes soportes para crear el elipse, en este caso el 
        //rectangulo
        elipse.setFrame(rectangulo);

        g2.draw(elipse);
        
        //podemos crear la figura he imprimirla directamente en el "g2.dra2" o hacerla de otra forma
        g2.draw(new Line2D.Double(100, 100, 300, 250)); 
        
        //nos permite sabe donde esta el centro de x figura, en este caso rectangulo que hicimos (eje x)
        double CentroenX  = rectangulo.getCenterX();
        
        //lo mismo pero en el eje Y
        double CentroenY = rectangulo.getCenterY();


        double radio = 130;

        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX + radio, CentroenY+radio);

        g2.draw(circulo);

    }

}