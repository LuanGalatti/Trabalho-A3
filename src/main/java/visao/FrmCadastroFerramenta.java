package visao;

import javax.swing.JOptionPane;
import modelo.Ferramenta;

public class FrmCadastroFerramenta extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastroFerramenta
     */
    private Ferramenta objetoferramenta;

    public FrmCadastroFerramenta() {
        initComponents();
        this.objetoferramenta = new Ferramenta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNomeFerramenta = new javax.swing.JLabel();
        JLMarcaFerramenta = new javax.swing.JLabel();
        JLCustoFerramenta = new javax.swing.JLabel();
        JTFNomeFerramenta = new javax.swing.JTextField();
        JTFMarcaFerramenta = new javax.swing.JTextField();
        JTFCustoFerramenta = new javax.swing.JTextField();
        JBCadastrar = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Ferramentas");

        JLNomeFerramenta.setText("Nome da Ferramenta:");

        JLMarcaFerramenta.setText("Marca da Ferramenta:");

        JLCustoFerramenta.setText("Custo de Obtenção:");

        JTFNomeFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeFerramentaActionPerformed(evt);
            }
        });

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTFNomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 154, Short.MAX_VALUE)
                        .addComponent(JBCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBCancelar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNomeFerramenta)
                    .addComponent(JLMarcaFerramenta)
                    .addComponent(JLCustoFerramenta)
                    .addComponent(JTFCustoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFMarcaFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JLNomeFerramenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLMarcaFerramenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFMarcaFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLCustoFerramenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFCustoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBLimpar)
                    .addComponent(JBCadastrar))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNomeFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeFerramentaActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
//Libera todos os recurso da interface gráfica
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try {

            Ferramenta ferramenta = new Ferramenta();
            String nome = "";
            String marca = "";
            double custo = 0;
            if (JTFNomeFerramenta.getText().length() < 2) {
                throw new Erro("Nome deve conter pelo menos 2 caracteres, tente novamente.");
            } else {
                nome = (JTFNomeFerramenta.getText());

            }
            if (JTFMarcaFerramenta.getText().length() < 2) {
                throw new Erro("Marca deve conter pelo menos 2 caracteres, tente novamente.");
            } else {
                marca = (JTFMarcaFerramenta.getText());

            }
            if (Double.parseDouble(JTFCustoFerramenta.getText()) <= 0) {
                throw new Erro("Custo deve ser maior que 0, tente novamente.");
            } else {
                custo = (Double.parseDouble(JTFCustoFerramenta.getText()));

            }
            if (ferramenta.InsertFerramentaDB(nome, marca, custo)) {
                JOptionPane.showMessageDialog(null, "Ferramenta cadastrada com sucesso.");
                JTFMarcaFerramenta.setText("");
                JTFNomeFerramenta.setText("");
                JTFCustoFerramenta.setText("");
            }
        } catch (Erro erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        JTFMarcaFerramenta.setText("");
        JTFNomeFerramenta.setText("");
        JTFCustoFerramenta.setText("");
    }//GEN-LAST:event_JBLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JLabel JLCustoFerramenta;
    private javax.swing.JLabel JLMarcaFerramenta;
    private javax.swing.JLabel JLNomeFerramenta;
    private javax.swing.JTextField JTFCustoFerramenta;
    private javax.swing.JTextField JTFMarcaFerramenta;
    private javax.swing.JTextField JTFNomeFerramenta;
    // End of variables declaration//GEN-END:variables
}
