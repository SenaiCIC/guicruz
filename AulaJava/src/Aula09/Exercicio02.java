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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você deseja somar?:");
        int n = sc.nextInt();
        int c = 0;
        int tot = 0;
        int n1;
        while(c<n){
            c++;
            System.out.println("Digite o "+c+"º valor");
            tot = tot+(n1 = sc.nextInt());
        }
        System.out.println("O resultado é: "+tot);
    }
}
