/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author brenn
 */
public class Saque extends javax.swing.JFrame {
    Contas conta;
    ContaPoupanca cp;
    ContaEspecial ce;
    int a;

    /**
     * Creates new form FaseOperacoes
     */
    public Saque(Contas conta, ContaPoupanca cp, ContaEspecial ce) {
        this.conta = conta;
        this.cp = cp;
        this.ce =ce;
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
        bSaque = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNumero = new javax.swing.JTextField();
        jSaque = new javax.swing.JTextField();

        setTitle("Saque");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bSaque.setBackground(new java.awt.Color(0, 0, 0));
        bSaque.setForeground(new java.awt.Color(255, 255, 255));
        bSaque.setText("Saque");
        bSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaqueActionPerformed(evt);
            }
        });

        jLabel1.setText("Número da conta:");

        jLabel2.setText("Valor do saque:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(bSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaqueActionPerformed
      if( conta.getNumero() == Integer.parseInt(jNumero.getText())){
          a = JOptionPane.showConfirmDialog(null, "Titular: "+conta.getNome() + ", confirmar?");
          if (a==0){
                if(conta.getSaldo() >= Double.parseDouble(jSaque.getText())){
                     conta.setSaldo(conta.getSaldo() - Double.parseDouble(jSaque.getText()));
                       JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso!");
                }else
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente");
          }else{ JOptionPane.showMessageDialog(null,"Operação não realizada"); a=10;}
      }else
      if( cp.getNumero() == Integer.parseInt(jNumero.getText())){
          a = JOptionPane.showConfirmDialog(null, "Titular: "+cp.getNome() + ", confirmar?");
          if (a==0){
                if(cp.getSaldo() >= Double.parseDouble(jSaque.getText())){
                    cp.setSaldo(cp.getSaldo() - Double.parseDouble(jSaque.getText()));
                    JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso!");

                }else
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente");
              }else{ JOptionPane.showMessageDialog(null,"Operação não realizada"); a=10;}
      }else
      if( ce.getNumero() == Integer.parseInt(jNumero.getText())){
          a = JOptionPane.showConfirmDialog(null, "Titular: "+ce.getNome() + ", confirmar?");
          if (a==0){
                if(ce.getSaldo() >= Double.parseDouble(jSaque.getText())){
                    ce.setSaldo(ce.getSaldo() - Double.parseDouble(jSaque.getText()));
                    JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso!");
                }else
                if((ce.getSaldo()+ce.getLimite()) >= Double.parseDouble(jSaque.getText())){
                    ce.setSaldo((ce.getSaldo() - Double.parseDouble(jSaque.getText()) + (ce.getMulta()*(ce.getSaldo() - Double.parseDouble(jSaque.getText()))/100)));
                    JOptionPane.showMessageDialog(null,"Saque efetuado usando cheque especial!");
          }else{JOptionPane.showMessageDialog(null,"Saldo insuficiente");}
      }else{JOptionPane.showMessageDialog(null,"Operação não realizada"); a=10;}
      }else{
          JOptionPane.showMessageDialog(null,"insira um número de conta válido!");
      }
    }//GEN-LAST:event_bSaqueActionPerformed

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
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNumero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jSaque;
    // End of variables declaration//GEN-END:variables
}
