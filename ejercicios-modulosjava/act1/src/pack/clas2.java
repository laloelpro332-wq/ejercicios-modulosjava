package pack;

public class clas2 {

    String id;
    String autor;
    boolean disponible;
    int anioPublicacion;

    public clas2(String id, String autor, int anioPublicacion) {
        this.id = id;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public void reservar() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("\n[SISTEMA]: El libro ha sido reservado con éxito.");
        } else {
            System.out.println("\n[SISTEMA]: Lo sentimos, el libro ya está ocupado.");
        }
    }

    public void verificarAntiguedad() {
        int anioActual = 2025;
        int antiguedad = anioActual - this.anioPublicacion;

        System.out.println("Antigüedad: " + antiguedad + " años.");
        
        if (antiguedad > 5) {
            System.out.println("-> Es APTO para préstamo (Cumple requisito de antigüedad).");
        } else {
            System.out.println("-> NO es apto para préstamo (Es muy reciente).");
        }
    }
    
    public void mostrarDatos() {
        System.out.println("\n--- Ficha del Libro ---");
        System.out.println("ID: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
    }
}
