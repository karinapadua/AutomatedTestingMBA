package com.example.automatedSoftwareTesting;
public class Termo {

    private String termo;
    private char[] termoLido;

    public Termo(String t) {

    }

    public void lerTermo(String termoRecebido) {
        this.termoLido = termoRecebido.toLowerCase().toCharArray();
    }

    public boolean isPalindromo() {
        boolean palindrom = false;
        if (termoLido.length % 2 == 0) {
            for (int i = 0; i < termoLido.length / 2 - 1; i++) {
                if (termoLido[i] != termoLido[termoLido.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        } else {
            for (int i = 0; i < (termoLido.length - 1) / 2 - 1; i++) {
                if (termoLido[i] != termoLido[termoLido.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        }
        return palindrom;

    }
}
