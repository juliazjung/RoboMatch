
package com.uri.robomatch;


public class Penalidade {
    private String descricao;
    private int tempo_penalidade;
    
    public Penalidade (String descr, int tempo) {
        descricao = descr;
        tempo_penalidade = tempo;
    }
    
    public String getNome() {
        return descricao;
    }
}
