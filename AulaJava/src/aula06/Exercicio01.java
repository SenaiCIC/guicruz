/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {
    public static void main(String[] args) {
        String produto1 = " COMPUTADOR";
        String produto2 = "MESA";
        int idade = 30;
        int codigo = 3200;
        char sexo = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        System.out.println("Produtos: ");
        System.out.println(produto1+" com preco de "+preco1);
        System.out.println(produto2+"com preco de "+preco2);
        System.out.printf("idade: %d, codigo %d e sexo: %c%n",idade,codigo,sexo);
        System.out.printf("medida com 8 casas: %.8f%n",medida);
        System.out.printf("medida com 8 casas: %.3f%n",medida);
    }
}
