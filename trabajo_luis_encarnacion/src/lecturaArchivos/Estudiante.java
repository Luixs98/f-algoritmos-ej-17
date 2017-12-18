package lecturaArchivos;

public class Estudiante {

    private String nombres;
    private String apellidos;
    private double matematicas;
    private double sociales;

    public Estudiante(String n, String a, int m, int s) {
        nombres = n;
        apellidos = a;
        matematicas = m;
        sociales=s;
        
    }

    public String obtenerNombre() {
        return nombres;
    }

    public String obtenerApellido() {
        return apellidos;
    }

    public double obtenerNota1() {
        return matematicas;
    }
    public double obtenerNota2() {
        return sociales;
    }
}
