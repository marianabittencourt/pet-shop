package pet.shop.cliente.tela;

import javax.swing.table.DefaultTableModel;

public class TelaCadastroDeClientes extends javax.swing.JFrame {

    public TelaCadastroDeClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        botaoIncluir = new javax.swing.JButton();
        botaoModificar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" Nome:");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade:");

        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefone:");

        jLabel4.setText("RG:");

        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF:");

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        botaoModificar.setText("Modificar");

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Telefone", "RG", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel6.setText("Listagem de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaoIncluir)
                                                .addGap(18, 18, 18)
                                                .addComponent(botaoModificar)
                                                .addGap(18, 18, 18)
                                                .addComponent(botaoExcluir))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(telefone)
                                                        .addComponent(rg)
                                                        .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIncluir)
                    .addComponent(botaoModificar)
                    .addComponent(botaoExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeActionPerformed

    private void rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        
        
        String nome = this.nome.getText();
        String idade = this.idade.getText();
        String telefone = this.telefone.getText();
        String rg = this.rg.getText();
        String cpf = this.cpf.getText();

        DefaultTableModel val = (DefaultTableModel) tabela.getModel();
        val.addRow(new String[]{nome, idade, telefone, rg, cpf});
     
        
        
        limparCampos();
    }

    public void limparCampos() {
        nome.setText("");
        idade.setText("");
        telefone.setText("");
        rg.setText("");
        cpf.setText("");

        nome.requestFocus();
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       
        ((DefaultTableModel) tabela.getModel() ).removeRow(tabela.getSelectedRow());
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroDeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoModificar;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
