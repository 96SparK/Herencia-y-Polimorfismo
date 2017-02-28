public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float b, float a)
    {
        altura = a;
        base = b;
    }
    /**
    public void calcularArea()
    {
        area = base * altura / 2;
    }
    
    /*public String dimeInfo()
    {
        return "Triangulo " + super.dimeInfo();
    }
    
    @Override
    public String toString()
    {
        //return ""+area;
        return "Circulo con area = " + super.toString();
    }**/
}
