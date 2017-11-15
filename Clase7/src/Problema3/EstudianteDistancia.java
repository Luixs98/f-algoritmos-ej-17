package Problema3;
public class EstudianteDistancia extends Estudiante{
double valor_fijo;
double procentaj_descuento;

    EstudianteDistancia(String nombres, String apellidos, int cedula, double valorfijo, int descuento) {
    this.apellido=apellidos;
    this.nombre=nombres;
    this.cedula=cedula;
    this.valor_fijo=valorfijo;
    this.procentaj_descuento=descuento;   
    }
    @Override
    public double valor_matricula() {
        double n1;
        n1=valor_fijo-(valor_fijo*(procentaj_descuento/100));
        return n1;
    }

    @Override
    public String toString() {
        return (super.toString()+"Valor fijo: "+valor_fijo+"\nDescuento: "+procentaj_descuento+
                "\nTotal a pagar: "+valor_matricula()+"\n");
    }
    
    
}
