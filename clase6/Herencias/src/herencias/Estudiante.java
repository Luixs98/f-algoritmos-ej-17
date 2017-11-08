/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import Asignatura.Presencial;
/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private Presencial asignaturas;
    
    public Estudiante (){
       super (null,null,0);
    }
    
    public Estudiante(String n, String a, int e, double mat){
        super(n, a, e);       
    }
    
    public void setAsignatura(String [] asignaturas){
        asignaturas = a;
    }
    
    public String[] getAsignaturas (){
        return asignaturas;
    }
    public void obtener_valor_matricula(){
        
    }
    public void setEdad(int e){
         if (e<18){
             edad = 18;
         }else{
             edad = e;
         }
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
