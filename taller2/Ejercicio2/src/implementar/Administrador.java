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
public class Administrador extends Empleado{
    
    private String puesto;

    public Administrador(String puesto, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.puesto = puesto;
    }
    
    @Override
    public void cobrar(){
        System.out.println(nombre + " gana 3'500.000");
        System.out.println();
    }
    
    @Override
    public void asistir(){
        System.out.println(nombre + " asiste a la Universidad a: ");
    }
    
    public void administrar(){
        System.out.println("administrar");
        System.out.println("Su puesto es: "+ puesto);
        System.out.println("Su jefe es: "+ jefe);
    }
    
}
