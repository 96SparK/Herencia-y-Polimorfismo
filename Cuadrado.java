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
        Graphics2D g1 = (Graphics2D)g;
        g1.drawRect(super.dimeX(),super.dimeY(),(int)lado,(int)lado);
    }
}
