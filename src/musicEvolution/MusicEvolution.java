package musicEvolution;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicEvolution implements ActionListener {
    private MidiGeneratorHelper mgh;
    public Random geneAlea;
    
    public static void main(String[] args) {
        MusicEvolution mg = new MusicEvolution();
    }
    
    public MusicEvolution() {
        // CrÃ©ation de la fenÃªtre
        JFrame fenetre = new JFrame();
        fenetre.setTitle("GÃ©nÃ©rateur de mÃ©lodie");
        fenetre.setSize(300, 300);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);
        // CrÃ©ation du bouton
        JButton btn = new JButton("Cliquez pour jouer une mÃ©lodie alÃ©atoire");
        btn.addActionListener(this);
        fenetre.setContentPane(btn);
        // Affichage
        fenetre.setVisible(true);
        
        // Helper
        mgh = new MidiGeneratorHelper();
        // GÃ©nÃ©rateur alÃ©atoire
        geneAlea = new Random();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mgh.Init();
        mgh.ChoisirInstrument(geneAlea.nextInt(127)+1);
        for (int i = 0; i < 16; i++) {
            mgh.AjouterNote(geneAlea.nextInt(127));
        }
        mgh.Play();
        // mgh.EnregistrerFichier("test.midi"); // Si besoin, enregistre le fichier midi produit
    }
}
