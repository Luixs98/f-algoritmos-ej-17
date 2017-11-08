/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

/**
 *
 * @author Usuario
 */
public class Presencial extends Asignatura{
  int numero_horas;    

public void sethoras(int h){
numero_horas = h;
}
public int gethoras(){
    return numero_horas; 
}
public Presencial(int h){  
        super("Programacion","Comun",100);
        sethoras(h);   
    
}
@Override
    public String toString(){
    
        return String.format("%s - %d", super.toString(), gethoras());
    }
}