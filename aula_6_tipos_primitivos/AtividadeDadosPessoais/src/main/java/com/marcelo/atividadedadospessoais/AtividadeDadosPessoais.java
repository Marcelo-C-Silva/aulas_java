package com.marcelo.atividadedadospessoais;

public class AtividadeDadosPessoais {

    public static void main(String[] args) {
        int idade = 27;
        double altura = 1.78;
        char letraInicialNome = 'J';
        boolean estudante = true;
        float peso = 68.00f;
        long populacao = 213421037;
        
        System.out.println("sua idade é " + idade );
        System.out.println("sua altura é " + altura );
        System.out.println("a primeira letra do seu nome é " + letraInicialNome );
        System.out.println("você é estudante? " + estudante );
        System.out.println("seu peso é " + peso );
        System.out.println("população brasileira é de " + populacao + " pessoas" );
    }
}
//int serve para armazenar numeros inteiros, ou seja, numnero sem virgula/ponto
//double já serve pra armazenar numeros quebrados, com ponto/virgula
//char guarda caractere
//boolean serve para decisões, verdadeiro ou falso, true ou false
//float tem quase a mesma capacidade do double, com menos qualidade, se eu quiser realmente um float, terei que colocar um "f"/"F" no final para que o compilador entenda
//long serve para colocar numeros extensos, se eu quisesse, poderia colocar um "l"/"L" no final