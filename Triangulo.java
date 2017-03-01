import java.awt.Graphics;
import java.awt.Graphics2D;
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(int x, int y, float b, float a)
    {
        super(x,y);
        altura = a;
        base = b;
    }
    
    @Override
    public void dibuja(Graphics g)
    {
        System.out.println("dibujando..");
    }
}
