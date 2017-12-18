package lecturaArchivos;

import java.util.ArrayList;

public class Presentar {

    public static void main(String[] args) {

        LeerArchivo aplicacion = new LeerArchivo();
        aplicacion.abrirArchivo();
        ArrayList<Estudiante> lista = aplicacion.leerRegistros();
        Paralelo p = new Paralelo();
        p.establecerListaEstudiantes(lista);
        aplicacion.cerrarArchivo();
        double valor=0;
        System.out.println("Reporte Final\nLista de Estudiante\n");
        for (int i = 0; i < p.obtenerListaEstudiante().size(); i++) {
            System.out.println(p.obtenerListaEstudiante().get(i).obtenerNombre()+" "+p.obtenerListaEstudiante().get(i).obtenerApellido()+"\n");
            System.out.println("Matematicas: "+ p.obtenerListaEstudiante().get(i).obtenerNota1());
            System.out.println("Sociales: "+ p.obtenerListaEstudiante().get(i).obtenerNota2());
            valor = (p.obtenerListaEstudiante().get(i).obtenerNota1()+ p.obtenerListaEstudiante().get(i).obtenerNota2())/2;
            System.out.println("Promedio: "+valor+"\n");
            }
        System.out.println("Promedio Generales");
        System.out.println("Promedio resultante Mateticas: "+p.promedioNota1());
        System.out.println("Promedio resultante Mateticas: "+p.promedioNota2());
    }
}
