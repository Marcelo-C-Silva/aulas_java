
package com.carneiro.notasbimestre;

import java.util.Scanner;

public class NotasBimestre {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular sua media bimestral: ");
        
        System.out.println("Digite sua primeira nota:");
        double nota1 = scan.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        double nota2 = scan.nextDouble();
        
        System.out.println("Digite sua terceira nota: ");
        double nota3 = scan.nextDouble();
        
        
        double resultado = (nota1 + nota2 + nota3)/3;
        
        if(resultado >= 7){
            System.out.println("Sua nota foi: " + resultado);
            System.out.println("Aprovado");
        }else if(resultado == 6){
            System.out.println("Sua nota foi: " + resultado);
            System.out.println("Recuperação");
        }else{
            System.out.println("Sua nota foi: " + resultado);
            System.out.println("Reprovado");
        }
    }
}
//usei printf para organizar melhor os decimais