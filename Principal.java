public class Principal extends Figura
{
    private Triangulo triangulo;
    private Cuadrado cuadrado;
    private Circulo circulo;
    
    public void main(String []args)
    {
        metodoTriangulo();
        metodoCuadrado();
        metodoCirculo();
    }
    
    private void metodoTriangulo()
    {
        triangulo = new Triangulo(5,4);
        triangulo.calcularArea();
        System.out.println("El area del Triángulo es: "+triangulo.accedeArea());
    }
    
    private void metodoCuadrado()
    {
        cuadrado = new Cuadrado(5);
        cuadrado.calcularArea();
        System.out.println("El area del Cuadrado es: "+cuadrado.accedeArea());
    }
    
    private void metodoCirculo()
    {
        circulo = new Circulo(3);
        circulo.calcularArea();
        System.out.println("El area del Circulo es: "+circulo.accedeArea());
    }
}
