package Programacion.Carrera;

public class Principal {
    public static void main(String[] args) {
        Carrera c1= new Carrera();
        c1.Modifica_nombre("Informatica");
        c1.Modifica_modalidad("Distanacia");
        System.out.println(c1.Obtener_modalidad());
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.Obtener_modalidad());
        Carrera c3= new Carrera("Semiprecencial","Distanicia");
        System.out.println(c3.Obtener_modalidad());
        c3.Modifica_modalidad("Distancia");
        System.out.println(c3.Obtener_modalidad());
        c3.Modifica_modalidad(c3.Obtener_modalidad().toString());
}
}
