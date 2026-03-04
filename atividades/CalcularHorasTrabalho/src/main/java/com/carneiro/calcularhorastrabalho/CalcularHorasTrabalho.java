package com.carneiro.calcularhorastrabalho;

import java.util.Scanner;

public class CalcularHorasTrabalho {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular seu salário desse mês");
        
        System.out.println("Quanto você recebe por hora?");
        double valorPorHora = scan.nextDouble();
        
        System.out.println("Agora ponha quantas horas você traalhou");
        double horasTrabalhadas = scan.nextDouble();
        
        double calculoSalarioMes = valorPorHora * horasTrabalhadas;
        System.out.println("Seu salario desse mês está no valor de :"+ calculoSalarioMes );
    }
}

//Crie um programa que pergunte:
//Quanto o usuário ganha por hora
//Quantas horas trabalha no mês
//Com essas informações, o programa deve calcular e exibir o total do salário no referido mês.