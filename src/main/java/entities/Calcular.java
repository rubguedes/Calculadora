/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


/**
 *
 * @author rubem
 */

/**
 * @version 1.0.1
 * Realiza operações aritméticas considerando os parâmetros.
 * 
 * @author rubem
 */
public class Calcular {
    private double resultado;

    public Calcular() {
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void soma (double... valores) 
    {   
        double som = 0;
        
        for (int i = 0; i < valores.length; i++) {
            som += valores[i];
        }
        
        double result = som;
        
        setResultado(result);
    }
    
    public void mediaAritmetica (double... valores) {
        int quantidadeNumeros = valores.length;
        double som = 0;
        
        for (int i = 0; i < valores.length; i++) {
            som += valores[i];
        }
        
        double result = som / quantidadeNumeros;
        
        setResultado(result);
    }
    
    public void subtracao (double... valores){
        double som = 0;
        
        for (int i = 0; i < valores.length; i++) {
            som -= valores[i];
        }
        
        double result = som;
        
        setResultado(result);
    }
    
    public void divisao (double dividendo, double divisor) {
        double result = dividendo / divisor;
        
        setResultado(result);
    }
    
    public void multiplicacao (double... valores) {
        double soma = 1;
        
        for (int i = 0; i < valores.length; i++) {
            soma = soma * valores[i];
        }
        
        double result = soma;
        
        setResultado(result);
    }
}
