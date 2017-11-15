package Problema3;
public abstract class  Estudiante {
    String nombre;
    String apellido;
    int cedula;
    public abstract double valor_matricula();

    @Override
    public String toString() {
        return ("\nNombre: "+nombre+"\nApellido: "+apellido+"\nCedula: "+cedula+"\n"); 
    }

}
