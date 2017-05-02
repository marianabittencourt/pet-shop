/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.agenda.de.horarios.tela;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariana
 */
public class TelaCadastroAgendaDeHorarios extends javax.swing.JFrame {

    
    public TelaCadastroAgendaDeHorarios() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        animal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipoDeServico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoIncluir = new javax.swing.JButton();
        botaoModificar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

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

        jLabel1.setText("Nome do Cliente:");

        jLabel2.setText("Nome do Animal:");

        animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalActionPerformed(evt);
            }
        });

        jLabel3.setText("Data :");

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        jLabel4.setText("Hora:");

        jLabel5.setText("Tipo de Serviço:");

        tipoDeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDeServicoActionPerformed(evt);
            }
        });

        jLabel6.setText("Listagem de Horários");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Cliente", "Nome do Animal", "Data", "Hora", "Tipo De Serviço"
            }
        ));
        jScrollPane2.setViewportView(tabela);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(botaoModificar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tipoDeServico))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(animal))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(13, 13, 13)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(data)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipoDeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIncluir)
                    .addComponent(botaoModificar)
                    .addComponent(botaoExcluir))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animalActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void tipoDeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDeServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDeServicoActionPerformed

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        String cliente = this.cliente.getText();
        String animal = this.animal.getText();
        String data = this.data.getText();
        String hora = this.hora.getText();
        String tipoDeServico = this.tipoDeServico.getText();
        
        
        DefaultTableModel val = (DefaultTableModel) tabela.getModel();
        val.addRow(new String []{cliente,animal,data,hora,tipoDeServico});
        
         limparCampos();
         
    }
    public void limparCampos() {
        cliente.setText("");
        animal.setText("");
        data.setText("");
        hora.setText("");
        tipoDeServico.setText("");
        

        cliente.requestFocus();
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoModificarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
         ((DefaultTableModel) tabela.getModel() ).removeRow(tabela.getSelectedRow());
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAgendaDeHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAgendaDeHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAgendaDeHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAgendaDeHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAgendaDeHorarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField animal;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoModificar;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField data;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tipoDeServico;
    // End of variables declaration//GEN-END:variables
}
