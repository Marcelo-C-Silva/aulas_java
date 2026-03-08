package com.carneiro.calculadorapesoideal;

import java.util.Scanner;

public class CalculadoraPesoIdeal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua altura para que possamos fazer o calculo do seu peso ideal");
        double altura = scan.nextDouble();
        
        double formulaHomem = (72.7*altura) - 58;
        double formulaMulher = (62.1*altura) - 44.7;
        
        double baixoPeso = 18.5;
        /**double normal = 24.9;
        double sobrepeso = 25.0;**/
        
        boolean resultado = (formulaHomem == baixoPeso) || (formulaMulher == baixoPeso);
        System.out.println("seu peso é "+ resultado+ "e esta abaixo.");
    }
}
