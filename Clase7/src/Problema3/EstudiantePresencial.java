package Problema3;
public class EstudiantePresencial extends Estudiante{
int num_creditos;
double valor_creditos;

    EstudiantePresencial(String nombres, String apellidos, int cedula, int creditos, double valorcreditos) {
    this.apellido=apellidos;
    this.nombre=nombres;
    this.cedula=cedula;
    this.num_creditos=creditos;
    this.valor_creditos=valorcreditos;
    
    }
    @Override
    public double valor_matricula() {
        double n1;
        n1=valor_creditos*num_creditos;
        return n1;
    }

    @Override
    public String toString() {
        return (super.toString()+"Num Creditos: "+num_creditos+"\nValor por credito: "+valor_creditos+
                "\nTotal a pagar: "+valor_matricula()+"\n");
    }
    
    
}
