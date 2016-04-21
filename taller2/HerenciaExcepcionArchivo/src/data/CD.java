/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author brian
 */
public class CD extends Soporte{
    private int duracion;
    private Autor musico;
    private String genero;
    
    public CD(String titulo, Autor musico, String genero, int duracion,Autor autor){
        super(titulo);
        super.setAutor(autor);
        this.musico = musico;
        this.genero = genero;
        this.duracion = duracion;
    }
    @Override
    public String toString(){
        return "CD{" + super.toString()+ " musico = " +musico +" duracion = " + duracion + " genero = " + genero + '}';
    }
}
