package br.com.josecampelo.maratonajava.introducao.tiposprimitivos.aulas;

public class Aula03 {
    public static void main(String[] args) {
        int numeroInteiro = 321321;
        double numeroDecimal = 789745.531;

        System.out.println("Valor do número inteiro: " + numeroInteiro);
        System.out.println("Valor do número decimal: " + numeroDecimal);

        numeroInteiro = (int) numeroDecimal;
        System.out.println("Valor do número decimal dentro do inteiro com casting: " + numeroInteiro);
        System.out.println("A parte decimal (0.531) é perdida, pois int só armazena números inteiros.");
    }
}