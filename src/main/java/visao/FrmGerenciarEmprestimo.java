package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;

/**
 *
 * @author JUNIOR
 */
public class FrmGerenciarEmprestimo extends javax.swing.JFrame {

    private Emprestimo emprestimo;

    public FrmGerenciarEmprestimo() {
        initComponents();
        this.emprestimo = new Emprestimo();
        this.CarregaListaEmprestimo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimo = new javax.swing.JTable();
        JLID = new javax.swing.JLabel();
        JLId = new javax.swing.JLabel();
        JLIdAmigo = new javax.swing.JLabel();
        JLIdFerramenta = new javax.swing.JLabel();
        JLDataInicio = new javax.swing.JLabel();
        JLDataDevolucao = new javax.swing.JLabel();
        JLAtivo = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBModificar = new javax.swing.JButton();
        JTFIdAmigo = new javax.swing.JTextField();
        JTFIdFerramenta = new javax.swing.JTextField();
        JTFDataEmprestimo = new javax.swing.JTextField();
        JTFDataDevolucao = new javax.swing.JTextField();
        JLativo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Empréstimos");

        JTableEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID EMPRESTIMO", "ID AMIGO", "ID FERRAMENTA", "DATA INÍCIO", "DATA DEVOLUÇÃO", "ATIVO"
            }
        ));
        JTableEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableEmprestimo);

        JLID.setText("ID Empréstimo::");

        JLId.setText("0");

        JLIdAmigo.setText("ID Amigo:");

        JLIdFerramenta.setText("ID Ferramenta:");

        JLDataInicio.setText("Data Início:");

        JLDataDevolucao.setText("Data Devolução:");

        JLAtivo.setText("Ativo:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBModificar.setText("Modificar");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLId))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLIdFerramenta)
                                        .addComponent(JLIdAmigo)
                                        .addComponent(JLDataInicio))
                                    .addGap(27, 27, 27))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(JLDataDevolucao)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLativo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFIdFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFIdAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBApagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLID)
                    .addComponent(JLId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFIdAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLIdAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFIdFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLIdFerramenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLDataInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLDataDevolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAtivo)
                    .addComponent(JLativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBApagar)
                    .addComponent(JBModificar))
                .addGap(15, 15, 15))
        );

        JTFIdAmigo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
//Libera todos os recurso da interface gráfica
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        int id = Integer.parseInt(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 0).toString());
        int idAmigo = Integer.parseInt(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 1).toString());
        int idFerramenta = Integer.parseInt(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 2).toString());
        String dataEmprestimo = JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 3).toString();
        String dataDevolucao = JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 4).toString();
        if (emprestimo.updateEmprestimoDB(id, idAmigo, idFerramenta, dataEmprestimo, dataDevolucao)) {
            JOptionPane.showMessageDialog(null, "Emprestimo atualizado com sucesso");
            JLId.setVisible(false);
            JTFIdAmigo.setText("");
            JTFIdFerramenta.setText("");
            JTFDataEmprestimo.setText("");
            JTFDataDevolucao.setText("");
            this.CarregaListaEmprestimo();
        }
    }//GEN-LAST:event_JBModificarActionPerformed

    private void JTableEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEmprestimoMouseClicked
        if (this.JTableEmprestimo.getSelectedRow() != -1) {
            JLId.setText(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 0).toString());
            JLId.setVisible(true);
            JTFIdAmigo.setText(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 1).toString());
            JTFIdFerramenta.setText(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 2).toString());
            JTFDataEmprestimo.setText(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 3).toString());
            JTFDataDevolucao.setText(JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_JTableEmprestimoMouseClicked

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        emprestimo.deleteEmprestimoDB(Integer.parseInt(JLId.getText()));
        JLId.setVisible(false);
        JTFIdAmigo.setText("");
        JTFIdFerramenta.setText("");
        JTFDataEmprestimo.setText("");
        JTFDataDevolucao.setText("");
        this.CarregaListaEmprestimo();
    }//GEN-LAST:event_JBApagarActionPerformed
    public void CarregaListaEmprestimo() {
        DefaultTableModel model = (DefaultTableModel) JTableEmprestimo.getModel();
        JLId.setVisible(false);
        model.setNumRows(0);
        ArrayList<Emprestimo> listaEmprestimo = emprestimo.listaEmprestimo();
        for (Emprestimo objeto : listaEmprestimo) {
            model.addRow(new Object[]{
                objeto.getIDEmprestimo(),
                objeto.getIDAmigo(),
                objeto.getIDFerramenta(),
                objeto.getDataEmprestimo(),
                objeto.getDataDevolucao(),}
            );
        }
    }

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
            java.util.logging.Logger.getLogger(FrmGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciarEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBModificar;
    private javax.swing.JLabel JLAtivo;
    private javax.swing.JLabel JLDataDevolucao;
    private javax.swing.JLabel JLDataInicio;
    private javax.swing.JLabel JLID;
    private javax.swing.JLabel JLId;
    private javax.swing.JLabel JLIdAmigo;
    private javax.swing.JLabel JLIdFerramenta;
    private javax.swing.JLabel JLativo;
    private javax.swing.JTextField JTFDataDevolucao;
    private javax.swing.JTextField JTFDataEmprestimo;
    private javax.swing.JTextField JTFIdAmigo;
    private javax.swing.JTextField JTFIdFerramenta;
    private javax.swing.JTable JTableEmprestimo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
