
package com.uri.robomatch.interfaces;

import com.uri.robomatch.Prova;


public class ProvaJFrame extends javax.swing.JFrame {
    
    CompeticaoJFrame competicao_frame;
    
    /**
     * Creates new form ProvaJFrame
     * @param comp_frame
     */
    public ProvaJFrame(CompeticaoJFrame comp_frame) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        competicao_frame = comp_frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save_button = new javax.swing.JButton();
        nome_panel = new javax.swing.JPanel();
        nome_text = new javax.swing.JTextField();
        nome_label = new javax.swing.JLabel();
        pontos_panel = new javax.swing.JPanel();
        pontos_text = new javax.swing.JTextField();
        pontos_label = new javax.swing.JLabel();
        tempo_panel = new javax.swing.JPanel();
        tempo_text = new javax.swing.JTextField();
        tempo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        save_button.setText("Salvar");
        save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_buttonMouseClicked(evt);
            }
        });

        nome_text.setText("Prova");

        nome_label.setText("Descrição da prova");

        javax.swing.GroupLayout nome_panelLayout = new javax.swing.GroupLayout(nome_panel);
        nome_panel.setLayout(nome_panelLayout);
        nome_panelLayout.setHorizontalGroup(
            nome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nome_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_text)
                    .addGroup(nome_panelLayout.createSequentialGroup()
                        .addComponent(nome_label)
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        nome_panelLayout.setVerticalGroup(
            nome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nome_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pontos_text.setText("500");

        pontos_label.setText("Pontuação máxima");

        javax.swing.GroupLayout pontos_panelLayout = new javax.swing.GroupLayout(pontos_panel);
        pontos_panel.setLayout(pontos_panelLayout);
        pontos_panelLayout.setHorizontalGroup(
            pontos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pontos_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pontos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pontos_label, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addGroup(pontos_panelLayout.createSequentialGroup()
                        .addComponent(pontos_text, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pontos_panelLayout.setVerticalGroup(
            pontos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pontos_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pontos_label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pontos_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tempo_text.setText("02:00");
        tempo_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tempo_textFocusLost(evt);
            }
        });
        tempo_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempo_textActionPerformed(evt);
            }
        });

        tempo_label.setText("Tempo limite");

        javax.swing.GroupLayout tempo_panelLayout = new javax.swing.GroupLayout(tempo_panel);
        tempo_panel.setLayout(tempo_panelLayout);
        tempo_panelLayout.setHorizontalGroup(
            tempo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tempo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tempo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tempo_panelLayout.createSequentialGroup()
                        .addComponent(tempo_text, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))))
        );
        tempo_panelLayout.setVerticalGroup(
            tempo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tempo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tempo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nome_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pontos_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_button)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pontos_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(save_button)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
        int id = competicao_frame.sizeProva() + 1;
        int ponto = Integer.parseInt(pontos_text.getText().trim());
        int tempo = converterTempo();
        
        Prova prova = new Prova(id, nome_text.getText().trim(), tempo, ponto);
        
        competicao_frame.setProva(prova);
        competicao_frame.carregarProvas();
        this.setVisible(false);
    }//GEN-LAST:event_save_buttonMouseClicked

    private int converterTempo() {
        String tempo_string = tempo_text.getText().trim();
        System.out.println(tempo_string);
        
        if (tempo_string.indexOf(":") < 0)
            tempo_string = tempo_string.substring(0, 2) + ":" + tempo_string.substring(2);
        System.out.println(tempo_string);
        
        int tempo_seg = Integer.parseInt(tempo_string.substring(3, 5));
        int tempo_min = Integer.parseInt(tempo_string.substring(0, 2));
        
        tempo_seg += (tempo_min * 60);
        
        return tempo_seg;
    }   
    
    private void tempo_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempo_textActionPerformed
        
    }//GEN-LAST:event_tempo_textActionPerformed

    private void tempo_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempo_textFocusLost
        if (tempo_text.getText().indexOf(":") < 0)
            tempo_text.setText(tempo_text.getText().substring(0, 2) + ":" + tempo_text.getText().substring(2));
        
        if (tempo_text.getText().length() > 5) {
            tempo_text.setText("02:00");
        }
    }//GEN-LAST:event_tempo_textFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nome_label;
    private javax.swing.JPanel nome_panel;
    private javax.swing.JTextField nome_text;
    private javax.swing.JLabel pontos_label;
    private javax.swing.JPanel pontos_panel;
    private javax.swing.JTextField pontos_text;
    private javax.swing.JButton save_button;
    private javax.swing.JLabel tempo_label;
    private javax.swing.JPanel tempo_panel;
    private javax.swing.JTextField tempo_text;
    // End of variables declaration//GEN-END:variables
}
