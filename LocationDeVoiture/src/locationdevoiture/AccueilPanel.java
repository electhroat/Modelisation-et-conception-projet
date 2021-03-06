/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationdevoiture;

import javax.swing.JPanel;

/**
 *
 * @author jb_wi
 */
public class AccueilPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccueilPanel
     */
    public AccueilPanel() {
        initComponents();
        retour = new JPanel();
        location = new JPanel();
        deconnection = new JPanel();
    }
    
    public void setRetour(JPanel retour)
    {
        this.retour = retour;
    }
    
    public void setLocation(JPanel location)
    {
        this.location = location;
    }
    
    public void setDeconnexion(JPanel decon)
    {
        this.deconnection = decon;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenueLabel = new javax.swing.JLabel();
        locationButton = new javax.swing.JButton();
        retourButton = new javax.swing.JButton();
        deconnexionButton = new javax.swing.JButton();

        bienvenueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bienvenueLabel.setText("Bienvenue,");

        locationButton.setText("Location");
        locationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationButtonActionPerformed(evt);
            }
        });

        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        deconnexionButton.setText("Déconnexion");
        deconnexionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bienvenueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deconnexionButton))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bienvenueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(locationButton)
                .addGap(18, 18, 18)
                .addComponent(retourButton)
                .addGap(18, 18, 18)
                .addComponent(deconnexionButton)
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void locationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationButtonActionPerformed
        Controller.location(this, location);
    }//GEN-LAST:event_locationButtonActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        Controller.retourLocation(this, retour);
    }//GEN-LAST:event_retourButtonActionPerformed

    private void deconnexionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionButtonActionPerformed
        Controller.deconnection(this, deconnection);
    }//GEN-LAST:event_deconnexionButtonActionPerformed

    private JPanel retour;
    private JPanel location;
    private JPanel deconnection;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenueLabel;
    private javax.swing.JButton deconnexionButton;
    private javax.swing.JButton locationButton;
    private javax.swing.JButton retourButton;
    // End of variables declaration//GEN-END:variables
}
