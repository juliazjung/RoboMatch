/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uri.robomatch.interfaces;

import com.uri.robomatch.*;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.table.AbstractTableModel;

public class PlacarTableModel extends AbstractTableModel {

    private Competicao competicao;
    private String[] colunas;
    private Object[][] dados;

    public PlacarTableModel(Competicao competicao) {
        this.competicao = competicao;
        gerarDados();
    }

    private void gerarDados() {
        ArrayList<Prova> provas = competicao.getProvas();

        DecimalFormat df = new DecimalFormat("#.00");

        // Configurando colunas
        colunas = new String[provas.size() + 2];
        colunas[0] = "Equipe";
        for (int i = 0; i < provas.size(); i++) {
            colunas[i + 1] = provas.get(i).getNome();
        }

        colunas[colunas.length - 1] = "Total";

        // Configurando dados
        ArrayList<String> equipes = new ArrayList<>();
        for (Prova prova : provas) {
            ArrayList<ProvaEquipe> partidas = prova.getPartidas();
            for (ProvaEquipe pe : partidas) {
                if (!equipes.contains(pe.getEquipe().getNome())) {
                    equipes.add(pe.getEquipe().getNome());
                }
            }
        }

        dados = new Object[equipes.size()][colunas.length];
        for (int i = 0; i < equipes.size(); i++) {
            dados[i][0] = equipes.get(i);
        }

        //for (int i = 0; i < provas.size(); i++) {
        //    Prova prova = provas.get(i);
        //    ArrayList<ProvaEquipe> partidas = prova.getPartidas();
        //    for (ProvaEquipe pe : partidas) {
        //        int rowIndex = equipes.indexOf(pe.getEquipe().getNome());
        //        dados[rowIndex][i + 1] = df.format(pe.getPontuacao());
        //    }
        //}
        
        // Preenchendo a pontuação das provas e calculando a pontuação total
        for (int i = 0; i < provas.size(); i++) {
            Prova prova = provas.get(i);
            ArrayList<ProvaEquipe> partidas = prova.getPartidas();
            for (ProvaEquipe pe : partidas) {
                int rowIndex = equipes.indexOf(pe.getEquipe().getNome());
                double pontuacao = pe.getPontuacao();
                dados[rowIndex][i + 1] = df.format(pontuacao);

                // Atualizando a pontuação total
                if (dados[rowIndex][colunas.length - 1] == null) {
                    dados[rowIndex][colunas.length - 1] = pontuacao;
                } else {
                    double total = (double) dados[rowIndex][colunas.length - 1];
                    total += pontuacao;
                    dados[rowIndex][colunas.length - 1] = total;
                }
            }
        }

// Formatando a pontuação total para duas casas decimais
        for (int i = 0; i < equipes.size(); i++) {
            if (dados[i][colunas.length - 1] != null) {
                dados[i][colunas.length - 1] = df.format((double) dados[i][colunas.length - 1]);
            }
        }
    }

    @Override
    public int getRowCount() {
        return dados.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados[rowIndex][columnIndex];
    }

}
