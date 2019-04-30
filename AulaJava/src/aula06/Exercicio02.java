/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite seu peso: ");
            int peso = sc.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
            double imc = peso/(altura*altura);
            System.out.printf("Seu nome é: %s ,idade: %d seu imc %.2f%n= ",nome,idade,imc);
            
        sc.close();
    }
}
