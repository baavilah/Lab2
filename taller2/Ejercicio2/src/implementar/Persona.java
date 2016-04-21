/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementar;

/**
 *
 * @author EL MEJOR
 */
public abstract class Persona {
    
    protected String nombre;
    protected String domicilio;
    protected String horario;

    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
    }
    
    public abstract void asistir();
    
    public void ToString(){
        System.out.println();
        System.out.println("Nombre: "+ nombre);
        System.out.println("Domicilio: "+ domicilio);
        System.out.println("Horario: "+ horario);
    }
    
}
