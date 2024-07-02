/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uri.robomatch.interfaces;

import com.uri.robomatch.Competicao;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author julia
 */
public class RoboMatchJFrame extends javax.swing.JFrame {
    private ArrayList<Competicao> competicoes = new ArrayList<Competicao>();
    /**
     * Creates new form RoboMatch
     */
    public RoboMatchJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        competicao_panel.setVisible(false);
        voltar_button.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio_panel = new javax.swing.JPanel();
        competicao_button = new javax.swing.JButton();
        padroes_button = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        competicao_panel = new javax.swing.JPanel();
        inserir_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        competicao_list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 350));

        competicao_button.setText("Competições");
        competicao_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                competicao_buttonMouseClicked(evt);
            }
        });

        padroes_button.setText("Inicializar informações");
        padroes_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                padroes_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inicio_panelLayout = new javax.swing.GroupLayout(inicio_panel);
        inicio_panel.setLayout(inicio_panelLayout);
        inicio_panelLayout.setHorizontalGroup(
            inicio_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_panelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(competicao_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(padroes_button)
                .addGap(30, 30, 30))
        );
        inicio_panelLayout.setVerticalGroup(
            inicio_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_panelLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(inicio_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(competicao_button)
                    .addComponent(padroes_button))
                .addGap(120, 120, 120))
        );

        voltar_button.setText("Voltar");
        voltar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar_buttonMouseClicked(evt);
            }
        });

        inserir_button.setText("Inserir +");
        inserir_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserir_buttonActionPerformed(evt);
            }
        });

        competicao_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(competicao_list);

        javax.swing.GroupLayout competicao_panelLayout = new javax.swing.GroupLayout(competicao_panel);
        competicao_panel.setLayout(competicao_panelLayout);
        competicao_panelLayout.setHorizontalGroup(
            competicao_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competicao_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(competicao_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inserir_button)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        competicao_panelLayout.setVerticalGroup(
            competicao_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competicao_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inserir_button)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(competicao_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(voltar_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inicio_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(voltar_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inicio_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(competicao_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void competicao_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competicao_buttonMouseClicked
        inicio_panel.setVisible(false);
        competicao_panel.setVisible(true);
        voltar_button.setVisible(true);
    }//GEN-LAST:event_competicao_buttonMouseClicked

    private void inserir_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir_buttonActionPerformed
        CompeticaoJFrame competicao_frame = new CompeticaoJFrame(this);
        competicao_frame.setVisible(true);
    }//GEN-LAST:event_inserir_buttonActionPerformed

    private void voltar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar_buttonMouseClicked
        competicao_panel.setVisible(false);
        voltar_button.setVisible(false);
        inicio_panel.setVisible(true);
    }//GEN-LAST:event_voltar_buttonMouseClicked

    private void padroes_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padroes_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_padroes_buttonMouseClicked
    
    public void setCompeticao (Competicao c) {
        competicoes.add(c);
    }
    
    public int sizeCompeticoes () {
        return competicoes.size();
    }
    
    public void carregarCompeticoes () {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        String[] nomes = new String[competicoes.size()];
        nomes = getCompeticoesNome();
        for(int i=0; i<nomes.length; i++) {
            listModel.addElement(nomes[i]);
        }
        
        competicao_list.setModel(listModel);
    }
    
    public String[] getCompeticoesNome() {
        String competicoes_nome[] = new String[competicoes.size()];
        
        for (int i=0; i<competicoes.size(); i++) {
            Competicao competicao = competicoes.get(i);
            competicoes_nome[i] = competicao.getNome();
        }
        
        return competicoes_nome;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoboMatchJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoboMatchJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoboMatchJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoboMatchJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoboMatchJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton competicao_button;
    private javax.swing.JList<String> competicao_list;
    private javax.swing.JPanel competicao_panel;
    private javax.swing.JPanel inicio_panel;
    private javax.swing.JButton inserir_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton padroes_button;
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
}