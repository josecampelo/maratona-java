package br.com.josecampelo.maratonajava.introducao.operadores.aulas;

public class Aula03 {
    public static void main(String[] args) {
        // AND = &&
        // OR = ||
        // Negação = !

        int vida = 1000;
        int dano = 500;
        boolean isVivo = vida > 0 && dano < vida;
        System.out.println("Está vivo? " + isVivo);

        dano = 7000;
        isVivo = vida > 0 && dano < vida;
        System.out.println("Está vivo? " + isVivo);
    }
}