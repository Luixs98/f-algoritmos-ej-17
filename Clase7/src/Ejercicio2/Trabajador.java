package Ejercicio2;

public abstract class Trabajador {

    String nombres;
    String apellidos;

    public abstract double Obtener_sueldo();

    @Override
    public String toString() {
        return ("Nombre: " + nombres + "\nApellido: " + apellidos + "\n");
    }

}
