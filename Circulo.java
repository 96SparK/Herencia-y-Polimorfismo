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
    
    /*public String dimeInfo()
    {
        //return "Circulo " + super.dimeInfo();
        return "Circulo con area = " + super.toString();
    }*/
    
    @Override
    public String toString()
    {
        //return ""+area;
        return "Circulo con area = " + super.toString();
    }
}
