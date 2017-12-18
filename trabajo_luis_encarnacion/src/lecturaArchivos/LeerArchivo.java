package lecturaArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivo {

    private Scanner entrada;

    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("archivoNotas.csv"));
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } 
    } 
    public ArrayList<Estudiante> leerRegistros() {

        ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
        try 
        {

            while (entrada.hasNext()) {
               
                String cadena = entrada.nextLine();
                ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split("\\|")));

                String nombre = registro.get(0);
                String apellidos = registro.get(1);
                int matematicas = Integer.parseInt(registro.get(2));
                int sociales = Integer.parseInt(registro.get(3));
                Estudiante e = new Estudiante(nombre, apellidos, matematicas,sociales);
                lista.add(e);

            } 
        } 
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } 
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        return lista;
    }
    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); 
        }
    }
}
