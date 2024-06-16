
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
}
