/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicEvolution;

/**
 *
 * @author Drap_housse
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField_Indnumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_affichage = new javax.swing.JTextArea();
        jToggleButton_prev = new javax.swing.JToggleButton();
        jToggleButton_next = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Fichier = new javax.swing.JMenu();
        jMenu_Newpop = new javax.swing.JMenuItem();
        jMenu_Openpop = new javax.swing.JMenuItem();
        jMenu_Saveas = new javax.swing.JMenuItem();
        jMenu_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setText("Individu n°");
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(240, 240, 240));

        jTextField_Indnumber.setEditable(false);
        jTextField_Indnumber.setBorder(null);
        jTextField_Indnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IndnumberActionPerformed(evt);
            }
        });

        jTextArea_affichage.setColumns(20);
        jTextArea_affichage.setRows(5);
        jScrollPane1.setViewportView(jTextArea_affichage);

        jToggleButton_prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/resultset-premier-icone-4160-32.png"))); // NOI18N
        jToggleButton_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_prevActionPerformed(evt);
            }
        });

        jToggleButton_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/resultset-dernier-icone-7114-32.png"))); // NOI18N
        jToggleButton_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_nextActionPerformed(evt);
            }
        });

        jMenu_Fichier.setText("Fichier ");

        jMenu_Newpop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Newpop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/fichier-nouveau-icone-3896-32.png"))); // NOI18N
        jMenu_Newpop.setText("Nouvelle Population ...");
        jMenu_Newpop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_NewpopActionPerformed(evt);
            }
        });
        jMenu_Fichier.add(jMenu_Newpop);

        jMenu_Openpop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Openpop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/blanc-fichier-un-dossier-icone-9522-32.png"))); // NOI18N
        jMenu_Openpop.setText("Ouvrir Population ...");
        jMenu_Fichier.add(jMenu_Openpop);

        jMenu_Saveas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Saveas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/disque-charger-sauvegarder-icone-9402-32.png"))); // NOI18N
        jMenu_Saveas.setText("Enregistrer sous ...");
        jMenu_Saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_SaveasActionPerformed(evt);
            }
        });
        jMenu_Fichier.add(jMenu_Saveas);

        jMenu_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenu_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/sortir-session-icone-5274-32.png"))); // NOI18N
        jMenu_Exit.setText("Fermer ");
        jMenu_Fichier.add(jMenu_Exit);

        jMenuBar1.add(jMenu_Fichier);

        jMenu2.setText("Edition");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Indnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                            .addComponent(jToggleButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Indnumber)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton_prev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_NewpopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_NewpopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_NewpopActionPerformed

    private void jMenu_SaveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_SaveasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_SaveasActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenu_Exit;
    private javax.swing.JMenu jMenu_Fichier;
    private javax.swing.JMenuItem jMenu_Newpop;
    private javax.swing.JMenuItem jMenu_Openpop;
    private javax.swing.JMenuItem jMenu_Saveas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_affichage;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_Indnumber;
    private javax.swing.JToggleButton jToggleButton_next;
    private javax.swing.JToggleButton jToggleButton_prev;
    // End of variables declaration//GEN-END:variables
}
