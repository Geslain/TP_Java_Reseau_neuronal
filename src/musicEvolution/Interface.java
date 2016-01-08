/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicEvolution;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.File;
import java.util.Observable;
import java.util.Observer;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import jdk.nashorn.internal.objects.NativeArray;
import musicEvolution.Interfaces.NouvellePop1;

/**
 *
 * @author Drap_housse
 */
public class Interface extends javax.swing.JFrame implements Observer {

    private Sequence sequence;
    private Sequencer seq;
    private FileNameExtensionFilter filter;
    private Modele m;
    private int currentIndex = 0;

    
    
    /**
     * Creates new form Interface
     */
    void EnregistrerFichier(String filename) {
        try {
            File file = new File(filename);
            System.out.println("Lecture du nom");
            MidiSystem.write(sequence, 1, file);
            System.out.println("Enregistrement OK : " + filename);
        } catch (Exception e) {
            System.out.println("Oups, problème lors de la lecture !");
        }
    }

    void OuvrirFichier(String filename) {
        try {
            File file = new File(filename);
            System.out.println("Ouverture du fichier MIDI");
            sequence = MidiSystem.getSequence(file);
            try {
                seq.setSequence(sequence);
                seq.start();
            } catch (Exception e) {
                System.out.println("Problème de lancement du Séquenceur");
            }
        } catch (Exception e) {
            System.out.println("Problème : Absence de Sequence Lors de l'ouverture du fichier");
        }
    }

    public Interface(Modele _m) {
        // Obtenir la résolution de l'écran
       Toolkit kit = Toolkit.getDefaultToolkit();
       Dimension screenSize = kit.getScreenSize();
       int screenHeight = screenSize.height;
       int screenWidth = screenSize.width;
       
       m = _m;
       m.addObserver(this);
       m.demarre();
 
       // Centrer la fenêtre dans l'écran
       setSize(screenWidth / 2, screenHeight / 2);
       setLocation(screenWidth / 4, screenHeight / 4);
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

        jToggleButton4 = new javax.swing.JToggleButton();
        jTextField_Indnumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_affichage = new javax.swing.JTextArea();
        jButton_Next = new javax.swing.JButton();
        jButton_Prev = new javax.swing.JButton();
        jToggleButton_Play = new javax.swing.JToggleButton();
        jLabel_Rate = new javax.swing.JLabel();
        jLabel_Indnum = new javax.swing.JLabel();
        jButton_Newpop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Recap = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar_princpal = new javax.swing.JMenuBar();
        jMenu_Fichier = new javax.swing.JMenu();
        jMenu_Newpop = new javax.swing.JMenuItem();
        jMenu_Openind = new javax.swing.JMenuItem();
        jMenu_Saveas = new javax.swing.JMenuItem();
        jMenu_Exit = new javax.swing.JMenuItem();
        jMenu_edit = new javax.swing.JMenu();

        jToggleButton4.setText("3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MusicEvolution 2k15");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(475, 390));
        setResizable(false);

        jTextField_Indnumber.setEditable(false);
        jTextField_Indnumber.setBorder(null);

        jTextArea_affichage.setEditable(false);
        jTextArea_affichage.setColumns(20);
        jTextArea_affichage.setRows(1);
        jTextArea_affichage.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea_affichage);

        jButton_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/resultset-dernier-icone-7114-32.png"))); // NOI18N
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jButton_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/resultset-premier-icone-4160-32.png"))); // NOI18N

        jToggleButton_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/jouer-a-droite-fleche-icone-6822-32.png"))); // NOI18N
        jToggleButton_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_PlayActionPerformed(evt);
            }
        });

        jLabel_Rate.setText("Note :");

        jLabel_Indnum.setText("Individu n°");

        jButton_Newpop.setText("Générer Nouvelle population");
        jButton_Newpop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NewpopActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable_Recap.setAutoCreateRowSorter(true);
        jTable_Recap.setBackground(new java.awt.Color(240, 240, 240));
        jTable_Recap.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTable_Recap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null},
                { new Integer(2), null},
                { new Integer(3), null},
                { new Integer(4), null},
                { new Integer(5), null},
                { new Integer(6), null},
                { new Integer(7), null},
                { new Integer(8), null},
                { new Integer(9), null},
                { new Integer(10), null}
            },
            new String [] {
                "Individu n°", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Recap.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable_Recap.setAutoscrolls(false);
        jTable_Recap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_Recap.setEnabled(false);
        jTable_Recap.setFillsViewportHeight(true);
        jTable_Recap.setIntercellSpacing(new java.awt.Dimension(10, 1));
        jTable_Recap.setRowHeight(20);
        jScrollPane2.setViewportView(jTable_Recap);

        jLabel1.setText("Récapitulatif :");

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jMenu_Fichier.setText("Fichier ");

        jMenu_Newpop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Newpop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/fichier-nouveau-icone-3896-32.png"))); // NOI18N
        jMenu_Newpop.setText("Nouvelle Population");
        jMenu_Newpop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_NewpopActionPerformed(evt);
            }
        });
        jMenu_Fichier.add(jMenu_Newpop);

        jMenu_Openind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Openind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicEvolution/Images/blanc-fichier-un-dossier-icone-9522-32.png"))); // NOI18N
        jMenu_Openind.setText("Ouvrir Individu...");
        jMenu_Openind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_OpenindActionPerformed(evt);
            }
        });
        jMenu_Fichier.add(jMenu_Openind);

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
        jMenu_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ExitActionPerformed(evt);
            }
        });
        jMenu_Fichier.add(jMenu_Exit);

        jMenuBar_princpal.add(jMenu_Fichier);

        jMenu_edit.setText("Edition");
        jMenuBar_princpal.add(jMenu_edit);

        setJMenuBar(jMenuBar_princpal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Newpop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Prev, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton_Play, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Next, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_Indnum)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextField_Indnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_Rate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Indnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Indnum)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Prev, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jToggleButton_Play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Newpop, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_NewpopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_NewpopActionPerformed
        NouvellePop1 param = new NouvellePop1();
        param.setVisible(true);
    }//GEN-LAST:event_jMenu_NewpopActionPerformed

    private void jMenu_SaveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_SaveasActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            // Dossier Courant
            chooser.setCurrentDirectory(new File("." + File.separator));
            //Affichage et récupération de la réponse de l'utilisateur
            int reponse = chooser.showDialog(chooser, "Enregistrer sous");
            System.out.println(reponse);
            // Si l'utilisateur clique sur OK
            if (reponse == JFileChooser.APPROVE_OPTION) {
                // Récupération du chemin du fichier
                String fichier = chooser.getSelectedFile().toString();
                //Ecriture du fichier
                fichier = fichier + ".midi";
                System.out.println(fichier);
                EnregistrerFichier(fichier);
            }
        } catch (HeadlessException he) {
            he.printStackTrace();
        }
    }//GEN-LAST:event_jMenu_SaveasActionPerformed

    private void jButton_NewpopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewpopActionPerformed
        currentIndex = 0;
    }//GEN-LAST:event_jButton_NewpopActionPerformed

    private void jMenu_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu_ExitActionPerformed

    private void jToggleButton_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_PlayActionPerformed
        
    // Crée la piste midi pour l'individu courant
    MidiGeneratorHelper midi = new MidiGeneratorHelper();
    midi.Init();
    midi.ChoisirInstrument(m.getPopulation().getIndividu(currentIndex).getInstrument());    
        for(int i = 0 ; i < 16 ; i++)
        {
            midi.AjouterNote(m.getPopulation().getIndividu(currentIndex).getNote(i));
        }
        midi.Play();        
    }//GEN-LAST:event_jToggleButton_PlayActionPerformed

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed
        currentIndex++;
    }//GEN-LAST:event_jButton_NextActionPerformed

    private void jMenu_OpenindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_OpenindActionPerformed
        try {
            // Filtre MIDI
            filter = new FileNameExtensionFilter("Fichiers .MIDI", "midi");
            JFileChooser chooser = new JFileChooser();
            // Dossier Courant
            chooser.setCurrentDirectory(new File("." + File.separator));
            chooser.setFileFilter(filter);
            chooser.setAcceptAllFileFilterUsed(false);
            //Affichage et récupération de la réponse de l'utilisateur
            int reponse = chooser.showDialog(chooser, "Enregistrer sous");
            System.out.println(reponse);
            // Si l'utilisateur clique sur OK
            if (reponse == JFileChooser.APPROVE_OPTION) {
                // Récupération du chemin du fichier
                String fichier = chooser.getSelectedFile().toString();
                //Ouverture du fichier
                System.out.println(fichier);
                OuvrirFichier(fichier);
            }
        } catch (HeadlessException he) {
            System.out.println("Problème lors de l'ouverture du fichier");
        }
    }//GEN-LAST:event_jMenu_OpenindActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        m.getPopulation().getIndividu(currentIndex).setFitness(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        m.getPopulation().getIndividu(currentIndex).setFitness(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        m.getPopulation().getIndividu(currentIndex).setFitness(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        m.getPopulation().getIndividu(currentIndex).setFitness(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        m.getPopulation().getIndividu(currentIndex).setFitness(5);
    }//GEN-LAST:event_jButton5ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Interface().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_Newpop;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JButton jButton_Prev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Indnum;
    private javax.swing.JLabel jLabel_Rate;
    private javax.swing.JMenuBar jMenuBar_princpal;
    private javax.swing.JMenuItem jMenu_Exit;
    private javax.swing.JMenu jMenu_Fichier;
    private javax.swing.JMenuItem jMenu_Newpop;
    private javax.swing.JMenuItem jMenu_Openind;
    private javax.swing.JMenuItem jMenu_Saveas;
    private javax.swing.JMenu jMenu_edit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Recap;
    private javax.swing.JTextArea jTextArea_affichage;
    private javax.swing.JTextField jTextField_Indnumber;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton_Play;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
