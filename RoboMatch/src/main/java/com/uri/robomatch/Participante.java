
package com.uri.robomatch;


public class Participante {
    private String nome;
    private String cpf;
    
    public Participante (String nomeP){
        nome = nomeP;
    }
    
    public Participante (String nomeP, String cpfP) {
        nome = nomeP;
        cpf = cpfP;
    }
    
    public String getNome () {
        return nome;
    }
    
    public String getCpf () {
        return cpf;
    }
}
