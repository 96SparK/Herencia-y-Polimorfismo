import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Principal
{
    static private Graphics g;
    public static void main(String [] args)
    {   
        Triangulo tri1 = new Triangulo(100,100,5,4);
        Cuadrado cua1 = new Cuadrado(200,100,5);
        Circulo cir1 = new Circulo(300,100,3);
        
        ArrayList <Figura> figuras = new ArrayList<Figura>();
        
        figuras.add(tri1);
        figuras.add(cua1);
        figuras.add(cir1);
        cir1.dibuja(g);
    }
}
