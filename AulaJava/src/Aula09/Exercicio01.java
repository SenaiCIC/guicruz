/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n1 = sc.nextDouble();
        double n2;
        while (n1>=0){
        System.out.println("Digite um número:");
            n1 = sc.nextDouble();
            n2 = Math.sqrt(n1);
            System.out.printf("%.3f %n",n2);   
        }
        System.out.println("Número negativo.");
    }
}
