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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        System.out.println("Digite a 1º palavra: ");
        String x1 = xc.nextLine();
        System.out.println("Digite a 2º palavra: ");
        String x2 = xc.nextLine();
        System.out.println("Digite a 3º palavra: ");
        String x3 = xc.nextLine();
        System.out.println(x1+x2+x3);
        
        xc.close();
    }
}
