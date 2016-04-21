/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author brian
 */
import java.util.*;
public abstract class Pizza {
    protected String masa;
    protected String salsa = "Tomate";
    protected ArrayList<String> ingredientes = new ArrayList<>();
    protected int tiempoCoccion;
    protected String corte;
    protected String empaque;

    public void imprimirIngredientes(){
        System.out.println("Lista de ingredientes:");
        for(int i = 0; i<ingredientes.size(); i++){
            System.out.println((i+1)+"."+ingredientes.get(i));
        }
    }
    private void prepararYamasarMasa(String masa){
        System.out.println("Preparando la masa...");
        System.out.println("Amasando la masa...");
    }
    private void adicionarSalsas(String salsa){
        System.out.println("Adicionando salsa...");
    }
    private void adicionarIngredientes(ArrayList<String> ingredientes){
        System.out.println("Adicionando ingredientes...");
    }
    public void preparar(){
        prepararYamasarMasa(this.masa);
        adicionarSalsas(this.salsa);
        adicionarIngredientes(this.ingredientes);
    }
    public void hornear(int tiempoCoccion){
        for(int i = 0; i<tiempoCoccion; i++){
            System.out.println("Horneando su pizza...");
        }
    }
    public void cortar(){
        System.out.println("Cortando su pizza...");
    }
    public void empacar(){
        System.out.println("Empacando su pizza...");
    }
    public void entregar(){
        System.out.println("Pasos requeridos para la preparación de su pizza:");
        System.out.println("1. Masa utilizada: "+masa);
        System.out.println("2. Salsa utilizada: "+salsa);
        System.out.println("3. Ingredientes utilizados: "+ingredientes);
        System.out.println("4. Tiempo requerido para hornear: "+tiempoCoccion+" minutos");
        System.out.println("5. Corte utilizado: "+corte);
        System.out.println("6. Empaque utilizado: "+empaque);
    }
    
}
