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
}
