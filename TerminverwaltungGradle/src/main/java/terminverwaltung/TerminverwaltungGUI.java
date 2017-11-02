/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminverwaltung;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fb
 * Startklasse für GUI-Anwendung
 * Letzte Änderung: 14.09.2017
 * 
 */
public class TerminverwaltungGUI extends javax.swing.JFrame {

    JFrame frame; // Aktuelles Fenster
    Container cp; // Container fuer Fenster, enthaelt Bereiche inkl. GUI-Elemente

    /**
     * Creates new form TerminverwaltungGUI
     */
    public TerminverwaltungGUI() {
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

        jL_Terminverwaltung = new javax.swing.JLabel();
        jL_Praktikumsgruppe = new javax.swing.JLabel();
        jL_Student1 = new javax.swing.JLabel();
        jL_Student2 = new javax.swing.JLabel();
        jL_Student3 = new javax.swing.JLabel();
        jL_Student4 = new javax.swing.JLabel();
        jL_PrakikumSE_WS1718 = new javax.swing.JLabel();
        jL_Benutzrname = new javax.swing.JLabel();
        jL_Passwort = new javax.swing.JLabel();
        jTF_Benutzrname = new javax.swing.JTextField();
        jTF_Passwort = new javax.swing.JTextField();
        jB_Anmelden = new javax.swing.JButton();
        jMenuBar_Terminverwaltung = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMI_Beenden = new javax.swing.JMenuItem();
        jMenu_Edit = new javax.swing.JMenu();
        jMI_NeuenNutzerRegistrieren = new javax.swing.JMenuItem();
        jMenu_Besprechung = new javax.swing.JMenu();
        jMI_NeueBesprechungAnlegen = new javax.swing.JMenuItem();
        jMI_BesprechungAendern = new javax.swing.JMenuItem();
        jMI_BesprechungslisteAusgeben = new javax.swing.JMenuItem();
        jMenu_Raumverwaltung = new javax.swing.JMenu();
        jMI_RaeumeLaden = new javax.swing.JMenuItem();
        jMI_RaumAendern = new javax.swing.JMenuItem();
        jMI_RaumLoeschen = new javax.swing.JMenuItem();
        jMI_RaumHinzufuegen = new javax.swing.JMenuItem();
        jMenu_Ausstattung = new javax.swing.JMenu();
        jMI_AusstattungenLaden = new javax.swing.JMenuItem();
        jMI_AusstattungAendern = new javax.swing.JMenuItem();
        jMI_AusstattungLoeschen = new javax.swing.JMenuItem();
        jMI_AusstattungHinzufuegen = new javax.swing.JMenuItem();
        jMenu_Hilfe = new javax.swing.JMenu();
        jMI_About = new javax.swing.JMenuItem();
        jMenu_Abmelden = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_Terminverwaltung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_Terminverwaltung.setForeground(new java.awt.Color(51, 51, 255));
        jL_Terminverwaltung.setText("Terminverwaltung");

        jL_Praktikumsgruppe.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jL_Praktikumsgruppe.setText("Praktikumsgruppe:  Di2x");

        jL_Student1.setText("fb  (Matr.-Nr.: 007)");

        jL_Student2.setText("Student 2 (Matr.-Nr. 1234567)");

        jL_Student3.setText("Student 3 (Matr.-Nr. 1234567)");

        jL_Student4.setText("Student 4 (Matr.-Nr. 1234567)");

        jL_PrakikumSE_WS1718.setText("Praktikum Software Engineering WS 17/18");

        jL_Benutzrname.setText("Benutzername:");

        jL_Passwort.setText("Passwort:");

        jB_Anmelden.setText("Anmelden");

        jMenu_File.setText("File");

        jMI_Beenden.setText("Beenden / Exit");
        jMI_Beenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_BeendenActionPerformed(evt);
            }
        });
        jMenu_File.add(jMI_Beenden);

        jMenuBar_Terminverwaltung.add(jMenu_File);

        jMenu_Edit.setText("Edit");

        jMI_NeuenNutzerRegistrieren.setText("Neuen Nutzer registrieren");
        jMenu_Edit.add(jMI_NeuenNutzerRegistrieren);

        jMenuBar_Terminverwaltung.add(jMenu_Edit);

        jMenu_Besprechung.setText("Besprechung");

        jMI_NeueBesprechungAnlegen.setText("Neue Besprechung anlegen");
        jMI_NeueBesprechungAnlegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_NeueBesprechungAnlegenActionPerformed(evt);
            }
        });
        jMenu_Besprechung.add(jMI_NeueBesprechungAnlegen);

        jMI_BesprechungAendern.setText("Besprechung ändern/löschen");
        jMenu_Besprechung.add(jMI_BesprechungAendern);

        jMI_BesprechungslisteAusgeben.setText("Besprechungsliste ausgeben");
        jMenu_Besprechung.add(jMI_BesprechungslisteAusgeben);

        jMenuBar_Terminverwaltung.add(jMenu_Besprechung);

        jMenu_Raumverwaltung.setText("Raumverwaltung");

        jMI_RaeumeLaden.setText("Räume laden/initialisieren");
        jMenu_Raumverwaltung.add(jMI_RaeumeLaden);

        jMI_RaumAendern.setText("Raum ändern");
        jMenu_Raumverwaltung.add(jMI_RaumAendern);

        jMI_RaumLoeschen.setText("Raum löschen");
        jMenu_Raumverwaltung.add(jMI_RaumLoeschen);

        jMI_RaumHinzufuegen.setText("Raum hinzufügen");
        jMenu_Raumverwaltung.add(jMI_RaumHinzufuegen);

        jMenuBar_Terminverwaltung.add(jMenu_Raumverwaltung);

        jMenu_Ausstattung.setText("Ausstattung");

        jMI_AusstattungenLaden.setText("Ausstattungen laden/initialisieren");
        jMenu_Ausstattung.add(jMI_AusstattungenLaden);

        jMI_AusstattungAendern.setText("Ausstattung ändern");
        jMenu_Ausstattung.add(jMI_AusstattungAendern);

        jMI_AusstattungLoeschen.setText("Ausstattung löschen");
        jMenu_Ausstattung.add(jMI_AusstattungLoeschen);

        jMI_AusstattungHinzufuegen.setText("Ausstattung hinzufuegen");
        jMenu_Ausstattung.add(jMI_AusstattungHinzufuegen);

        jMenuBar_Terminverwaltung.add(jMenu_Ausstattung);

        jMenu_Hilfe.setText("Hilfe");

        jMI_About.setText("About");
        jMenu_Hilfe.add(jMI_About);

        jMenuBar_Terminverwaltung.add(jMenu_Hilfe);

        jMenu_Abmelden.setText("Abmelden");
        jMenu_Abmelden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_AbmeldenMouseClicked(evt);
            }
        });
        jMenu_Abmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_AbmeldenActionPerformed(evt);
            }
        });
        jMenuBar_Terminverwaltung.add(jMenu_Abmelden);

        setJMenuBar(jMenuBar_Terminverwaltung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jL_Terminverwaltung))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_Praktikumsgruppe)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jL_Student1)
                                            .addComponent(jL_Student2)
                                            .addComponent(jL_Student3))
                                        .addGap(157, 157, 157)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jL_Benutzrname)
                                            .addComponent(jL_Passwort)))
                                    .addComponent(jL_Student4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB_Anmelden)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTF_Benutzrname)
                                        .addComponent(jTF_Passwort, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jL_PrakikumSE_WS1718)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jL_Terminverwaltung)
                .addGap(47, 47, 47)
                .addComponent(jL_Praktikumsgruppe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Student1)
                    .addComponent(jL_Benutzrname)
                    .addComponent(jTF_Benutzrname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_Student2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_Student3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_Passwort)
                            .addComponent(jTF_Passwort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_Student4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jB_Anmelden)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jL_PrakikumSE_WS1718))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMI_BeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_BeendenActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMI_BeendenActionPerformed

    private void jMenu_AbmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_AbmeldenActionPerformed

    }//GEN-LAST:event_jMenu_AbmeldenActionPerformed

    private void jMenu_AbmeldenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_AbmeldenMouseClicked
        // Sicherheitsabfrage bevor Anwendung beendet wird.
        int antwort = JOptionPane.showConfirmDialog(this, "Anwendung beenden!", "Sicherheitsfrage",
                JOptionPane.YES_NO_OPTION);
        // Falls Benutzer Anwendung schließen möchte ...
        if (antwort == JOptionPane.YES_OPTION) {
            // .. dann beenden
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu_AbmeldenMouseClicked

    private void jMI_NeueBesprechungAnlegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_NeueBesprechungAnlegenActionPerformed

        frame = this;  // Pointer auf aktuelles Frameobjekt 
        cp = getContentPane();  // Container-Referenz speichern

        NeueBesprechungDialog dialog = new NeueBesprechungDialog(frame, true);
        dialog.setTitle("Terminverwaltung - Neue Besprechung anlegen");
        dialog.setVisible(true);
    }//GEN-LAST:event_jMI_NeueBesprechungAnlegenActionPerformed

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
            java.util.logging.Logger.getLogger(TerminverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminverwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminverwaltungGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Anmelden;
    private javax.swing.JLabel jL_Benutzrname;
    private javax.swing.JLabel jL_Passwort;
    private javax.swing.JLabel jL_PrakikumSE_WS1718;
    private javax.swing.JLabel jL_Praktikumsgruppe;
    private javax.swing.JLabel jL_Student1;
    private javax.swing.JLabel jL_Student2;
    private javax.swing.JLabel jL_Student3;
    private javax.swing.JLabel jL_Student4;
    private javax.swing.JLabel jL_Terminverwaltung;
    private javax.swing.JMenuItem jMI_About;
    private javax.swing.JMenuItem jMI_AusstattungAendern;
    private javax.swing.JMenuItem jMI_AusstattungHinzufuegen;
    private javax.swing.JMenuItem jMI_AusstattungLoeschen;
    private javax.swing.JMenuItem jMI_AusstattungenLaden;
    private javax.swing.JMenuItem jMI_Beenden;
    private javax.swing.JMenuItem jMI_BesprechungAendern;
    private javax.swing.JMenuItem jMI_BesprechungslisteAusgeben;
    private javax.swing.JMenuItem jMI_NeueBesprechungAnlegen;
    private javax.swing.JMenuItem jMI_NeuenNutzerRegistrieren;
    private javax.swing.JMenuItem jMI_RaeumeLaden;
    private javax.swing.JMenuItem jMI_RaumAendern;
    private javax.swing.JMenuItem jMI_RaumHinzufuegen;
    private javax.swing.JMenuItem jMI_RaumLoeschen;
    private javax.swing.JMenuBar jMenuBar_Terminverwaltung;
    private javax.swing.JMenu jMenu_Abmelden;
    private javax.swing.JMenu jMenu_Ausstattung;
    private javax.swing.JMenu jMenu_Besprechung;
    private javax.swing.JMenu jMenu_Edit;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Hilfe;
    private javax.swing.JMenu jMenu_Raumverwaltung;
    private javax.swing.JTextField jTF_Benutzrname;
    private javax.swing.JTextField jTF_Passwort;
    // End of variables declaration//GEN-END:variables
}
