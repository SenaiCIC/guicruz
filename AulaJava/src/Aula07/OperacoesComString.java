/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07;

/**
 *
 * @author Aluno
 */
public class OperacoesComString {
    public static void main(String[] args) {
        String n = "adailton";
        String nm = n.toUpperCase();
        System.out.println("maiúsula: "+nm);
        String nM = n.toLowerCase();
        System.out.println("Minuscula: "+nM);
        String rec = "Senai CIC é o melhor do Brasil";
        String sub = rec.substring(6,30);
        System.out.println("sub ="+sub);
        String rep = rec.replace("Brasil","Mundo");
        System.out.println("Replace= "+rep);
        int loc = rec.indexOf("ai");
        System.out.println("Localizado= "+loc);
        loc = rec.lastIndexOf("si");
        System.out.println("Localizado= "+loc);
        String sp = "laranja maçã banana";
        String[] vect = sp.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
