public class Principal extends Figura
{
    public static void main(String []args)
    {
        Triangulo triangulo = new Triangulo(5,4);
        triangulo.calcularArea();
        System.out.println("El area del Triángulo es: "+triangulo.accedeArea());
        
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.calcularArea();
        System.out.println("El area del Cuadrado es: "+cuadrado.accedeArea());
        
        Circulo circulo = new Circulo(3);
        circulo.calcularArea();
        System.out.println("El area del Circulo es: "+circulo.accedeArea());
        
        Figura [] figuras = new Figura[3];
        figuras[0] = triangulo;
        figuras[1] = cuadrado;
        figuras[2] = circulo;
        
        for(int i = 0; i < figuras.length;i++)
        {
            figuras[i].calcularArea();
        }
        for(int i = 0; i < figuras.length;i++)
        {
             System.out.println("El area de la figura es: "+figuras[i].accedeArea());
        }
    }
}
