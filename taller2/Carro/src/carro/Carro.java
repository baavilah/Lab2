/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author EL MEJOR
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion1 = 1;

        while (opcion1 == 1) {
            System.out.println();
            System.out.println("Seleccione el tipo de auto que desea ver");
            System.out.println("1.Auto de lujo");
            System.out.println("2.AutoCompacto");
            System.out.println("3.Vagoneta");
            System.out.println("4.Camioneta");

            int opcion2 = 0;

            java.util.Scanner lectura = new java.util.Scanner(System.in);

            opcion2 = lectura.nextInt();
            
            Vehiculo autos [] = new Vehiculo [4];

            switch (opcion2) {
                case 1:
                    autos [0] = new AutoDeLujo(2, 21651, "Ferrari", 2017, 13549515.632);
                    autos[0].ToString();
                    break;
                case 2:
                    autos [1] = new AutoCompacto(2, 56487, "Mazda", 2014, 1345646.21);
                    autos [1].ToString();
                    break;
                case 3:
                    autos [2] = new Vagoneta(4, 45631, "Renault", 2012, 2563946.69);
                    autos [2].ToString();
                    break;
                case 4:
                    autos [3] = new Camioneta (500,3,1000,13265,"Renault", 2015, 30569789.654);
                    autos [3].ToString();
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            System.out.println();
            System.out.println("Desea continuar ingrese 1");
            System.out.println("Desea salir ingrese 2");
            
            opcion1 = lectura.nextInt();

        }

    }

}
