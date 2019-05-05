/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

/**
 *
 * @author brenn
 */
public class FaseOperacoes extends javax.swing.JFrame {
    Contas conta;
    ContaPoupanca cp;
    ContaEspecial ce;
    /**
     * Creates new form FaseOperacoes
     */
    public FaseOperacoes(Contas conta, ContaPoupanca cp, ContaEspecial ce) {
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
        bDeps = new javax.swing.JButton();
        bReajs = new javax.swing.JButton();
        bSaque = new javax.swing.JButton();
        bTransf = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        bVSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operações");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bDeps.setBackground(new java.awt.Color(0, 0, 0));
        bDeps.setForeground(new java.awt.Color(255, 255, 255));
        bDeps.setText("Depósito");
        bDeps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDepsActionPerformed(evt);
            }
        });

        bReajs.setBackground(new java.awt.Color(0, 0, 0));
        bReajs.setForeground(new java.awt.Color(255, 255, 255));
        bReajs.setText("Reajustar");
        bReajs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReajsActionPerformed(evt);
            }
        });

        bSaque.setBackground(new java.awt.Color(0, 0, 0));
        bSaque.setForeground(new java.awt.Color(255, 255, 255));
        bSaque.setText("Saque");
        bSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaqueActionPerformed(evt);
            }
        });

        bTransf.setBackground(new java.awt.Color(0, 0, 0));
        bTransf.setForeground(new java.awt.Color(255, 255, 255));
        bTransf.setText("Transferência");
        bTransf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransfActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(0, 0, 0));
        bSair.setForeground(new java.awt.Color(255, 255, 255));
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bVSaldo.setBackground(new java.awt.Color(0, 0, 0));
        bVSaldo.setForeground(new java.awt.Color(255, 255, 255));
        bVSaldo.setText("Ver Saldo");
        bVSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bTransf))
                    .addComponent(bVSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bReajs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeps, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReajs, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDeps, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaqueActionPerformed
    Saque instanciaTela = new Saque(conta, cp, ce);
    instanciaTela.setVisible(true);
    }//GEN-LAST:event_bSaqueActionPerformed

    private void bDepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDepsActionPerformed
    Deposito instanciaTela = new Deposito(conta, cp, ce);
    instanciaTela.setVisible(true);
    }//GEN-LAST:event_bDepsActionPerformed

    private void bTransfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransfActionPerformed
    Transferencia instanciaTela = new Transferencia(conta, cp, ce);
    instanciaTela.setVisible(true);
    }//GEN-LAST:event_bTransfActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
     System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bReajsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReajsActionPerformed
     Reajuste instanciaTela = new Reajuste(conta, cp, ce);
     instanciaTela.setVisible(true);
    }//GEN-LAST:event_bReajsActionPerformed

    private void bVSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVSaldoActionPerformed
     VerSaldos instanciaTela = new VerSaldos(conta, cp, ce);
     instanciaTela.setVisible(true);
    }//GEN-LAST:event_bVSaldoActionPerformed

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
            java.util.logging.Logger.getLogger(FaseOperacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaseOperacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaseOperacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaseOperacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDeps;
    private javax.swing.JButton bReajs;
    private javax.swing.JButton bSair;
    private javax.swing.JButton bSaque;
    private javax.swing.JButton bTransf;
    private javax.swing.JButton bVSaldo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}