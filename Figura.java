public class Figura
{
    protected float area;
    
    public Figura()
    {
        area = 0;
    }
    
    public float accedeArea()
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
    }
}
