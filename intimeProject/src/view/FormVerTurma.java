/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author user
 */
public class FormVerTurma extends javax.swing.JFrame {

    /**
     * Creates new form FormVerTurma
     */
    public FormVerTurma() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btNotif = new javax.swing.JPanel();
        indNotif = new javax.swing.JPanel();
        notificacoes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btEncerrar = new javax.swing.JPanel();
        indEncerrar = new javax.swing.JPanel();
        encerrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btSessao = new javax.swing.JPanel();
        indSessao = new javax.swing.JPanel();
        fecharSessao = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btPesquisar = new java.awt.Button();
        btListar = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btNotif.setBackground(new java.awt.Color(84, 127, 206));
        btNotif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btNotifMousePressed(evt);
            }
        });

        indNotif.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indNotifLayout = new javax.swing.GroupLayout(indNotif);
        indNotif.setLayout(indNotifLayout);
        indNotifLayout.setHorizontalGroup(
            indNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        indNotifLayout.setVerticalGroup(
            indNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        notificacoes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        notificacoes.setForeground(new java.awt.Color(255, 255, 255));
        notificacoes.setText("Notificacoes");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icons8_Secured_Letter_25px_2.png"))); // NOI18N

        javax.swing.GroupLayout btNotifLayout = new javax.swing.GroupLayout(btNotif);
        btNotif.setLayout(btNotifLayout);
        btNotifLayout.setHorizontalGroup(
            btNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btNotifLayout.createSequentialGroup()
                .addComponent(indNotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificacoes)
                .addGap(0, 165, Short.MAX_VALUE))
        );
        btNotifLayout.setVerticalGroup(
            btNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indNotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(btNotifLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(btNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notificacoes)
                    .addComponent(jLabel5)))
        );

        jPanel2.add(btNotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 354, -1));

        btEncerrar.setBackground(new java.awt.Color(84, 127, 206));
        btEncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEncerrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btEncerrarMousePressed(evt);
            }
        });

        indEncerrar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indEncerrarLayout = new javax.swing.GroupLayout(indEncerrar);
        indEncerrar.setLayout(indEncerrarLayout);
        indEncerrarLayout.setHorizontalGroup(
            indEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        indEncerrarLayout.setVerticalGroup(
            indEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        encerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        encerrar.setForeground(new java.awt.Color(255, 255, 255));
        encerrar.setText("Encerrar");
        encerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                encerrarMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icons8-logout-rounded-up-25 (1).png"))); // NOI18N

        javax.swing.GroupLayout btEncerrarLayout = new javax.swing.GroupLayout(btEncerrar);
        btEncerrar.setLayout(btEncerrarLayout);
        btEncerrarLayout.setHorizontalGroup(
            btEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btEncerrarLayout.createSequentialGroup()
                .addComponent(indEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(encerrar)
                .addGap(0, 195, Short.MAX_VALUE))
        );
        btEncerrarLayout.setVerticalGroup(
            btEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btEncerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(indEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btEncerrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(encerrar))
                .addGap(23, 23, 23))
        );

        jPanel2.add(btEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 354, -1));

        btSessao.setBackground(new java.awt.Color(84, 127, 206));
        btSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSessaoMousePressed(evt);
            }
        });

        indSessao.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indSessaoLayout = new javax.swing.GroupLayout(indSessao);
        indSessao.setLayout(indSessaoLayout);
        indSessaoLayout.setHorizontalGroup(
            indSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        indSessaoLayout.setVerticalGroup(
            indSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        fecharSessao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecharSessao.setForeground(new java.awt.Color(255, 255, 255));
        fecharSessao.setText("Terminar sessao");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icons8_Exit_25px.png"))); // NOI18N

        javax.swing.GroupLayout btSessaoLayout = new javax.swing.GroupLayout(btSessao);
        btSessao.setLayout(btSessaoLayout);
        btSessaoLayout.setHorizontalGroup(
            btSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btSessaoLayout.createSequentialGroup()
                .addComponent(indSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fecharSessao)
                .addGap(0, 128, Short.MAX_VALUE))
        );
        btSessaoLayout.setVerticalGroup(
            btSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btSessaoLayout.createSequentialGroup()
                .addComponent(indSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btSessaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(btSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecharSessao)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1030));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "CURSO", "REGIME", "NIVEL", "EMAIL"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(120, 168, 252));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btPesquisar.setBackground(new java.awt.Color(71, 120, 197));
        btPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setLabel("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btListar.setBackground(new java.awt.Color(71, 120, 197));
        btListar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btListar.setForeground(new java.awt.Color(255, 255, 255));
        btListar.setLabel("Listar");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 1470, 810));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/MenuLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(639, 639, 639)
                .addComponent(jLabel4)
                .addContainerGap(741, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 1580, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNotifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNotifMousePressed
        // TODO add your handling code here:
        setColor(btNotif);
        indNotif.setOpaque(true);
        resetColor(new JPanel[]{btEncerrar, btSessao}, new JPanel[]{indEncerrar, indSessao});
    }//GEN-LAST:event_btNotifMousePressed

    private void encerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encerrarMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_encerrarMousePressed

    private void btEncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEncerrarMouseClicked
        setColor(btEncerrar);
        indNotif.setOpaque(true);
        resetColor(new JPanel[]{btNotif, btSessao}, new JPanel[]{indNotif, indSessao});
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btEncerrarMouseClicked

    private void btEncerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEncerrarMousePressed
        // TODO add your handling code here:
        setColor(btEncerrar);
        indNotif.setOpaque(true);
        resetColor(new JPanel[]{btNotif, btSessao}, new JPanel[]{indNotif, indSessao});
    }//GEN-LAST:event_btEncerrarMousePressed

    private void btSessaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSessaoMousePressed
        // TODO add your handling code here:
        setColor(btSessao);
        indNotif.setOpaque(true);
        resetColor(new JPanel[]{btEncerrar, btNotif}, new JPanel[]{indEncerrar, indNotif});
    }//GEN-LAST:event_btSessaoMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        cbCurso.setSelectedItem(model.getValueAt(i, 1).toString());
        cbRegime.setSelectedItem(model.getValueAt(i, 2).toString());
        cbNivel.setSelectedItem(model.getValueAt(i, 3).toString());
        textEmail.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        String resposta = JOptionPane.showInputDialog(null, "Introduza o nome do docente");
        Turma t = new Turma();
        DAO<Turma> dao = new DAO<>();
        dao.Pesquisa(resposta);
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        try {
            // TODO add your handling code here:
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(FormDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btListarActionPerformed

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
            java.util.logging.Logger.getLogger(FormVerTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVerTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVerTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVerTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVerTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btEncerrar;
    private java.awt.Button btListar;
    private javax.swing.JPanel btNotif;
    private java.awt.Button btPesquisar;
    private javax.swing.JPanel btSessao;
    private javax.swing.JLabel encerrar;
    private javax.swing.JLabel fecharSessao;
    private javax.swing.JPanel indEncerrar;
    private javax.swing.JPanel indNotif;
    private javax.swing.JPanel indSessao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel notificacoes;
    // End of variables declaration//GEN-END:variables
}