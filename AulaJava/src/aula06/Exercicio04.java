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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a 1º nota:");
        float n1 = sc.nextFloat();
        System.out.println("Digite a 2º nota:");
        float n2 = sc.nextFloat();
        System.out.println("Digite a 3º nota:");
        float n3 = sc.nextFloat();
        System.out.println("Digite a 4º nota:");
        float n4 = sc.nextFloat();
        float m = (n1+n2+n3+n4)/4;
        if(m<5){
            System.out.println("Reprovado!"+m);
        }
        if(m>=5&&m<6){
            System.out.println("Recuperção!"+m);
        }
        if(m>=6){
            System.out.println("Aprovado!"+m);
        }
        if(m>=9){
            System.out.println("Aprovado com louvor - Parabens!!"+m);
        }
        sc.close();
    }
}
