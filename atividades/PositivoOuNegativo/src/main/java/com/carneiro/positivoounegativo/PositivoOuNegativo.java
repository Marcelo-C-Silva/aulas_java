

package com.carneiro.positivoounegativo;

import java.util.Scanner;


public class PositivoOuNegativo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor");
        double numero1 = scan.nextDouble();
        
        if(numero1 > 0){
            System.out.println("O valor é positivo");
        }else{
            System.out.println("O valor é negativo");
        }
    }
}
