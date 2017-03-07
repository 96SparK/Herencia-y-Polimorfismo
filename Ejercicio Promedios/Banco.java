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
    
    public float calculaPromedio()
    {
        float promedio = 0;
        
        return promedio;
    }
}
