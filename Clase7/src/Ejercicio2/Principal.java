package Ejercicio2;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        TrabajadorFijo tf1 = new TrabajadorFijo(365.55, 35, "Andres", "Perez");
        TrabajadorPorHoras th1 = new TrabajadorPorHoras(2, 5.2, "Manuel", "Armijos");
        ArrayList<Trabajador> lista = new ArrayList<>();
        lista.add(tf1);
        lista.add(th1);
        System.out.println(tf1);
        System.out.println(th1);
        System.out.println("Sueldos:");
        for (Trabajador trabajador : lista) {
            System.out.println(trabajador.Obtener_sueldo());
        }

    }

}
