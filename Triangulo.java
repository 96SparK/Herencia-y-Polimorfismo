import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
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
        Graphics2D g1 = (Graphics2D)g;
        g1.setColor(Color.GREEN);
        g1.drawLine(super.dimeX(), super.dimeY(),super.dimeX() + (int)base/2, super.dimeY() + (int)altura);
        g1.drawLine(super.dimeX(), super.dimeY(),super.dimeX() - (int)base/2, super.dimeY() + (int)altura);
        g1.drawLine(super.dimeX() + (int)base/2, super.dimeY() + (int)altura, super.dimeX() - (int)base/2, super.dimeY() + (int)altura);
    }
}
