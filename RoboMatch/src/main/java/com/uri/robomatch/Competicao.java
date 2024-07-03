
package com.uri.robomatch;
import java.util.ArrayList;
import java.util.Date;


public class Competicao {
    private final String nome;
    private final Date data;
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
    
    public ArrayList<Prova> getProvasAbertas () {
        ArrayList<Prova> provas_abertas = new ArrayList<>();
        
        for (Prova prova : provas) {
            if ("Aberto".equals(prova.getStatus()))
                provas_abertas.add(prova);
        }
        
        return provas_abertas;
    }
    
    public ArrayList<Equipe> getEquipes () {
        return equipes;
    }
    
    public ArrayList<Penalidade> getPenalidades () {
        return penalidades;
    }
    
    public String getNome() {
        return nome;
    }
}
