import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
public class Lienzo extends JPanel
{
    private ArrayList <Figura> figuras;
    private Triangulo tri1;
    private Cuadrado cua1;
    private Circulo cir1;
    
    public Lienzo()
    {
        tri1 = new Triangulo(100,100,50,40);
        cua1 = new Cuadrado(200,100,50);
        cir1 = new Circulo(300,100,50);
        
        figuras = new ArrayList<Figura>();
        
        figuras.add(tri1);
        figuras.add(cua1);
        figuras.add(cir1);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        for(Figura f: figuras)
        {
            f.dibuja(g);
        }
    }
}
