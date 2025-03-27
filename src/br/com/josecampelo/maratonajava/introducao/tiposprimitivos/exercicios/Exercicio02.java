package br.com.josecampelo.maratonajava.introducao.tiposprimitivos.exercicios;

/**
 * Exercício 2 - Convenções de variáveis
 * <p>
 * Neste exercício, você deve criar variáveis para armazenar as seguintes
 * informações de um campeão do League of Legends:
 * </p>
 * <ul>
 *   <li>Nome do campeão (ex: "Yasuo")</li>
 *   <li>Quantidade de vida (ex: 575)</li>
 *   <li>Dano de ataque base (ex: 60.0)</li>
 *   <li>Se é um campeão corpo a corpo ou à distância
 *       (ex: <code>true</code> para corpo a corpo, <code>false</code> para à distância)
 *   </li>
 * </ul>
 * <p>
 * Siga as convenções de nomes de variáveis do Java. Depois, imprima essas informações no console.
 * </p>
 */
public class Exercicio02 {
    public static void main(String[] args) {
        String nomeCampeao = "Kha'Zix";
        int quantidadeVidaCampeao = 1100;
        double danoAtaqueBaseCampeao = 77.7;
        boolean isCorpoACorpo = true;

        System.out.println("------- Status do Campeão -------");
        System.out.println("Nome: " + nomeCampeao);
        System.out.println("Quantidade de vida: " + quantidadeVidaCampeao);
        System.out.println("Dano de ataque base: " + danoAtaqueBaseCampeao);
        System.out.println("Campeão é corpo a corpo?: " + (isCorpoACorpo ? "Sim" : "Não"));
        System.out.println("---------------------------------");
    }
}