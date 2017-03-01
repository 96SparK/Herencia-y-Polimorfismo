import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Circulo extends Figura
{
    private float radio;
    private Graphics2D g2;
    private int[]posx = new int[2];
    private int[]posy = new int[2];
    
    public Circulo(int x, int y, float Radio)
    {
        super(x,y);
        radio = Radio;
        posx[0] = 100;
        posy[0] = 100;
        posx[1] = 300;
        posy[1] = 300;
    }
    
    @Override
    public void dibuja(Graphics g)
    {
        Graphics2D g1 = (Graphics2D)g;
        g1.setColor(Color.RED);
        g1.drawPolyline(posx, posy, 5);
    }
}
