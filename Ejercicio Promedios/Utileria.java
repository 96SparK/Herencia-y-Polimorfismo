
public class Utileria
{
    public static float calculaPromedio(Medible []coleccion)
    {
        float promedio = 0;
        
        for(Medible f: coleccion)
        {
            promedio += f.obtenerMedida();
        }
        
        if(coleccion.length > 0)
        {
            return promedio/coleccion.length;
        }
        else
        {   
            return promedio;
        }
    }
}
