package com.marcelo.atividadedadospessoais;

import java.util.Scanner;

public class AtividadeDadosPessoais {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bom dia, como posso lhe chamar?");
        String nome = input.next();
        System.out.println("coloque sua idade " );
        int idade = input.nextInt();
        System.out.println("Agora coloque sua altura");
        double altura = input.nextDouble();
        System.out.println("Qual a primeira letra do seu nome?");
        char primeiraLetra = input.next().charAt(0);
        System.out.println("você é estudante? ");   
        boolean estudante = input.nextBoolean();
        System.out.println("Qual seu peso?");
        float peso = input.nextFloat();
        System.out.println("Numero de população BR ");
        long populacao = input.nextLong();
        
        System.out.println("****************************************************");
        System.out.println("Certo, " + nome + " aqui esta seus dados");
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura );
        System.out.println("A primeira letra do seu nome é: " + primeiraLetra);
        System.out.println("Você é estudante?: " + estudante);
        System.out.println("Seu peso é: " + peso + "Kg");
        System.out.println("O numero populacional do Brasil é: " + populacao);
        System.out.println("****************************************************");
    }
}
//int serve para armazenar numeros inteiros, ou seja, numnero sem virgula/ponto
//double já serve pra armazenar numeros quebrados, com ponto/virgula
//char guarda caractere
//boolean serve para decisões, verdadeiro ou falso, true ou false
//float tem quase a mesma capacidade do double, com menos qualidade, se eu quiser realmente um float, terei que colocar um "f"/"F" no final para que o compilador entenda
//long serve para colocar numeros extensos, se eu quisesse, poderia colocar um "l"/"L" no final