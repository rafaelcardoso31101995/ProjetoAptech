/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.BibliotecaDao;
import dao.ClientesDao;
import dao.LivrosDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.Livros;

/**
 *
 * @author ricardo
 */
public class TelaClientes extends javax.swing.JFrame {

    /**
     * Creates new form TelaClientes
     */
    public TelaClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        BPesquisa = new javax.swing.JButton();
        BLimpar = new javax.swing.JButton();
        txtTipoDaPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BVoltar3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        BDeletarLivro = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        JBCadastrar = new javax.swing.JButton();
        JBCLimpar = new javax.swing.JButton();
        BVoltar7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuário - Clientes");

        BPesquisa.setText("Pesquisar");
        BPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesquisaActionPerformed(evt);
            }
        });

        BLimpar.setText("Limpar");
        BLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Livros", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Selecionar Cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("SELECIONE UM CLIENTE DA TABELA");

        BVoltar3.setText("Sair");
        BVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltar3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        BDeletarLivro.setText("Deletar");
        BDeletarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeletarLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton5)
                        .addGap(27, 27, 27))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(317, 317, 317)
                .addComponent(BVoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(BDeletarLivro)
                        .addGap(16, 16, 16)
                        .addComponent(BLimpar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoDaPesquisa)))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPesquisa)
                    .addComponent(BLimpar)
                    .addComponent(BDeletarLivro))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(BVoltar3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pesquisar Cadastro", jPanel1);

        jLabel4.setText("Nome");

        jLabel6.setText("CPF");

        jLabel7.setText("RG");

        jLabel9.setText("Endereço");

        jLabel10.setText("Numero");

        jLabel11.setText("Celular");

        jLabel12.setText("Nome do Usuário");

        jLabel13.setText("E-mail");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JBCLimpar.setText("Limpar");
        JBCLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCLimparActionPerformed(evt);
            }
        });

        BVoltar7.setText("Sair");
        BVoltar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(JBCLimpar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel11)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField1))))
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BVoltar7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrar)
                    .addComponent(JBCLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(BVoltar7)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesquisaActionPerformed

        try {
            ClientesDao dao = new ClientesDao();
            String b = (String) jComboBox1.getSelectedItem(); // Pegando o valor da minha combobox
            if(b.equals("ID"))
            {
                Clientes cli = new Clientes();
                int id = Integer.valueOf(txtTipoDaPesquisa.getText());
                cli = dao.consultarClientePeloID(id);
                
                if(cli.idCliente != 0)
                {
                    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
                    modelo.addRow(new Object[]{
                    cli.idCliente, cli.nome, cli.cpf, cli.rg, cli.horaRetirada, cli.nomeLivro, cli.generoLivro, 
                        cli.diaRetirada, cli.endResid, cli.telContato, cli.email, cli.horaEntraCliente, cli.horaSaidaCliente, cli.nomeUsuario
                });
                }else{
                    JOptionPane.showMessageDialog(null, "Nenhum id encontrado");
                }
            }
            else if(b.equals("Nome"))
            {
                Clientes cli = new Clientes();
                String nome = txtTipoDaPesquisa.getText();
                cli = dao.consultarClientePeloNome(nome);
                
                if(cli.nome.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Nenhum nome encontrado");
                }else{
                    
                    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
                    modelo.addRow(new Object[]{
                    cli.idCliente, cli.nome, cli.cpf, cli.rg, cli.horaRetirada, cli.nomeLivro, cli.generoLivro, 
                        cli.diaRetirada, cli.endResid, cli.telContato, cli.email, cli.horaEntraCliente, cli.horaSaidaCliente, cli.nomeUsuario
                });
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_BPesquisaActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void BVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltar3ActionPerformed
        // TODO add your handling code here:
        TelaUsuario telaUsuario = new TelaUsuario();
        telaUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_BVoltar3ActionPerformed

    private void BVoltar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltar7ActionPerformed
        // TODO add your handling code here:
        TelaUsuario telaUsuario = new TelaUsuario();
        telaUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_BVoltar7ActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            ClientesDao dao = new ClientesDao();
            Clientes cli = new Clientes();
            
            cli.nome = jTextField1.getText();
            cli.cpf = jTextField2.getText();
            cli.rg = jTextField3.getText();
            cli.endResid = jTextField4.getText();
            cli.numeroResid = jTextField5.getText();
            cli.telContato = jTextField6.getText();
            cli.email = jTextField7.getText();
            cli.nomeUsuario = jTextField8.getText();
            
            
            dao.cadastrarCliente(cli);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JBCLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCLimparActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }//GEN-LAST:event_JBCLimparActionPerformed

    private void BLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        txtTipoDaPesquisa.setText("");
    }//GEN-LAST:event_BLimparActionPerformed

    private void BDeletarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeletarLivroActionPerformed
        // TODO add your handling code here:
        ClientesDao dao;
        try {
            dao = new ClientesDao();
            Clientes cli = new Clientes();
            
            if(jTable1.getSelectedRow() != -1)
            {
                cli.idCliente = (int)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                dao.deletarClientePeloid(cli);
            }
            else{
                JOptionPane.showMessageDialog(null, "Selecione uma linha");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaLivros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaLivros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BDeletarLivroActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DadosClientes dc = new DadosClientes();
        dc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDeletarLivro;
    private javax.swing.JButton BLimpar;
    private javax.swing.JButton BPesquisa;
    private javax.swing.JButton BVoltar3;
    private javax.swing.JButton BVoltar7;
    private javax.swing.JButton JBCLimpar;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txtTipoDaPesquisa;
    // End of variables declaration//GEN-END:variables
}
