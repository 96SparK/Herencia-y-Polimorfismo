import java.awt.Graphics;
import java.awt.Graphics2D;
abstract public class Figura
{
    //protected float area;
    private int posx;
    private int posy;
    public Figura(int x, int y)
    {
        //area = 0;
        posx = x;
        posy = y;
    }
    
    abstract public void dibuja(Graphics g);
    /**public float accedeArea()
    {
        return area;
    }
    
    void calcularArea()
    {
        System.out.println("Ops");
    }
    
    public String dimeInfo()
    {
        return ""+area;
    }
    @Override
    public boolean equals(Object obj)
    {
        return this.area == ((Figura)obj).area;
    }**/
}
