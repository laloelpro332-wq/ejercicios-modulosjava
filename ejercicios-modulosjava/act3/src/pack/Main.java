package pack;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- CREAR NUEVA TAREA ---");
        System.out.println("Ingresa la descripcion de la tarea: ");
        String Texto = sc.next(); 
        
        System.out.println("Ingresa la Prioridad:");
        System.out.println("1 = Alta");
        System.out.println("2 = Media");
        System.out.println("3 = Baja");
        System.out.print("Escribe el numero (1, 2 o 3): ");
        
        int Num_Prioridad = sc.nextInt();
        
        boolean Ya_Termino = false; 

        Tarea MiTarea = new Tarea(Texto, Num_Prioridad, Ya_Termino); 
        
        System.out.println("---------------------------------");
        System.out.println(" Tarea: " + MiTarea.Descrip);
        System.out.println(" Prioridad Seleccionada: " + MiTarea.Prio);
        
        System.out.println(" ¿Es Urgente?: " + MiTarea.esUrgente());

        System.out.println("---------------------------------");
        System.out.println("Escribe 1 para marcar como COMPLETADA y 2 como INCOMPLETA: ");
        int confirmacion = sc.nextInt();
        
        System.out.println("--- REPORTE FINAL ---");
        
        if (confirmacion == 1) {
            MiTarea.cambiarACompletada();
        }
        
        System.out.println("Estado Completado: " + MiTarea.Esta_Comp);
        System.out.println("¿Es Urgente ahora?: " + MiTarea.esUrgente());
    }
}
