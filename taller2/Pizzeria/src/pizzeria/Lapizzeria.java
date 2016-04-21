/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Lapizzeria {
    private Scanner sc;
    
    public Lapizzeria(){
        this.sc = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        System.out.println("Bienvenido a La Pizzería");
        System.out.println("Nuestro menú se compone de las siguientes pizzas: 1.Vegetariana 2.Pepperoni 3.Queso");
        System.out.println("Para escoger la pizza que desee escriba a continuación el número respectivo:");
        opcion = this.sc.nextInt();
        switch(opcion){
            case 1: 
                Pizza vegetariana = new Vegetariana();
                vegetariana.imprimirIngredientes();
                vegetariana.preparar();
                vegetariana.cortar();
                vegetariana.empacar();
                vegetariana.entregar();
                break;
            case 2:
                Pizza pepperoni = new Pepperoni();
                pepperoni.imprimirIngredientes();
                pepperoni.preparar();
                pepperoni.cortar();
                pepperoni.empacar();
                pepperoni.entregar();
                break;
            case 3:
                Pizza queso = new Queso();
                queso.imprimirIngredientes();
                queso.preparar();
                queso.cortar();
                queso.empacar();
                queso.entregar();
                break;
        }
        
        
    }
}
