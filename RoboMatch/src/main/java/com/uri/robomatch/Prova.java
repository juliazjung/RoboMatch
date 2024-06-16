
package com.uri.robomatch;
import java.util.ArrayList;


public class Prova {
    private int identificador;
    private String nome;
    private int tempo_limite;
    private int pontuacao;
    private ArrayList<Equipe> equipes;
    private ArrayList<Pontuacao> pontuacoes;
    
    public Prova (int id, int tempo, int ponto) {
        identificador = id;
        tempo_limite = tempo;
        pontuacao = ponto;
        equipes = new ArrayList();
    }
    
    public Prova (int id, String nomeP, int tempo, int ponto) {
        identificador = id;
        nome = nomeP;
        tempo_limite = tempo;
        pontuacao = ponto;
    }
    
    public void setEquipes (ArrayList<Equipe> eqs) {
        equipes = eqs;
    }
    
    public int getId () {
        return identificador;
    }
    
    public String getNome () {
        return nome;
    }
    
    public int getTempoLimite () {
        return tempo_limite;
    }
    
    public int getPontuacao () {
        return pontuacao;
    }
}