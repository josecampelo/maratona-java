package br.com.josecampelo.maratonajava.introducao.tiposprimitivos.exercicios;

/**
 * Exercício 5 - Trabalhando com Strings
 * <p>Escreva um programa que:</p>
 * <ol>
 *  <li>Crie uma variável <code>String</code> chamada <code>nomeCampeao</code> e atribua o nome de um campeão (ex: <code>"Ahri"</code>).</li>
 *  <li>Use o método <code>length()</code> para imprimir o número de caracteres desse nome.</li>
 *  <li>Use <code>toUpperCase()</code> e <code>toLowerCase()</code> para exibir o nome do campeão em maiúsculas e minúsculas.</li>
 *  <li>Verifique se o nome do campeão começa com a letra <code>"A"</code> usando o método <code>startsWith()</code>.</li>
 * </ol>
 */
public class Exercicio05 {
    public static void main(String[] args) {
        String nomeCampeao = "Kha'Zix";
        System.out.println(nomeCampeao + " tem " + nomeCampeao.length() + " caracteres");
        System.out.println(nomeCampeao + " em maiúsculas: " + nomeCampeao.toUpperCase());
        System.out.println(nomeCampeao + " em minúsculas: " + nomeCampeao.toLowerCase());
        System.out.println("É true ou false que " + nomeCampeao + " começa com a letra K?: " + nomeCampeao.startsWith("K"));
    }
}