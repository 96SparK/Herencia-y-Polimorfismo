
public class Pais implements Medible
{
   private int habitantes;
   
   public Pais(int Habitantes)
   {
       habitantes = Habitantes;
   }
   
   public int obtenerMedida()
   {
       return habitantes;
   }
}
