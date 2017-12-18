package lecturaArchivos;

import java.util.ArrayList;

public class Paralelo {

    String nombre;
    String apellido;
    ArrayList<Estudiante> listaEstudiantes;

    public void establecerListaEstudiantes(ArrayList<Estudiante> lista) {
        listaEstudiantes = lista;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }
    public void establecerApellido(String a){
        apellido=a;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerApellido() {
        return apellido;
    }

    public ArrayList<Estudiante> obtenerListaEstudiante() {
        return listaEstudiantes;
    }

    public double promedioNota1() {
        double valor = 0;
        for (int i = 0; i < obtenerListaEstudiante().size(); i++) {
            valor = valor + obtenerListaEstudiante().get(i).obtenerNota1();
        }

        return valor / obtenerListaEstudiante().size();
    }
        public double promedioNota2() {
        double valor = 0;
        for (int i = 0; i < obtenerListaEstudiante().size(); i++) {
            valor = valor + obtenerListaEstudiante().get(i).obtenerNota2();
        }

        return valor / obtenerListaEstudiante().size();
    }

}
