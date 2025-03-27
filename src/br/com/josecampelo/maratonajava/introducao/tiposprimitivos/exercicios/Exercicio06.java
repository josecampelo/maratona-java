package br.com.josecampelo.maratonajava.introducao.tiposprimitivos.exercicios;

/**
 * Exercício 6 - Misturando tudo
 * <p>Crie um programa que simula um dano causado por um campeão do LoL.</p>
 * <ol>
 *  <li>Declare uma variável int danoBase = 70;</li>
 *  <li>Declare uma variável double multiplicador = 1.25;</li>
 *  <li>Converta o dano base para double, multiplique pelo multiplicador e armazene o resultado em uma variável double danoFinal.</li>
 *  <li>Converta danoFinal de volta para int e imprima o resultado.</li>
 * </ol>
 */
public class Exercicio06 {
    public static void main(String[] args) {
        int danoBase = 70;
        double multiplicador = 1.25;
        double danoFinal = danoBase * multiplicador;
        int resultado = (int) danoFinal;

        System.out.println("O campeão recebeu " + resultado + " de dano!");
    }
}