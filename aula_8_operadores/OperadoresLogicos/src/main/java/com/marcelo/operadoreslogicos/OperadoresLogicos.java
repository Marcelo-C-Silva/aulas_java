package com.marcelo.operadoreslogicos;


public class OperadoresLogicos {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        
        
        
        boolean resultado1 = (numero1 == 1 )&& (numero2 == 2);
        System.out.println("valor1 é igual a 1 E valor2 é 2 :" + resultado1);
        
        boolean resultado2 = (numero1 == 1 )|| (numero2 == 2);
        System.out.println("valor1 é igual a 1 OU valor2 é 2 :" + resultado2);
        
    }
}
