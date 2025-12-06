package pack;

public class Tarea {
    public String Descrip;
    public int Prio;        // 1=Alta, 2=Media, 3=Baja
    public boolean Esta_Comp; 

    public Tarea(String Descrip, int Prio, boolean Esta_Comp) { 
        this.Descrip = Descrip;
        this.Prio = Prio; 
        this.Esta_Comp = Esta_Comp; 
    }

    public void cambiarACompletada() {
        if (Esta_Comp == false) {
            Esta_Comp = true; 
            System.out.println("¡Accion realizada: Tarea terminada!");
        } else {
            System.out.println("La tarea ya estaba lista.");
        }
    }

    public boolean esUrgente() {
        boolean respuesta = false;

        // AQUI ESTA LA LOGICA DE ALTA, MEDIA Y BAJA:
        // Solo entra si es 1 (Alta).
        // Si el usuario puso 2 (Media) o 3 (Baja), esta condicion no se cumple,
        // por lo tanto, la respuesta se queda en 'false' (No urgente).
        
        if (Prio == 1 && Esta_Comp == false) {
            respuesta = true;
        } 
        
        return respuesta;
    }
}