import java.awt.Graphics;
import java.awt.Graphics2D;
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(int x, int y, float Lado)
    {
        super(x,y);
        lado = Lado;
    }
    
    @Override
    public void dibuja(Graphics g)
    {
        System.out.println("dibujando..");
    }
}
