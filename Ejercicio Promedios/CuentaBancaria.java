public class CuentaBancaria implements Medible
{
    private int saldo;
    
    public CuentaBancaria(int Saldo)
    {
        saldo = Saldo;
    }
    
    public int obtenerMedida()
    {
        return saldo;
    }
}
