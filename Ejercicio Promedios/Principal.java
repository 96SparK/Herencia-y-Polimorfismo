public class Principal
{
    public static void main(String [] args)
    {
        Medible[] arr_1 = new Medible[3];
        
        arr_1[0] = new CuentaBancaria(100);
        arr_1[1] = new CuentaBancaria(200);
        arr_1[2] = new CuentaBancaria(300);
        
        System.out.println("Saldo promedio: "+ Utileria.calculaPromedio(arr_1));
        
        Medible[] arr_2 =  new Medible[3];
        arr_2[0] = new Pais(25);
        arr_2[1] = new Pais(32);
        arr_2[2] = new Pais(94);
        
        System.out.println("Promedio de habitantes: "+ Utileria.calculaPromedio(arr_2));
    }
}
