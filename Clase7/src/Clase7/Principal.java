package Clase7;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>();

        Carrera c1 = new Carrera("Sistemas", 10, "Distancia");
        Carrera c2 = new Carrera("Contabilidad", 11, "Presencial");
        Carrera c3 = new Carrera("Literatura", 20, "Semiprencencial");
        listaCarreras.add(c1);
        listaCarreras.add(c2);
        listaCarreras.add(c3);
        int tot_asig = 0;
        for (Carrera carrera1 : listaCarreras) {
            int i=0;
            i++;
            System.out.println("C"+i+"\n"+carrera1);
            tot_asig=tot_asig+carrera1.getNumero_asig();

        }

        System.out.println("Numero total de Materias: " + tot_asig);
    }
}
