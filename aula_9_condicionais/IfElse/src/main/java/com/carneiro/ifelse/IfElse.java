
package com.carneiro.ifelse;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um Numero real e eu falarei se é negativo ou positivo");
        double numero = scan.nextDouble();
        
        if(numero >= 0){
            System.out.println("O numero é positivo");
        }else{
            System.out.println("o numero é negativo");
        }
    }
}
