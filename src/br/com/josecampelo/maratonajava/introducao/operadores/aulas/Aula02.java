package br.com.josecampelo.maratonajava.introducao.operadores.aulas;

public class Aula02 {
    public static void main(String[] args) {
        /*
        * Operadores Relacionais
        * > (Maior)
        * < (Menor)
        * == (Igual)
        * >= (Maior ou igual)
        * <= (Menor ou igual)
        * != (Diferente)
        * */

        int a = 7;
        int b = 5;
        boolean isAMaiorQueB = a > b;
        boolean isAMenorQueB = a < b;
        boolean isAIgualB = a == b;
        boolean isAMaiorOuIgualQueB = a >= b;
        boolean isAMenorOuIgualQueB = a <= b;
        boolean isADiferenteQueB = a != b;

        System.out.println("a = 7 e b = 5");
        System.out.println("a > b = " + isAMaiorQueB + " (A é maior que B?)");
        System.out.println("a < b = " + isAMenorQueB + " (A é menor que B?)");
        System.out.println("a == b = " + isAIgualB + " (A é igual a B?)");
        System.out.println("a >= b = " + isAMaiorOuIgualQueB + " (A é maior ou igual a B?)");
        System.out.println("a <= b = " + isAMenorOuIgualQueB + " (A é menor ou igual a B?)");
        System.out.println("a != b = " + isADiferenteQueB + " (A é diferente que B?)");
    }
}