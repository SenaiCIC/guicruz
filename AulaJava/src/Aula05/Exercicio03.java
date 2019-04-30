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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite a 1º palavra: ");
        String n1 = x.next();
        System.out.println("Digite a 2º palavra: ");
        String n2 = x.next();
        System.out.println("Digite a 3º palavra: ");
        String n3 = x.next();
        System.out.println(n1+" "+n2+" "+n3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
