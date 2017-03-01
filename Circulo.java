import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Circulo extends Figura
{
    private float radio;
    private Graphics2D g2;
    
    public Circulo(int x, int y, float Radio)
    {
        super(x,y);
        radio = Radio;
    }
    
    @Override
    public void dibuja(Graphics g)
    {
        Graphics2D g1 = (Graphics2D)g;
        g1.setColor(Color.GREEN);
        g1.drawOval(super.dimeX(), super.dimeY(), (int)radio, (int)radio);
        g1.setColor(Color.BLUE);
        g1.fillOval(super.dimeX()+1, super.dimeY()+1, (int)radio-2, (int)radio-2);
    }
}
