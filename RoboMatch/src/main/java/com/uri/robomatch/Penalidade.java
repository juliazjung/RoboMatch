
package com.uri.robomatch;


public class Penalidade {
    private String descricao;
    private int tempo_penalidade;
    private int pontos_penalidade;
    private char tipo_penalidade;
    
    public Penalidade (String descr, int tempo, int pontos, char tipo) {
        descricao = descr;
        tempo_penalidade = tipo;
        pontos_penalidade = pontos;
        
        tipo_penalidade = 'T';
        if (tipo == 'T' || tipo == 'P')
           tipo_penalidade = tipo;
    }
}
