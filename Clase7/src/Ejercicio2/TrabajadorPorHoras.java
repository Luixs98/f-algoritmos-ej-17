package Ejercicio2;

public class TrabajadorPorHoras extends Trabajador {

    double valor_horas, horas;

    public TrabajadorPorHoras(double valor_horas, double horas, String nombre, String apellido) {
        this.valor_horas = valor_horas;
        this.horas = horas;
        this.nombres = nombre;
        this.apellidos = apellido;
    }

    @Override
    public double Obtener_sueldo() {
        double n1 = valor_horas * horas;
        return n1;
    }

    @Override
    public String toString() {
        return ("Sueldo por horas:\n" + super.toString() + "Sueldo total: " + Obtener_sueldo() + "\n");

    }

}
