public class Principal
{
    public static void main(String [] args)
    {
        Banco banco = new Banco();
        banco.agregaCuenta(new CuentaBancaria (100) );
        banco.agregaCuenta(new CuentaBancaria(200));
        banco.agregaCuenta(new CuentaBancaria(300));
        
        System.out.println("Saldo promedio: "+ banco.calculaSaldoProm());
    }
}
