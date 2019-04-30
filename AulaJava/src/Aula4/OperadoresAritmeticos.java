
package Aula4;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        //Operadores + Soma
        //Operadores - subtração
        //Operadores / Divisão
        //Operadores * Multiplicação
        //Operadores % Módulo
        
        int a = 5;
        int b = 2;
        int result;
        
        result = a % b;
        System.out.println("Módulo de A e B: "+result);
        result = a + b;
        System.out.println("Soma de A + B: "+result);
        result = a - b;
        System.out.println("Subtração de A + B: "+result);
        result = a * b;
        System.out.println("Multiplicação de A + B: "+result);
        result = a / b;
        System.out.println("Divisão de A + B: "+result);
        double resultado;
        resultado = (double) a/b;
        System.out.println("Multiplicação de A + B: "+resultado);
         
        
    }
}
