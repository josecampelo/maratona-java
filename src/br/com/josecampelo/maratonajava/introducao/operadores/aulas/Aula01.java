package br.com.josecampelo.maratonajava.introducao.operadores.aulas;

public class Aula01 {
    public static void main(String[] args) {
        // Operadores Aritméticos

        // Adição (+)
        int soma = 5 + 3;  // soma = 8
        double resultado = 5.5 + 2.3;  // resultado = 7.8
        String texto = "Olá, " + "Mundo!";  // texto = "Olá, Mundo!"

        // Subtração (-)
        int diferenca = 10 - 3;  // diferenca = 7
        double valor = 5.5 - 2.2;  // valor = 3.3
        int negativo = -10;  // negativo = -10

        // Multiplicação (*)
        int produto = 4 * 3;  // produto = 12
        double resultado2 = 2.5 * 4;  // resultado = 10.0

        // Divisão (/)
        int resultado3 = 10 / 2;  // resultado1 = 5
        double resultado4 = 10.0 / 4;  // resultado2 = 2.5
        // Divisão com números inteiros
        int x = 5 / 2;  // x = 2 (não 2.5)
        // Divisão com pelo menos um decimal
        double y = 5.0 / 2;  // y = 2.5

        // Módulo (%)
        int resto1 = 10 % 3;  // resto1 = 1 (10 / 3 = 3 e sobra 1)
        int resto2 = 15 % 4;  // resto2 = 3 (15 / 4 = 3 e sobra 3)
    }
}