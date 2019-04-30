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
public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            int res = num%2;
            if (res == 0) {
                System.out.println("O número é par");
        }else{
                System.out.println("O número é impar");
            }
        sc.close();
    }
}
