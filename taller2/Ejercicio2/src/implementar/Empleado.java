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
public abstract class Empleado extends Persona{
    
    protected String jefe;

    public Empleado(String jefe, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }
    
    public abstract void cobrar();
}
