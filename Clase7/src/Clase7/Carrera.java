package Clase7;
public class Carrera {
 String nombre;
 int numero_asig;
 String modalidad;
    public Carrera(String nombre,int num_asig , String modalidad) {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.numero_asig+=num_asig;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero_asig() {
        return numero_asig;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero_asig(int numero_asig) {
        this.numero_asig = numero_asig;
    }

    @Override
    public String toString() {
        return (getNombre()+"\n"+getModalidad()+"\n"+getNumero_asig()+"\n"); 
    }
    
    
}
