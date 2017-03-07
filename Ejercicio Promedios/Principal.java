public class Principal
{
    public static void main(String [] args)
    {
        Banco banco = new Banco();
        banco.agregaCuenta(new CuentaBancaria (100) );
        banco.agregaCuenta(new CuentaBancaria(200));
        banco.agregaCuenta(new CuentaBancaria(300));
        
        System.out.println("Saldo promedio: "+ banco.calculaSaldoProm());
        
        Planeta tierra = new Planeta();
        tierra.agregaPais(new Pais (25000000) );
        tierra.agregaPais(new Pais(32000000));
        tierra.agregaPais(new Pais(94000000));
        
        System.out.println("Promedio de habitantes: "+ tierra.promeHabPaises());
    }
}
