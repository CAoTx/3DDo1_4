/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminverwaltung;

import javax.swing.JOptionPane;

/**
 *
 * @author fb
 * Beispieldialog
 * enthält auch JCalendar-Control
 * 
 */
public class NeueBesprechungDialog extends javax.swing.JDialog {

    /**
     * Creates new form NeueBesprechungDialog
     */
    public NeueBesprechungDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jL_NeueBesprechungAnlegen = new javax.swing.JLabel();
        jL_Datum = new javax.swing.JLabel();
        jB_Cancel = new javax.swing.JButton();
        jDateChooserNeueBesprechung = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jTF_Bezeichnung = new javax.swing.JTextField();
        jB_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jL_NeueBesprechungAnlegen.setText("Neue Besprechung");

        jL_Datum.setText("Datum");

        jB_Cancel.setText("Cancel");
        jB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Bezeichnung");

        jB_OK.setText("OK");
        jB_OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_OKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_NeueBesprechungAnlegen)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTF_Bezeichnung))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jL_Datum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateChooserNeueBesprechung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jB_Cancel)
                        .addGap(29, 29, 29)
                        .addComponent(jB_OK)
                        .addGap(0, 176, Short.MAX_VALUE)))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jL_NeueBesprechungAnlegen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Datum)
                    .addComponent(jDateChooserNeueBesprechung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_Bezeichnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Cancel)
                    .addComponent(jB_OK))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CancelActionPerformed
        // Dialogfesnter schliessen
        this.dispose();
    }//GEN-LAST:event_jB_CancelActionPerformed

    private void jB_OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_OKMouseClicked
        // Datum auslesen
        String datum = jDateChooserNeueBesprechung.getDate().toString();
        // .. und in MessageBox ausgeben
        JOptionPane.showMessageDialog(null, datum, "Test Titel", JOptionPane.OK_CANCEL_OPTION);
        
        String bezeichnung = jTF_Bezeichnung.getText();
        System.out.println(bezeichnung);      
                
    }//GEN-LAST:event_jB_OKMouseClicked

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
            java.util.logging.Logger.getLogger(NeueBesprechungDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeueBesprechungDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeueBesprechungDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeueBesprechungDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NeueBesprechungDialog dialog = new NeueBesprechungDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Cancel;
    private javax.swing.JButton jB_OK;
    private com.toedter.calendar.JDateChooser jDateChooserNeueBesprechung;
    private javax.swing.JLabel jL_Datum;
    private javax.swing.JLabel jL_NeueBesprechungAnlegen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTF_Bezeichnung;
    // End of variables declaration//GEN-END:variables
}