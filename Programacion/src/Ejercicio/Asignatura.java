package Ejercicio;
public class Asignatura {
        private String Nombre;
        private int Creditos;
        Carrera carrera=new Carrera(); 
      
    public Asignatura(){
        
        Nombre="Informatica";
        Creditos=5;
    }
    public String toString(){
        String cadena = String.format("Asignatura:\nNombre: %s.\nCreditos: %s.\nCarrera: %s.\nModalidad: %s.\n",
        Nombre,Creditos,carrera.obtener_nombre(),carrera.obtener_modalidad());
        return cadena;
    }

}
