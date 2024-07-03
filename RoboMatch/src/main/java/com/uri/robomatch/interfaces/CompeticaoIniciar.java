/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uri.robomatch.interfaces;

import com.uri.robomatch.*;
import java.util.*;


public class CompeticaoIniciar extends javax.swing.JFrame {

    private final Competicao competicao;
    private Prova prova;
    private final Placar placar;
    private final ArrayList<Penalidade> penalidades;
    private Equipe equipe;
    private ArrayList<Equipe> equipes;
    private ArrayList<Prova> provas;
    private ProvaEquipe provaEquipe;
    
    
    public CompeticaoIniciar(Competicao comp, Placar pl) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        equipes = new ArrayList<>();
        penalidades = new ArrayList<>();
        
        competicao_label.setText(comp.getNome());
        
        competicao = comp;
        placar = pl;
        
        selecionarProva();
        prova_final_label.setVisible(false);
    }
    
    private void selecionarProva() {
        provas_panel.setVisible(true);
        prova_final_panel.setVisible(true);
        prova_panel.setVisible(false);
        equipe_panel.setVisible(false);
        iniciar_panel.setVisible(false);
        iniciado_panel.setVisible(false);
        
        equipe_nome.setText("");
        prova_nome.setText("");
        tempo_lim_text.setText("Tempo limite: 0");
        tempo_text.setText("00:00:00");
        placar.atualizarDadosProva("", "", "0", "00:00:00");
        
        penalidades.clear();
        atualizarPenalidade();
        carregarProvas();
    }

    private void iniciarProva() {
        provas_panel.setVisible(false);
        prova_final_panel.setVisible(false);
        iniciado_panel.setVisible(false);
        prova_panel.setVisible(true);
        equipe_panel.setVisible(true);
        iniciar_panel.setVisible(true);
        
        carregarEquipes();
        carregarPenalidades();
        
        prova_nome.setText(prova.getNome());
        
        int segundos = prova.getTempoLimite() % 60;
        int minutos = prova.getTempoLimite() / 60;
        String tempo_lim = String.format("%02d:%02d", minutos, segundos);   
        tempo_lim_text.setText("Tempo limite: " + tempo_lim);
        
        placar.atualizarDadosProva("", prova.getNome(), tempo_lim, "00:00:00");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        competicao_nome = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        continue_button = new javax.swing.JButton();
        competicao_label = new javax.swing.JLabel();
        prova_panel = new javax.swing.JPanel();
        prova_nome = new javax.swing.JLabel();
        tempo_lim_text = new javax.swing.JLabel();
        equipe_panel = new javax.swing.JPanel();
        tempo_text = new javax.swing.JLabel();
        equipe_nome = new javax.swing.JLabel();
        penalidade_text = new javax.swing.JLabel();
        iniciar_panel = new javax.swing.JPanel();
        iniciar_button = new javax.swing.JButton();
        equipes_panel = new javax.swing.JPanel();
        equipes_label = new javax.swing.JLabel();
        equipes_combo = new javax.swing.JComboBox<>();
        iniciado_panel = new javax.swing.JPanel();
        encerrar_button = new javax.swing.JButton();
        penalidade_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        penalidade_button = new javax.swing.JButton();
        placar_button = new javax.swing.JButton();
        prova_final_panel = new javax.swing.JPanel();
        prova_final_label = new javax.swing.JLabel();
        provas_panel = new javax.swing.JPanel();
        provas_label = new javax.swing.JLabel();
        provas_combo = new javax.swing.JComboBox<>();
        selecionado_prova = new javax.swing.JButton();

        competicao_nome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        competicao_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        competicao_nome.setText("Competição");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        continue_button.setText("Continuar");
        continue_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continue_buttonMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        competicao_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        competicao_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        competicao_label.setText("Competição");

        prova_nome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        prova_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prova_nome.setText("Prova 1");

        tempo_lim_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tempo_lim_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempo_lim_text.setText("Tempo limite: 02:00");

        javax.swing.GroupLayout prova_panelLayout = new javax.swing.GroupLayout(prova_panel);
        prova_panel.setLayout(prova_panelLayout);
        prova_panelLayout.setHorizontalGroup(
            prova_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prova_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prova_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prova_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempo_lim_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        prova_panelLayout.setVerticalGroup(
            prova_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prova_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(prova_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempo_lim_text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tempo_text.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tempo_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempo_text.setText("00:00:00");

        equipe_nome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        equipe_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipe_nome.setText("Equipe");

        penalidade_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        penalidade_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        penalidade_text.setText("0 Penalidades");

        javax.swing.GroupLayout equipe_panelLayout = new javax.swing.GroupLayout(equipe_panel);
        equipe_panel.setLayout(equipe_panelLayout);
        equipe_panelLayout.setHorizontalGroup(
            equipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipe_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(equipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equipe_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(penalidade_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equipe_panelLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(tempo_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        equipe_panelLayout.setVerticalGroup(
            equipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipe_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equipe_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempo_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penalidade_text, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iniciar_button.setText("Iniciar prova");
        iniciar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciar_buttonMouseClicked(evt);
            }
        });
        iniciar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_buttonActionPerformed(evt);
            }
        });

        equipes_label.setText("Selecionar equipe para iniciar");

        javax.swing.GroupLayout equipes_panelLayout = new javax.swing.GroupLayout(equipes_panel);
        equipes_panel.setLayout(equipes_panelLayout);
        equipes_panelLayout.setHorizontalGroup(
            equipes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipes_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(equipes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equipes_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(equipes_panelLayout.createSequentialGroup()
                        .addComponent(equipes_label)
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addContainerGap())
        );
        equipes_panelLayout.setVerticalGroup(
            equipes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipes_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equipes_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipes_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout iniciar_panelLayout = new javax.swing.GroupLayout(iniciar_panel);
        iniciar_panel.setLayout(iniciar_panelLayout);
        iniciar_panelLayout.setHorizontalGroup(
            iniciar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciar_panelLayout.createSequentialGroup()
                .addComponent(equipes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(iniciar_button)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        iniciar_panelLayout.setVerticalGroup(
            iniciar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciar_panelLayout.createSequentialGroup()
                .addGroup(iniciar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iniciar_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(equipes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iniciar_panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(iniciar_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        encerrar_button.setText("Encerrar prova da equipe");
        encerrar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encerrar_buttonMouseClicked(evt);
            }
        });

        jLabel2.setText("Penalidade");

        penalidade_button.setText("Adicionar");
        penalidade_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penalidade_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout iniciado_panelLayout = new javax.swing.GroupLayout(iniciado_panel);
        iniciado_panel.setLayout(iniciado_panelLayout);
        iniciado_panelLayout.setHorizontalGroup(
            iniciado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciado_panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(iniciado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iniciado_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(iniciado_panelLayout.createSequentialGroup()
                        .addComponent(penalidade_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalidade_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encerrar_button)
                        .addGap(17, 17, 17))))
        );
        iniciado_panelLayout.setVerticalGroup(
            iniciado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciado_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iniciado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penalidade_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penalidade_button)
                    .addComponent(encerrar_button))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        placar_button.setText("Placar");
        placar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placar_buttonMouseClicked(evt);
            }
        });

        prova_final_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prova_final_label.setText("Prova finalizada! Todas as equipes jogaram a prova.");

        javax.swing.GroupLayout prova_final_panelLayout = new javax.swing.GroupLayout(prova_final_panel);
        prova_final_panel.setLayout(prova_final_panelLayout);
        prova_final_panelLayout.setHorizontalGroup(
            prova_final_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prova_final_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prova_final_label)
                .addGap(63, 63, 63))
        );
        prova_final_panelLayout.setVerticalGroup(
            prova_final_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prova_final_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(prova_final_label)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        provas_label.setText("Selecionar prova para iniciar");

        selecionado_prova.setText("Continuar");
        selecionado_prova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionado_provaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout provas_panelLayout = new javax.swing.GroupLayout(provas_panel);
        provas_panel.setLayout(provas_panelLayout);
        provas_panelLayout.setHorizontalGroup(
            provas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provas_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(provas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provas_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provas_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(selecionado_prova)
                .addContainerGap())
        );
        provas_panelLayout.setVerticalGroup(
            provas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provas_panelLayout.createSequentialGroup()
                .addGroup(provas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(provas_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(provas_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(provas_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(provas_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(selecionado_prova)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prova_final_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(iniciar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prova_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equipe_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(competicao_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iniciado_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(provas_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(placar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(competicao_label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prova_final_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provas_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prova_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipe_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(iniciar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iniciado_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placar_button)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_buttonMouseClicked
        iniciado_panel.setVisible(true);
        iniciar_panel.setVisible(false);
        
        penalidades.clear();
        atualizarPenalidade();
        
        equipe = equipes.get(equipes_combo.getSelectedIndex());
        equipe_nome.setText(equipe.getNome());
        provaEquipe = new ProvaEquipe(prova, equipe, placar, this);
        provaEquipe.iniciarPartida();
    }//GEN-LAST:event_iniciar_buttonMouseClicked

    private void iniciar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_buttonActionPerformed
        
    }//GEN-LAST:event_iniciar_buttonActionPerformed

    private void penalidade_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penalidade_buttonMouseClicked
        int index = penalidade_combo.getSelectedIndex();
        
        if (index >=0) {
            Penalidade penalidade = buscarPenalidade(index);
            
            penalidades.add(penalidade);
            provaEquipe.addTime(penalidade.getTempo());
            
            atualizarPenalidade();
        }
    }//GEN-LAST:event_penalidade_buttonMouseClicked
    
    private void atualizarPenalidade() {
        penalidade_text.setText(penalidades.size() + " Penalidades");
        placar.atualizarPenalidades(penalidades.size() + " Penalidades");
    }
    
    private void encerrar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encerrar_buttonMouseClicked
        provaEquipe.finalizarPartida();
        encerrarPartida();
    }//GEN-LAST:event_encerrar_buttonMouseClicked

    private void placar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placar_buttonMouseClicked
        placar.setVisible(true);
    }//GEN-LAST:event_placar_buttonMouseClicked

    private void continue_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continue_buttonMouseClicked
        
    }//GEN-LAST:event_continue_buttonMouseClicked

    private void selecionado_provaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionado_provaMouseClicked
        int index = provas_combo.getSelectedIndex();
        prova = provas.get(index);
        
        iniciarProva();
    }//GEN-LAST:event_selecionado_provaMouseClicked
    
    public void encerrarPartida() {
        iniciado_panel.setVisible(false);
        iniciar_panel.setVisible(true);
        
        carregarEquipes();
    }
    
    public void atualizarTempo(String tempo) {
        tempo_text.setText(tempo);
    }
    
    private void carregarProvas () {
        provas_combo.removeAllItems();;
        provas = competicao.getProvasAbertas();
        
        for (Prova prova : provas) {
            if (prova.getStatus() == "Aberto")
                provas_combo.addItem(prova.getNome());
        }
    }
    
    private void carregarEquipes() {
        equipes.clear();
        equipes_combo.removeAllItems();
        
        for (Equipe equipe : competicao.getEquipes()) {
            ArrayList equipes_com_partida = prova.getEquipesComPartidas();
            
            if (equipes_com_partida.contains(equipe) == false) {
                equipes_combo.addItem(equipe.getNome());
                equipes.add(equipe);
            }
        }
        
        if (equipes.size() == 0) {
            prova.finalizarProva();
            selecionarProva();
        }
    }
    
    private void carregarPenalidades () {
        for (Penalidade penalidade : competicao.getPenalidades()) {
            penalidade_combo.addItem(penalidade.getNome());
        }
    }
    
    private Penalidade buscarPenalidade(int index) {
        int i = 0;
        
        for (Penalidade penalidade : competicao.getPenalidades()) {
            if (i == index)
                return penalidade;
            
            i += 1;
        }
        
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel competicao_label;
    private javax.swing.JLabel competicao_nome;
    private javax.swing.JButton continue_button;
    private javax.swing.JButton encerrar_button;
    private javax.swing.JLabel equipe_nome;
    private javax.swing.JPanel equipe_panel;
    private javax.swing.JComboBox<String> equipes_combo;
    private javax.swing.JLabel equipes_label;
    private javax.swing.JPanel equipes_panel;
    private javax.swing.JPanel iniciado_panel;
    private javax.swing.JButton iniciar_button;
    private javax.swing.JPanel iniciar_panel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton penalidade_button;
    private javax.swing.JComboBox<String> penalidade_combo;
    private javax.swing.JLabel penalidade_text;
    private javax.swing.JButton placar_button;
    private javax.swing.JLabel prova_final_label;
    private javax.swing.JPanel prova_final_panel;
    private javax.swing.JLabel prova_nome;
    private javax.swing.JPanel prova_panel;
    private javax.swing.JComboBox<String> provas_combo;
    private javax.swing.JLabel provas_label;
    private javax.swing.JPanel provas_panel;
    private javax.swing.JButton selecionado_prova;
    private javax.swing.JLabel tempo_lim_text;
    private javax.swing.JLabel tempo_text;
    // End of variables declaration//GEN-END:variables
}
