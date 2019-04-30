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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas vem o bonde?");
        int hora = sc.nextInt();
        if(hora<12){
            System.out.println("Bom Dia!");
        }
        if(hora>=12&&hora<18){
            System.out.println("Boa Tarde!");
        }
        if(hora>=18){
            System.out.println("Boa Noite!");
        }
        sc.close();
    }
}
