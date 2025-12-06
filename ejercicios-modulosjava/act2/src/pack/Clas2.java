package pack;

public class Clas2 {
    public String Cod_vuelo;
    public int Asi_Res; 
    public int Cap_Max; 
    public int Costo; 

    public Clas2(String Cod_vuelo, int Asi_Res, int Cap_Max, int Costo) { 
        this.Cod_vuelo = Cod_vuelo;
        this.Asi_Res = Asi_Res; 
        this.Cap_Max = Cap_Max; 
        this.Costo = Costo; 
    }

    public void reservarAsientos(int Asi_P_Res) {
        if ((Asi_Res + Asi_P_Res) <= Cap_Max) {
            Asi_Res += Asi_P_Res; 
            System.out.println("¡Reservación exitosa!");
        } else {
            System.out.println("Capacidad de vuelo superada.");

        }
    }
    public double calcularPorcentajeDeOcupacion() {
        double porcentaje = Asi_Res * 100 / Cap_Max; 
        return porcentaje;
    }
    public int calcularIngresoBruto() {
        int ing_Bruto = Costo * Asi_Res;
        return ing_Bruto;
    }
}