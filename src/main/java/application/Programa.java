/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Calcular;
import gui.TelaCalculadoraController;

/**
 *
 * @author rubem
 */
public class Programa {
    
    public static void main(String[] args) {
        
        Calcular calc = new Calcular();
        Calcular calc1 = new Calcular();
        Calcular calc2 = new Calcular();
        Calcular calc3 = new Calcular();
        Calcular calc4 = new Calcular();
        
        calc.soma(5, 4.59);
        System.out.println(calc.getResultado());
        System.out.println("");
        
        calc1.mediaAritmetica(4, 8, 16, 32, 64, 128, 256);
        System.out.println(calc1.getResultado());
        System.out.println("");
        
        calc2.subtracao(6, 1);
        System.out.println(calc2.getResultado());
        System.out.println("");
        
        calc3.divisao(15, 3);
        System.out.println(calc3.getResultado());
        System.out.println("");
        
        calc4.multiplicacao(2, 2, 2, 2, 2);
        System.out.println(calc4.getResultado());
        System.out.println("");
    }
}
