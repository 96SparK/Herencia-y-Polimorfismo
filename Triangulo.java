public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float b, float a)
    {
        altura = a;
        base = b;
    }
    
    public void calcularArea()
    {
        area = base * altura / 2;
    }
}
