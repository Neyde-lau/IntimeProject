/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.DAO;
import model.Turma;
import model.Utilizador;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class FormTurma extends javax.swing.JFrame {

    /**
     * Creates new form FormTurma
     */
    public FormTurma() throws SQLException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
           this.setLocationRelativeTo(null);
          DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
           public void readJTable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        DAO<Turma> dao = new DAO<>();
        for (Turma u : dao.lerTurma()) {
            modelo.addRow(new Object[]{
                u.getCodigo(),
                u.getCurso(),
                u.getNivel(),
                u.getTutor(),
               // u.getRegime(),
                });
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbRegime = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btRegistar = new java.awt.Button();
        btActualizar = new java.awt.Button();
        btPesquisar = new java.awt.Button();
        btListar = new java.awt.Button();
        btRemover = new java.awt.Button();
        cbCurso = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Curso");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Regime");

        cbRegime.setForeground(new java.awt.Color(255, 255, 255));
        cbRegime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                  ", "Laboral", "Pos-laboral", " " }));
        cbRegime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRegimeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nivel");

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", " ", " " }));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
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

        btRegistar.setBackground(new java.awt.Color(71, 120, 197));
        btRegistar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btRegistar.setForeground(new java.awt.Color(255, 255, 255));
        btRegistar.setLabel("Registar");
        btRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistarActionPerformed(evt);
            }
        });

        btActualizar.setBackground(new java.awt.Color(71, 120, 197));
        btActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btActualizar.setLabel("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

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

        btRemover.setBackground(new java.awt.Color(71, 120, 197));
        btRemover.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btRemover.setForeground(new java.awt.Color(255, 255, 255));
        btRemover.setLabel("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                     ", "Informatica", "Matematica", "CIG", "Estatistica" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(79, 79, 79)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbRegime, 0, 115, Short.MAX_VALUE)
                                .addComponent(cbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(52, 52, 52)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(114, 114, 114)
                            .addComponent(jLabel6))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textEmail))))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(140, 140, 140)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(btRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
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

    private void cbRegimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRegimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRegimeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        cbCurso.setSelectedItem(model.getValueAt(i, 1).toString());
        cbRegime.setSelectedItem(model.getValueAt(i, 2).toString());
        cbNivel.setSelectedItem(model.getValueAt(i, 3).toString());
        textEmail.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistarActionPerformed
        // TODO add your handling code here:
        Turma t = new Turma();

        DAO<Turma> dao = new DAO<>();
        t.setCurso((String) cbCurso.getSelectedItem());
        t.setTutor((String) cbRegime.getSelectedItem());
        t.setNivel((Integer) cbNivel.getSelectedItem());
       // t.setEmail(textEmail.getText());
        

        dao.gravar(t);
        limparCampos();
        JOptionPane.showMessageDialog(this, "Salvo com sucesso");
        try {
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(FormDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRegistarActionPerformed
public void limparCampos(){
    cbCurso.setSelectedItem("");
    cbRegime.setSelectedItem("");
    cbNivel.setSelectedItem("");
    textEmail.setText("");
}
    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        // TODO add your handling code here:
          Turma t = new Turma();

        DAO<Turma> dao = new DAO<>();
        t.setCurso((String) cbCurso.getSelectedItem());
        t.setTutor((String) cbRegime.getSelectedItem());
        t.setNivel((Integer) cbNivel.getSelectedItem());
        //t.setEmail(textEmail.getText());
        t.setCodigo((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        dao.actualizar(t);
        try {
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(FormDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
    }//GEN-LAST:event_btActualizarActionPerformed

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

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        // TODO add your handling code here:
         Turma t = new Turma();

        DAO<Turma> dao = new DAO<>();
        t.setCurso((String) cbCurso.getSelectedItem());
        t.setTutor((String) cbRegime.getSelectedItem());
        t.setNivel((Integer) cbNivel.getSelectedItem());
       // t.setEmail(textEmail.getText());
        t.setCodigo((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        dao.apagarTurma(t.getCodigo());
        limparCampos();
        JOptionPane.showMessageDialog(this, "Removido com sucesso");
        try {
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(FormDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormTurma().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormTurma.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
        private void setColor(JPanel painel) {
        painel.setBackground(new Color(120, 168, 252));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(84, 127, 206));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btActualizar;
    private javax.swing.JPanel btEncerrar;
    private java.awt.Button btListar;
    private javax.swing.JPanel btNotif;
    private java.awt.Button btPesquisar;
    private java.awt.Button btRegistar;
    private java.awt.Button btRemover;
    private javax.swing.JPanel btSessao;
    private javax.swing.JComboBox cbCurso;
    private javax.swing.JComboBox cbNivel;
    private javax.swing.JComboBox cbRegime;
    private javax.swing.JLabel encerrar;
    private javax.swing.JLabel fecharSessao;
    private javax.swing.JPanel indEncerrar;
    private javax.swing.JPanel indNotif;
    private javax.swing.JPanel indSessao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel notificacoes;
    private javax.swing.JTextField textEmail;
    // End of variables declaration//GEN-END:variables
}
