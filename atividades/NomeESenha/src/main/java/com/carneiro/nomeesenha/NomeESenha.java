
package com.carneiro.nomeesenha;

import java.util.Scanner;


public class NomeESenha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String senha;
        System.out.println("digite seu nome");
        nome = scan.next();
        System.out.println("digite sua senha");
        senha = scan.next();
        
        while(nome.equals(senha)){
            System.out.println("A senha esta igual ao nome, não é permitido");
            System.out.println("tente novamente");
            System.out.println("digite seu nome");
            nome = scan.next();
            System.out.println("digite sua senha");
            senha = scan.next();
            
        }
        System.out.println("tudo certo, voce foi cadastrado.");
    }
}
