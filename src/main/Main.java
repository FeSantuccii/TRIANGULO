package main;

import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // Teste SOMA
        int resultado = funcoes.soma(10, 13);
        System.out.println("Resultado da soma: " + resultado);

        // Teste do triangulo
        System.out.println("Triângulo com altura 6:");
        funcoes.triangulo(6);

        // Teste do printarquivo
        System.out.println("Conteúdo do arquivo:");
        funcoes.printArquivo("Caminho.txt");
    }
}
