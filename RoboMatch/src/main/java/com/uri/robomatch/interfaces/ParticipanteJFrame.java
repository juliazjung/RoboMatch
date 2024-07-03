/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uri.robomatch.interfaces;

import com.uri.robomatch.Participante;


public class ParticipanteJFrame extends javax.swing.JFrame {

   private final EquipeJFrame equipe_frame;
   
    public ParticipanteJFrame(EquipeJFrame equipeJF) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        equipe_frame = equipeJF;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save_button = new javax.swing.JButton();
        nome_panel = new javax.swing.JPanel();
        nome_text = new javax.swing.JTextField();
        nome_label = new javax.swing.JLabel();
        cpf_panel = new javax.swing.JPanel();
        cpf_text = new javax.swing.JTextField();
        cpf_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        save_button.setText("Salvar");
        save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_buttonMouseClicked(evt);
            }
        });

        nome_label.setText("Nome participante");

        javax.swing.GroupLayout nome_panelLayout = new javax.swing.GroupLayout(nome_panel);
        nome_panel.setLayout(nome_panelLayout);
        nome_panelLayout.setHorizontalGroup(
            nome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nome_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nome_panelLayout.createSequentialGroup()
                        .addComponent(nome_label)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addComponent(nome_text))
                .addContainerGap())
        );
        nome_panelLayout.setVerticalGroup(
            nome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nome_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nome_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cpf_label.setText("CPF (opcional)");

        javax.swing.GroupLayout cpf_panelLayout = new javax.swing.GroupLayout(cpf_panel);
        cpf_panel.setLayout(cpf_panelLayout);
        cpf_panelLayout.setHorizontalGroup(
            cpf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpf_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cpf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpf_text, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf_label))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        cpf_panelLayout.setVerticalGroup(
            cpf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cpf_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cpf_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpf_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(save_button)
                    .addComponent(nome_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpf_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(save_button)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
        Participante participante = new Participante(nome_text.getText().trim(), cpf_text.getText().trim());
        equipe_frame.setParticipante(participante);
        equipe_frame.carregarIntegrantes();
        this.setVisible(false);
    }//GEN-LAST:event_save_buttonMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpf_label;
    private javax.swing.JPanel cpf_panel;
    private javax.swing.JTextField cpf_text;
    private javax.swing.JLabel nome_label;
    private javax.swing.JPanel nome_panel;
    private javax.swing.JTextField nome_text;
    private javax.swing.JButton save_button;
    // End of variables declaration//GEN-END:variables
}
