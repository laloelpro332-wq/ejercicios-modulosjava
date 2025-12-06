package pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- REGISTRO DE NUEVO LIBRO ---");

        System.out.print("Ingrese el ID del libro: ");
        String idUsuario = entrada.nextLine();

        System.out.print("Ingrese el Autor del libro: ");
        String autorUsuario = entrada.nextLine();

        System.out.print("Ingrese el Año de publicación: ");
        int anioUsuario = entrada.nextInt();

        clas2 miLibro = new clas2(idUsuario, autorUsuario, anioUsuario);

        miLibro.mostrarDatos();

        System.out.println("\n--- Verificando requisitos ---");
        miLibro.verificarAntiguedad();

        System.out.println("\n--- Gestión de Préstamos ---");
        System.out.println("¿Desea reservar este libro? (Escriba 1 para SI, 0 para NO): ");
        int respuesta = entrada.nextInt();

        if (respuesta == 1) {
            miLibro.reservar();
        } else {
            System.out.println("Operación cancelada.");
        }

        miLibro.mostrarDatos();
    }
}
