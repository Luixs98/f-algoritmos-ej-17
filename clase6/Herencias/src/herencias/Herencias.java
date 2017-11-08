/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        Profesor p = new Profesor (1000.1);
        System.out.println(p.getNombre());
        Profesor p1 = new Profesor();
        System.out.println(p1.getNombre());
        Profesor p2 = new Profesor("luiz","Alvarez",20,30002);
        System.out.println(p2.getNombre());
        Estudiante e2 = new Estudiante("Jean","Samaniego",13,102);
        System.out.println(e2);
        Profesor p3 = new Profesor("Santiago","Velez",27,298.3);
        System.out.println(p3);*/
    Profesor p2 = new Profesor("luiz","Alvarez",20,30002);
    System.out.println(p2.getNombre());
    Presencial prese = new Presencial(100);
    
    }
    
}
