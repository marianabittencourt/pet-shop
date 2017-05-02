
package pet.shop.animal.tela;

import javax.swing.table.DefaultTableModel;

public class TelaCadastroAnimais extends javax.swing.JFrame {

    
    public TelaCadastroAnimais() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        raca = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        clienteResponsavel = new javax.swing.JTextField();
        botaoIncluir = new javax.swing.JButton();
        botaoModificar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Raça:");

        jLabel4.setText("Peso:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Cliente Responsável:");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        raca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racaActionPerformed(evt);
            }
        });

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        botaoModificar.setText("Modificar");
        botaoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoModificarActionPerformed(evt);
            }
        });

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
                "Nome", "Idade", "Raça", "Peso", "Tipo", "Cliente Responsável"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        jLabel7.setText("Listagem Animais");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clienteResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(peso, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(raca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idade, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoIncluir)
                        .addGap(34, 34, 34)
                        .addComponent(botaoModificar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clienteResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIncluir)
                    .addComponent(botaoModificar)
                    .addComponent(botaoExcluir))
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void limparCampo() {
        nome.setText("");
        idade.setText("");
        //telefone.setText("");
        //rg.setText("");
        //cpf.setText("");
        
        nome.requestFocus();
    }
    
    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void racaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_racaActionPerformed

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        String nome = this.nome.getText();
        String idade = this.idade.getText();
        String raca = this.raca.getText();
        String peso = this.peso.getText();
        String tipo = this.tipo.getText();
        String clienteResponsavel = this.clienteResponsavel.getText();
        
        DefaultTableModel val = (DefaultTableModel) tabela.getModel();
        val.addRow(new String []{nome,idade,raca,peso,tipo,clienteResponsavel});
        
         limparCampos();
         
    }
    public void limparCampos() {
        nome.setText("");
        idade.setText("");
        raca.setText("");
        peso.setText("");
        tipo.setText("");
        clienteResponsavel.setText("");

        nome.requestFocus();
         
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoModificarActionPerformed
      
    }//GEN-LAST:event_botaoModificarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       ((DefaultTableModel) tabela.getModel() ).removeRow(tabela.getSelectedRow());
    }//GEN-LAST:event_botaoExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoModificar;
    private javax.swing.JTextField clienteResponsavel;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField raca;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
