package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CalculadoraVotos {
    private Integer totalEleitores;
    private Integer votosValidos;
    private Integer votosBrancos;
    private Integer votosNulos;

    public Double percentualVotosValidos() {
        return (double) votosValidos / totalEleitores * 100;
    }

    public Double percentualVotosBrancos() {
        return (double) votosBrancos / totalEleitores * 100;
    }

    public Double percentualVotosNulos() {
        return (double) votosNulos / totalEleitores * 100;
    }


    /**
     * um metodo alternativo para a proposta do teste
     * uma vez que o divisor é unico, seria mais simples ter um unico metodo que divide pelo total de eleitores
     * e recebe o valor dos votos por parametro
     */
    public Double calculaPercentualPorTotalEleitores(Integer votos){
        return (double) votos / totalEleitores * 100;
    }
}
