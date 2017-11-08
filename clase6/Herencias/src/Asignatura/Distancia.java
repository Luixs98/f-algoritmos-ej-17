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
public class Distancia extends Asignatura{
    protected int numero_creditos;
public Distancia(int c){  
        super("Literatura","Troncal",300);
        setcreditos(c);       
}
public void setcreditos(int c){
numero_creditos = c;
}
  
public int getCreditos(){
     return numero_creditos; 
}
@Override
    public String toString(){
    
        return String.format("%s - %d", super.toString(), getCreditos());
    }
}

