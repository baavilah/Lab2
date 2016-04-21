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
public class Profesor extends Empleado{
    
    private String carrera;

    public Profesor(String carrera, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.carrera = carrera;
    }
    
    @Override
    public void cobrar(){
        System.out.println(nombre + " gana 3'800.000");
        System.out.println();
    }
    
    @Override
    public void asistir(){
       System.out.println(nombre + " va a la Universidad a ");
    }
    
    public void enseñar(){
       System.out.println("enseñar");
       System.out.println(nombre + " enseña a estudiantes de " + carrera);
       System.out.println("su jefe es " + jefe);
    }
        
}
