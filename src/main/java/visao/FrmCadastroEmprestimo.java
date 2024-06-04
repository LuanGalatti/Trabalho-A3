/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;

/**
 *
 * @author Pichau
 */
public class FrmCadastroEmprestimo extends javax.swing.JFrame {

    private Ferramenta ferramenta;
    private Amigo amigo;

    public FrmCadastroEmprestimo() {
        initComponents();
        this.ferramenta = new Ferramenta();
        this.amigo = new Amigo();
        carregaCBFerramenta();
        carregaCBAmigo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JCBFerramenta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JCBAmigo = new javax.swing.JComboBox<>();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Empréstimo");

        jLabel1.setText("Ferramenta:");

        JCBFerramenta.setToolTipText("");

        jLabel2.setText("Amigo:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(JBCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBCancelar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JCBFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try {
            int conf = 0;

            int posicaoFerramenta = JCBFerramenta.getSelectedIndex();
            int posicaoAmigo = JCBAmigo.getSelectedIndex();
            ArrayList<Ferramenta> listaFerramenta = ferramenta.listaFerramenta();
            ArrayList<Amigo> listaAmigo = amigo.listaAmigo();
            Emprestimo emprestimo = new Emprestimo();
            if (listaFerramenta.get(posicaoFerramenta).getDisponivel(listaFerramenta.get(posicaoFerramenta).getIdFerramenta()) == "Não") {
                throw new Erro("Ferramenta ja emprestada");
            }
            int idAmigo = listaAmigo.get(posicaoAmigo).getIdAmigo();
            if (amigo.possuiEmprestimoAtivo(idAmigo)) {
                conf = JOptionPane.showConfirmDialog(null, "Este amigo ja possui um emprestimo ativo, deseja continuar?");
            }
            int idFerramenta = listaFerramenta.get(posicaoFerramenta).getIdFerramenta();
            String DataInicio = LocalDate.now() + "";
            if (conf == 0) {
                if (emprestimo.insertEmprestimoDB(idAmigo, idFerramenta, DataInicio)) {
                    JOptionPane.showMessageDialog(null, "Emprestimo cadastrado com sucesso");
                    ferramenta.updateFerramentaDB(idFerramenta, listaFerramenta.get(posicaoFerramenta).getNomeFerramenta(), listaFerramenta.get(posicaoFerramenta).getMarcaFerramenta(), listaFerramenta.get(posicaoFerramenta).getCustoFerramenta());
                };

            }
        } catch (Erro erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed
    public void carregaCBFerramenta() {
        ArrayList<Ferramenta> listaFerramenta = ferramenta.listaFerramenta();
        for (Ferramenta objeto : listaFerramenta) {
            JCBFerramenta.addItem(objeto.getIdFerramenta() + "- " + objeto.getNomeFerramenta());
        }

    }

    public void carregaCBAmigo() {
        ArrayList<Amigo> listaAmigo = amigo.listaAmigo();
        for (Amigo objeto : listaAmigo) {
            JCBAmigo.addItem(objeto.getIdAmigo() + "- " + objeto.getNomeAmigo());
        }

    }

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
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JComboBox<String> JCBAmigo;
    private javax.swing.JComboBox<String> JCBFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
