package br.com.josecampelo.maratonajava.introducao.tiposprimitivos;

public class Aula02 {
    public static void main(String[] args) {
        /*
            O Java possui 8 tipos primitivos, divididos em 4 categorias principais:
            1. * Inteiros: com 4 tipos difernetes -> bytem short, int e long
         */

        // byte pode armazenar 8 bits, com a faixa de valroes de -128 a 127
        byte valorByteMin = -128;
        byte valorByteMax = 127;

        // short pode armazenar 16 bits, com a faixa de valroes de -32.768 a 32.767
        short valorShortMin = -32768;
        short valorShortMax = 32767;

        // int pode armazenar 32 bits, com a faixa de valroes de -2³¹ a 2³¹-1
        int valorIntMin = -2147483648;
        int valorIntMax = 2147483647;

        // long pode armazenar 64 bits, com a faixa de valroes de -2⁶³ a 2⁶³-1
        long valorLongMin = -9223372036854775808L;
        long valorLongMax = 9223372036854775807L;

        // 2. * Ponte flutuante: com 2 tipos difernetes -> float, double

        // float pode armazenar 32 bits, com a faixa de valroes de ±3.4 × 10³⁸ (aprox.)
        float valorFloatMinNegativo = -3.40282347E+38f;
        float valorFloatMaxNegativo = -1.40129846E-45f;
        float valorFloatMinPositivo = 1.40129846E-45f;
        float valorFloatMaxPositivo = 3.40282347E+38f;

        // float pode armazenar 32 bits, com a faixa de valroes de ±3.4 × 10³⁸ (aprox.)
        double valorDoubleMinNegativo = -3.40282347E+38f;
        double valorDoubleMaxNegativo = -1.40129846E-45f;
        double valorDoubleMinPositivo = 1.40129846E-45f;
        double valorDoubleMaxPositivo = 3.40282347E+38f;

        // 3. * Caractere: com 1 tipo -> char

        // char pode armazenar 16 bits, com a faixa de valroes de 0 a 65.535 (Unicode)
        char valorCharMin = 0;
        char valorCharMax = 65535;

        // 4. * Booleano: com 1 tipo -> boolean

        // boolean pode armazenar 1 bit, com a faixa de valroes de true ou false
        boolean valorBooleanMin = false;
        boolean valorBooleanMax = true;
    }
}