package org.example;

public class Main {
    public static void main(String[] args) {
        Integer totalEleitores = 1000;
        Integer votosValidos = 800;
        Integer votosBrancos = 150;
        Integer votosNulos = 50;

        CalculadoraVotos calculadora = new CalculadoraVotos(totalEleitores, votosValidos, votosBrancos, votosNulos);

        System.out.println("----------- IMPRIMINDO OS PERCENTUAIS -------------------");
        System.out.println("Percentual Votos Válidos: " + calculadora.percentualVotosValidos() + "%");
        System.out.println("Percentual Votos Brancos: " + calculadora.percentualVotosBrancos() + "%");
        System.out.println("Percentual Votos Nulos: " + calculadora.percentualVotosNulos() + "%");

        System.out.println();
        System.out.println("----------- UTILIZANDO METODO ALTERNATIVO DA PROPOSTA -------------------");
        alternativo(calculadora);
    }

    /**
     * utilizando o metodo simplificado que recebe um valor genérico a ser dividido pelo total de eleitores
     * optei por usar a classe no construtor
     */
    public static void alternativo(CalculadoraVotos calculadoraVotos){
        System.out.println("Percentual Votos Válidos: " + calculadoraVotos.calculaPercentualPorTotalEleitores(calculadoraVotos.getVotosValidos()) + "%");
        System.out.println("Percentual Votos Brancos: " + calculadoraVotos.calculaPercentualPorTotalEleitores(calculadoraVotos.getVotosBrancos()) + "%");
        System.out.println("Percentual Votos Nulos: " + calculadoraVotos.calculaPercentualPorTotalEleitores(calculadoraVotos.getVotosNulos()) + "%");
    }
}