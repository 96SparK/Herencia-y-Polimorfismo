import java.util.ArrayList;
import java.util.Iterator;

public class Principal extends Figura
{
    public static void main(String []args)
    {
        Triangulo triangulo = new Triangulo(5,4);
        triangulo.calcularArea();
        //System.out.println("El area del Triángulo es: "+triangulo.accedeArea());
        
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.calcularArea();
        //System.out.println("El area del Cuadrado es: "+cuadrado.accedeArea());
        
        Circulo circulo = new Circulo(3);
        circulo.calcularArea();
        //System.out.println("El area del Circulo es: "+circulo.accedeArea());
        
        Figura [] figuras = new Figura[3];
        figuras[0] = triangulo;
        figuras[1] = cuadrado;
        figuras[2] = circulo;
     
        ArrayList<Figura> figs;
        figs = new ArrayList<Figura>();
        
        for(Figura f:figuras)
        {
            figs.add(f);
        }
        Iterator<Figura> it = figs.iterator();
        while(it.hasNext())
        {
            Figura fig = it.next();
            fig.calcularArea();
        }
        it = figs.iterator();
        while(it.hasNext())
        {
            Figura fig = it.next();
            //System.out.println("El area de la figura es: "+fig.accedeArea());
            System.out.println(""+fig);
        }
    }
}
