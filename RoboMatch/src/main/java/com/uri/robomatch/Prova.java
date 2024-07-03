
package com.uri.robomatch;
import java.util.ArrayList;


public class Prova {
    private final int identificador;
    private String nome;
    private final int tempo_limite;
    private final double pontuacao;
    private String status;
    private ArrayList<ProvaEquipe> partidas;
    
    public Prova (int id, int tempo, int ponto) {
        identificador = id;
        tempo_limite = tempo;
        pontuacao = ponto;
        status = "Aberto";
        partidas = new ArrayList<>();
    }
    
    public Prova (int id, String nomeP, int tempo, int ponto) {
        identificador = id;
        nome = nomeP;
        tempo_limite = tempo;
        pontuacao = ponto;
        status = "Aberto";
        partidas = new ArrayList<>();
    }
    
    public String getNome () {
        return nome;
    }
    
    public int getTempoLimite () {
        return tempo_limite;
    }
    
    public double getPontuacao () {
        return pontuacao;
    }
    
    public ArrayList getPartidas () {
        return partidas;
    }
    
    public String getStatus () {
        return status;
    }
    
    public ArrayList getEquipesComPartidas() {
        ArrayList<Equipe> equipes = new ArrayList<>();
        
        for (ProvaEquipe pe : partidas) {
            equipes.add(pe.getEquipe());
        }
        
        return equipes;
    }
    
    public void salvarPartida (ProvaEquipe provaEquipe) {
        partidas.add(provaEquipe);
    }
    
    public void finalizarProva () {
        status = "Encerrada";
    }
}
