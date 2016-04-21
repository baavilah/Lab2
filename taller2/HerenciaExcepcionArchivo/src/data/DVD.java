/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Estudiante
 */
public class DVD extends Soporte {
    private int duracion;
    private Autor[] actor;
    
    public DVD(String titulo, Autor autor, int duracion, Autor [] actor){
        super(titulo);
        super.setAutor(autor);
        this.duracion = duracion;
        this.actor = actor;
    
}
    
    @Override
    public String toString() {
        return "DVD{" + super.toString()+ " actor 1 = "+ actor[0] + " actor 2 = "+ actor[1] +" duracion = " + duracion + '}';
    }
    
}
