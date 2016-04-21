/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.banco;

/**
 *
 * @author FamiliaOrjRod
 */
public class EjercicioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   System.out.println("Prueba de métodos clase Ahorros");     
        
   Ahorros prueba1 = new Ahorros(1, 50000, "Brian Ávila");
   prueba1.setPorcentajeDeInteres(0.25);
   prueba1.ConsultarDatos();
   prueba1.DepositarInteres();
   prueba1.Retirar(25000);
  System.out.println("");
  
  System.out.println("Prueba de métodos clase Cheques");
  
  Cheques prueba2 = new Cheques(2,50000, "Jhojan Rodríguez");
  prueba2.ConsultarDatos();
  prueba2.setComisionPorUsoC(0.04);
  prueba2.setComisionECSI(0.02);
  prueba2.Retirar(90000);
  prueba2.ConsultarDatos();
  System.out.println("");
  System.out.println("");
  
  System.out.println("Prueba de métodos generales");
  
  prueba2.Retirar(25000);
  prueba2.ConsultarDatos();
  prueba2.Retirar(30000);
  prueba2.Depositar(50000);
  prueba2.ConsultarDatos();
        
        
    }
    
}
