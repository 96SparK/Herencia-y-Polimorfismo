public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float Lado)
    {
        lado = Lado;
    }
    
    public void calcularArea()
    {
        area = lado * lado;
    }
    
    /*public String dimeInfo()
    {
        return "Cuadrado " + super.dimeInfo();
    }*/
    
    @Override
    public String toString()
    {
        //return ""+area;
        return "Cuadrado con area = " + super.toString();
    }
}
