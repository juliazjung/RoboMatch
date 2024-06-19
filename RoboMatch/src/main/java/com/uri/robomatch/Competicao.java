
package com.uri.robomatch;
import java.util.ArrayList;
import java.util.Date;


public class Competicao {
    private String nome;
    private ArrayList<Prova> provas;
    private ArrayList<Equipe> equipes;
    private Date data;
    
    public Competicao (String n, Date d) {
        nome = n;
        data = d;
    }
    
    public void setProva (Prova p) {
        provas.add(p);
    }
    
    public void setEquipe (Equipe e) {
        equipes.add(e);
    }
    
    public ArrayList<Prova> getProvas () {
        return provas;
    }
    
    //public void iniciarProva (Prova p, Equipe e) {
    //    p.iniciarPartida(e);
    //}
    
    //public void finalizarProva (Prova p, Equipe e, int tempo_prova) {
    //    p.finalizarPartida(e, tempo_prova);
    //}
}
