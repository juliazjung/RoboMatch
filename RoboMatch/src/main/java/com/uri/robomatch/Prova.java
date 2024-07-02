
package com.uri.robomatch;
import java.util.ArrayList;


public class Prova {
    private int identificador;
    private String nome;
    private int tempo_limite;
    private int pontuacao;
    private String status;
    private ArrayList<Pontuacao> pontuacoes;
    
    public Prova (int id, int tempo, int ponto) {
        identificador = id;
        tempo_limite = tempo;
        pontuacao = ponto;
    //    equipes = new ArrayList();
        pontuacoes = new ArrayList();
    }
    
    public Prova (int id, String nomeP, int tempo, int ponto) {
        identificador = id;
        nome = nomeP;
        tempo_limite = tempo;
        pontuacao = ponto;
        status = "Aberto";
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
    
    public ArrayList<Pontuacao> getPontuacoes () {
        return pontuacoes;
    }
    
    public void iniciarPartida (Equipe e) {
        //
    }
    
    public void finalizarPartida (Equipe e, int tempo_prova) {
        Pontuacao p = new Pontuacao(e, pontuacao, tempo_limite, tempo_prova);
        pontuacoes.add(p);
    }
}
