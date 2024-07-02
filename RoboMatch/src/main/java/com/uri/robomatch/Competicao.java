
package com.uri.robomatch;
import java.util.ArrayList;
import java.util.Date;


public class Competicao {
    private String nome;
    private Date data;
    private String status;
    private ArrayList<Prova> provas;
    private ArrayList<Equipe> equipes;
    private ArrayList<Penalidade> penalidades;
     
    public Competicao (String n, Date d) {
        nome = n;
        data = d;
        status = "Aberto";
        
        provas = new ArrayList<>();
        equipes = new ArrayList<>();
        penalidades = new ArrayList<>();
    }
    
    public void setProva (Prova p) {
        provas.add(p);
    }
    
    public void setEquipe (Equipe e) {
        equipes.add(e);
    }
    
    public void setPenalidade (Penalidade p) {
        penalidades.add(p);
    }
    
    public ArrayList<Prova> getProvas () {
        return provas;
    }
    
    public String getNome() {
        return nome;
    }
    
    //public void iniciarProva (Prova p, Equipe e) {
    //    p.iniciarPartida(e);
    //}
    
    //public void finalizarProva (Prova p, Equipe e, int tempo_prova) {
    //    p.finalizarPartida(e, tempo_prova);
    //}
}
