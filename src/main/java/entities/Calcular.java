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
    private boolean verdadeiro;
    private String resultString;

    public Calcular() {
    }

    public String getResultString() {
        return resultString;
    }

    public void setResultString(String resultString) {
        this.resultString = resultString;
    }

    public boolean isVerdadeiro() {
        return verdadeiro;
    }

    public void setVerdadeiro(boolean verdadeiro) {
        this.verdadeiro = verdadeiro;
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
    
    public void fatorial (int valor) {
        int fatorial = valor;
        int result = 1;
        
        while (fatorial > 1) {
            result *= fatorial;
            
            fatorial--;
        }
        
        setResultado(result);
    }
    
    public void isPrimo (int valor) {
        int cont = 0;
        
        for (int i = 1; i < valor; i++) {
            
            if (valor % i == 0) {
                cont++;
            }
            
        }
        
        if (cont > 2){
            setVerdadeiro(true);
        }
        else {
            setVerdadeiro(false);
        }
    }
    
    public void potenciacao (double base, int expoente) {
        double result = Math.pow(base, expoente);
        
        setResultado(result);
    }
    
    public void raizQuadrada (double valor) {
        double result = Math.sqrt(valor);
        
        setResultado(result);
    }
}
