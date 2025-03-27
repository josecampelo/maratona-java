package br.com.josecampelo.maratonajava.introducao.tiposprimitivos.exercicios;
/**
 * Exercício 3 - Declaração e tamanho em memória
 * <p>
 * Escreva um programa que declare uma variável para cada tipo primitivo do Java<br>
 * <code>(byte, short, int, long, float, double, char, boolean)</code>.
 * </p>
 * <ol>
 *   <li>Inicialize essas variáveis com valores válidos.</li>
 *   <li>Use o metodo <code>System.out.println()</code> para imprimir o
 *   nome da variável, seu valor e o número de bytes que ela
 *   ocupa na memória (utilizando <code>Byte.SIZE / 8</code>).
 *   </li>
 * </ol>
 */
public class Exercicio03 {
    public static void main(String[] args) {
        byte valorByte = 100;
        short valorShort = 10000;
        int valorInt = 1000000000;
        long valorLong = 1000000000000000000L;
        float valorFloat = 1000000.1000000f;
        double valorDouble = 100000000000000000.10000000000000000;
        char valorChar = 'J';
        boolean valorBoolean = true;

        System.out.println("Nome: valorByte | Valor: " + valorByte + " | Número de bytes: " + Byte.SIZE / 8 + " | Número de bits: " + Byte.SIZE);
        System.out.println("Nome: valorShort | Valor: " + valorShort + " | Número de bytes: " + Short.SIZE / 8 + " | Número de bits: " + Short.SIZE);
        System.out.println("Nome: valorInt | Valor: " + valorInt + " | Número de bytes: " + Integer.SIZE / 8 + " | Número de bits: " + Integer.SIZE);
        System.out.println("Nome: valorLong | Valor: " + valorLong + " | Número de bytes: " + Long.SIZE / 8 + " | Número de bits: " + Long.SIZE);
        System.out.println("Nome: valorFloat | Valor: " + valorFloat + " | Número de bytes: " + Float.SIZE / 8 + " | Número de bits: " + Float.SIZE);
        System.out.println("Nome: valorDouble | Valor: " + valorDouble + " | Número de bytes: " + Double.SIZE / 8 + " | Número de bits: " + Double.SIZE);
        System.out.println("Nome: valorChar | Valor: " + valorChar + " | Número de bytes: " + Character.SIZE / 8 + " | Número de bits: " + Character.SIZE);
        System.out.println("Nome: valorBoolean | Valor: " + valorBoolean + " | Número de bytes: 1 ou 4 | Número de bits: 8 ou 64");
    }
}