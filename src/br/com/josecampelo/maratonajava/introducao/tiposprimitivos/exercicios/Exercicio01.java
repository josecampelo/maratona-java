package br.com.josecampelo.maratonajava.introducao.tiposprimitivos.exercicios;

    /* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
    Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>,
    na data <data>. */

public class Exercicio01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String nome = "José Campelo";
        String endereco = "Rua Aprendendo Java, número 14, Bairro Backend";
        double salario = 5000.0;
        String dataRecebimentoSalario = "01/08/2025";

        stringBuilder
                .append("Eu ").append(nome).append(" morando no endereço ")
                .append(endereco).append(" confirmo que recebi o salário de ")
                .append(salario).append(", na data ").append(dataRecebimentoSalario)
                .append(".");

        System.out.println(stringBuilder);
    }
}