/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

/**
 *
 * @author Aluno
 */
public class EscopoInicializacao {
    public static void main(String[] args) {
        int global = 3;
        String nome;
        if (global>5) {
            nome = "Xuxu";
        }else{
            nome = "Adailton"; 
        }
        System.out.println(global);
        System.out.println(nome);
    }
}
