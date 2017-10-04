package tabla_de_multiplicar;
import java.util.Scanner;
public class Tabla_de_multiplicar {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int n=0;
        System.out.println("Porfavor ingrese un numero");
        n = leer.nextInt();
        int multi=12;
        for (int i = 0; i < multi; i++) {
            System.out.println((i+1)+" x " +n+ " = " +(i+1)*n);
        }
        System.out.println("Finalizado");
           
    }
    
}
