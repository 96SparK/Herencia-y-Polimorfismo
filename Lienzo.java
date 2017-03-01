import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
public class Lienzo extends JPanel
{
    public Lienzo()
    {
        Triangulo tri1 = new Triangulo(100,100,5,4);
        Cuadrado cua1 = new Cuadrado(200,100,5);
        Circulo cir1 = new Circulo(300,100,3);
        
        ArrayList <Figura> figuras = new ArrayList<Figura>();
        
        figuras.add(tri1);
        figuras.add(cua1);
        figuras.add(cir1);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawString("Hola Mundo", 100, 200);
        g2.drawRect(50,30,20,40);
        g2.drawLine(60,70,100,90);
    }
}
