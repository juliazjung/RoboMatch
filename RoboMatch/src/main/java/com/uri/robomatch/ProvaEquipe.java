
package com.uri.robomatch;

import com.uri.robomatch.interfaces.*;
import java.util.Timer;
import java.util.TimerTask;


public class ProvaEquipe {
    private final Prova prova;
    private final Equipe equipe;
    private final Placar placar;
    private final CompeticaoIniciar competicaoIniciar;
    private int elapsedTime;
    private final int TIME_LIMIT;
    private final Timer timer;
    private boolean iniciado;
    private String timeString;
    private double pontuacao;
    
    public ProvaEquipe (Prova p, Equipe e, Placar pl, CompeticaoIniciar c) {
        prova = p;
        equipe = e;
        placar = pl;
        competicaoIniciar = c;
        TIME_LIMIT = prova.getTempoLimite() * 1000;
        elapsedTime = 0;
        iniciado = false;
        timeString = String.format("%02d:%02d:%02d", 00, 00, 00);
        
        timer = new Timer();
    }
    
    public double getPontuacao() {
        return pontuacao;
    }
    
    public Equipe getEquipe () {
        return equipe;
    }
    
    public String getTimeString() {
        return timeString;
    }
    
    public void finalizarPartida () {
        iniciado = false;
    }
    
    public void iniciarPartida () {
        iniciado = true;
        
        int segundos = prova.getTempoLimite() % 60;
        int minutos = prova.getTempoLimite() / 60;
        String tempo_lim = String.format("%02d:%02d", minutos, segundos);
        placar.atualizarDadosProva(equipe.getNome(), prova.getNome(), tempo_lim, "00:00:00");
        
        startTimer();
    }
    
    private void encerrarPartida () {
        gerarPontuacao();
        prova.salvarPartida(this);
        placar.atualizarPontuacao();
        competicaoIniciar.encerrarPartida();
    }
    
    private void startTimer() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (elapsedTime >= TIME_LIMIT || iniciado == false) {
                    timer.cancel(); // Parar o timer quando atingir o limite
                    encerrarPartida();
        
                } else {
                    elapsedTime += 100; // Incrementar o tempo decorrido em 10 milissegundos

                    int minutes = (elapsedTime / 60000);
                    int seconds = (elapsedTime / 1000) % 60;
                    int milliseconds = (elapsedTime % 1000);

                    timeString = String.format("%02d:%02d:%02d", minutes, seconds, milliseconds);
                    placar.atualizarTempo(timeString);
                    competicaoIniciar.atualizarTempo(timeString);
                }
            }
        }, 0, 100); // Executar a tarefa a cada 100 milissegundos, após um atraso inicial de 0 milissegundos
    }
    
    public void addTime(int segundos) {
        elapsedTime += (segundos * 1000);
    }
    
    private void gerarPontuacao() {
        double coeficiente = prova.getPontuacao() / prova.getTempoLimite() * 1.00;
        double tempo_restante = (TIME_LIMIT - elapsedTime) / 1000.00;
        
        pontuacao = tempo_restante * coeficiente;
    }
}
