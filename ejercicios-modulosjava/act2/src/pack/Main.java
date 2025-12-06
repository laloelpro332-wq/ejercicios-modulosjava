package pack;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Asi_Res = 49; 
        int Cap_Max = 50;
        int Costo = 200;
        Clas2 Vuelo = new Clas2("IBZ-402", Asi_Res, Cap_Max, Costo); 
        
        System.out.println(" Vuelo " + Vuelo.Cod_vuelo);
        System.out.println("Ingresa el número de asientos a reservar: ");
        int num_Res = sc.nextInt();
        
        System.out.println("Reporte Final");
        Vuelo.reservarAsientos(num_Res);
        
        System.out.println("Asientos Reservados : " + Vuelo.Asi_Res);
        
        System.out.println("Porcentaje de Ocupación: "+ Vuelo.calcularPorcentajeDeOcupacion() + "%");
        
        System.out.println("Ingreso Bruto Total: $" + Vuelo.calcularIngresoBruto());
    }
}