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
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lapizzeria vista = new Lapizzeria();
        Scanner scanner = new Scanner(System.in);
        boolean indicador = false;
        int opcion = 0;
        while(indicador == false){
            vista.menu();
            System.out.println("Deseea comprar otra pizza...1. Si 2. No");
            opcion = scanner.nextInt();
            if(opcion != 1){
                indicador = true;
            }
        }
        
        
    }
    
}
