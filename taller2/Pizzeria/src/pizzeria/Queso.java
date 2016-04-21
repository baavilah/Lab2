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
public class Queso extends Pizza {

    public Queso() {
        masa = "Corteza regular";
        ingredientes.add("Queso mozzarella fresco");
        ingredientes.add("Parmesano");
        tiempoCoccion = 5;
        corte = "Americano";
        empaque = "Caliente";
    }
    
}
