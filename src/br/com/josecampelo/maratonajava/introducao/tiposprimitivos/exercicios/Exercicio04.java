package br.com.josecampelo.maratonajava.introducao.tiposprimitivos.exercicios;

/**
 * Exercício 4 - Casting
 * <p>
 * Imagine que um campeão do LoL ganha ouro ao abater tropas. O ouro é representado como um número <code>double</code>. Faça um programa que:
 * </p>
 * <ol>
 *   <li>Declare um <code>double ouroTotal = 3599.75;</code></li>
 *   <li>Converta esse valor para um <code>int</code> e imprima o resultado (o que aconteceu com os centavos?)</li>
 *   <li>Converta o <code>int</code> de volta para <code>double</code> e imprima o resultado (o valor mudou?)</li>
 * </ol>
 */
public class Exercicio04 {
    public static void main(String[] args) {
        double ouroTotal = 3599.75;
        System.out.println("Ouro total: " + ouroTotal + " (Valor total em double com casas decimais)");

        int ouroTotalInt = (int) ouroTotal;
        System.out.println("Ouro total: " + ouroTotalInt + "    (Valor de cast explícito de double para int. Tipo int ignora as casas decimais e coloca apenas o valor inteiro)");

        double ouroTotalDouble = ouroTotalInt;
        System.out.println("Ouro total: " + ouroTotalDouble + "  (Valor de cast implícito de int para double. Tipo double recebe todo o valor de int e coloca uma casa decimal)");
    }
}