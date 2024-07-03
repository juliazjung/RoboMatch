
package com.uri.robomatch;


public class Penalidade {
    private final String descricao;
    private final int tempo_penalidade;
    
    public Penalidade (String descr, int tempo) {
        descricao = descr;
        tempo_penalidade = tempo;
    }
    
    public String getNome() {
        return descricao;
    }
    
    public int getTempo () {
        return tempo_penalidade;
    }
}
