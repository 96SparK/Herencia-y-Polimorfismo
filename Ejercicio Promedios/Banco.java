import java.util.ArrayList;
public class Banco
{
    private ArrayList <CuentaBancaria> cuentas;
    
    public Banco()
    {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void agregaCuenta(CuentaBancaria cuenta)
    {
        cuentas.add(cuenta);
    }
    
    public float calculaSaldoProm()
    {
        float promedio = 0;
        
        for(int i = 0; i < cuentas.size(); i++)
        {
            CuentaBancaria aux = cuentas.get(i);
            promedio += (float)aux.dimeSaldo();
        }
        
        return (promedio/= cuentas.size());
    }
}
