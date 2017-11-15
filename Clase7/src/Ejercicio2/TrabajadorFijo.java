package Ejercicio2;

public class TrabajadorFijo extends Trabajador {

    double sueldo_mensual, valor_seguro;

    public TrabajadorFijo(double sueldo_mensual, double valor_seguro, String nombre, String apellido) {
        this.sueldo_mensual = sueldo_mensual;
        this.valor_seguro = valor_seguro;
        this.nombres = nombre;
        this.apellidos = apellido;
    }

    @Override
    public double Obtener_sueldo() {
        double n3 = sueldo_mensual + valor_seguro;
        return n3;
    }

    @Override
    public String toString() {
        return ("Sueldo Fijo:\n" + super.toString() + "Sueldo total : " + Obtener_sueldo() + "\n");

    }

}
