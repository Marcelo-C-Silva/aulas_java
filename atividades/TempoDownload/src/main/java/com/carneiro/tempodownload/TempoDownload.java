
package com.carneiro.tempodownload;

import java.util.Scanner;
public class TempoDownload {

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo (MB):");
        double tamanho = scan.nextDouble();

        System.out.println("Digite a velocidade da internet (Mbps):");
        double velocidade = scan.nextDouble();

        double tempoSegundos = (tamanho * 8) / velocidade;

        double tempoMinutos = tempoSegundos / 60;

        System.out.println("Tempo aproximado de download: " + tempoMinutos + " minutos");

    }
}
