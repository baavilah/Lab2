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
public class Implementar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion1 = 1;

        while (opcion1 == 1) {

            java.util.Scanner lectura = new java.util.Scanner(System.in);
            int opcion2;
            System.out.println();
            System.out.println("Eliga el objeto a imprimir");
            System.out.println("1.Estudiante");
            System.out.println("2.Administrador");
            System.out.println("3.Profesor");
            opcion2 = lectura.nextInt();

            switch (opcion2) {
                case 1:
                    Estudiante estudiante = new Estudiante(9, 'c', "Juan", "Bogotá", "7-3");
                    estudiante.ToString();
                    estudiante.asistir();
                    estudiante.estudiar();
                    break;

                case 2:
                    Administrador administrador = new Administrador("RecursosHumanos", "Juan", "Pedro", "Bogotá", "8-5");
                    administrador.ToString();
                    administrador.asistir();
                    administrador.administrar();
                    administrador.cobrar();
                    break;

                case 3:
                    Profesor profesor = new Profesor("Sistemas", "Decano", "Fabian", "Bogota", "2-5");
                    profesor.ToString();
                    profesor.asistir();
                    profesor.enseñar();
                    profesor.cobrar();
                    break;
                    
                default:
                    System.out.println();
                    System.out.println("Opcion incorrecta");
                    System.out.println();
                    break;

            }
            
            System.out.println("Desea continuar");
            System.out.println("1.Si");
            System.out.println("2.No");
            opcion1 = lectura.nextInt();

        }
    }

}
