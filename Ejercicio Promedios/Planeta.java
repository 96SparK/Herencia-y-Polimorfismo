import java.util.ArrayList;
public class Planeta
{
    private ArrayList <Pais> paises;
    public Planeta()
    {
        paises = new ArrayList<Pais>();
    }
    public void agregaPais(Pais unpais)
    {
        paises.add(unpais);
    }
    public int promeHabPaises()
    {
        int promedio = 0;
        for(int i = 0; i < paises.size(); i++)
        {
            promedio += promedio; // checar
        }
        
        return promedio;
    }
}
