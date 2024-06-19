
package com.uri.robomatch;


public class Pontuacao {
    private Equipe equipe;
    private float pontuacao;
    private int tempo_prova;
    
    public Pontuacao (Equipe e, int pontuacao_max, int tempo_max, int tempo) {
        int coeficiente = pontuacao_max / tempo_max;
        int tempo_restante = tempo_max - tempo;
        
        pontuacao = tempo_restante * coeficiente;
        equipe = e;
        tempo_prova = tempo;
    }
}
