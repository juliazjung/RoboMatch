
package com.uri.robomatch;
import java.util.ArrayList;


public class Equipe {
    private int identificador;
    private String nome;
    private ArrayList<Participante> participantes;
    private String cidade;
    private String escola;
    private String robo;
    
    public Equipe (String nomeE) {
        nome = nomeE;
        participantes = new ArrayList();
    }
    
    public Equipe (String nomeE, String roboE) {
        nome = nomeE;
        robo = roboE;
    }
    
    public Equipe (int id, String nomeE, String roboE, String cidadeE, String escolaE) {
        identificador = id;
        nome = nomeE;
        robo = roboE;
        cidade = cidadeE;
        escola = escolaE;
    }
    
    public void setParticipante (Participante p) {
        participantes.add(p);
    }
    
    public String getNome () {
        return nome;
    }
    
    public String getRobo () {
        return robo;
    }
    
    public String getCidade () {
        return cidade;
    }
    
    public String getEscola () {
        return escola;
    }
    
    public ArrayList<Participante> getParticipantes () {
        return participantes;
    }
}
