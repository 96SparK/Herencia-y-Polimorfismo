import java.util.ArrayList;
public class Planeta
{
    private ArrayList <Pais> paises;
    public Planeta()
    {
        paises = new ArrayList<Pais>();
    }
    public void agregaPais(Pais nuevoPais)
    {
        paises.add(nuevoPais);
    }
    public int promeHabPaises()
    {
        int promedio = 0;
        for(int i = 0; i < paises.size(); i++)
        {
            Pais aux = paises.get(i);
            promedio += aux.dimeHabitantes();
        }
        
        return (promedio/= paises.size());
    }
}
