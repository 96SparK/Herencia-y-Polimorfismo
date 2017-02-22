public class Circulo extends Figura
{
    static final double pi = 3.1416; // o usar Math.PI
    private float radio;
    
    public Circulo(float Radio)
    {
        radio = Radio;
    }
    
    public void calcularArea()
    {
        area = ((float)pi) * radio * radio;
    }
    
    public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }
}
