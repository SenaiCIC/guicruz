/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = x.nextInt();
        System.out.println("Digite o sugundo número: ");
        int n2 = x.nextInt();
        int n3 = n1 + n2;
        System.out.println("O resultado é: " + n3);
        
    }
}
