package Problema3;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
    EstudiantePresencial ep1=new EstudiantePresencial("Luis","Caicedo",112034,10,100);
    EstudiantePresencial ep2=new EstudiantePresencial("Ana","Alvarez",112034,20,200);
    EstudianteDistancia ed1=new EstudianteDistancia("Jose" , "Macas",11234,1000,20);
    EstudianteDistancia ed2=new EstudianteDistancia("Maro" , "Andrade",113567,500,10);
    ArrayList<Estudiante> lista=new ArrayList<Estudiante>();
    lista.add(ep1);
    lista.add(ep2);
    lista.add(ed1);
    lista.add(ed2);
        System.out.println(lista);
    double total=0;
    for(Estudiante estudiante:lista){
    total= total+estudiante.valor_matricula();
    }
        System.out.println("\nValor general a pagar: "+total);
    }
    }