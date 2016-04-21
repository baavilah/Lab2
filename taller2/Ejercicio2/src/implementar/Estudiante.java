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
public class Estudiante extends Persona {

    private int grado;
    private char grupo;

    public Estudiante(int grado, char grupo, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    @Override
    public void asistir(){
        System.out.println(nombre + " asiste al colegio");
    }
    
    public void estudiar(){
        System.out.println("Grado: "+ grado);
        System.out.println("Grupo: "+ grupo);
        System.out.println();
    }

}
