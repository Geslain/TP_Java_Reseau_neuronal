package musicEvolution;

import java.io.File;
import javax.sound.midi.*;

public class MidiGeneratorHelper {
    private Sequencer seq;
    private Sequence sequence;
    private Track t;
    private int nbTicks; // Là où va commencer la prochaine note
    private static int DUREE_TICK = 16; // Permet de rapprocher ou éloigner des notes
    
    public void Init() {
        try {
            // Initialisation du séquenceur, de la séquence et de la piste de la séquence
            seq = MidiSystem.getSequencer(true);
            seq.open();
            sequence = new Sequence(Sequence.PPQ, 24);
            t = sequence.createTrack();
            System.out.println("Init OK");
            nbTicks = 0;
        }
        catch (Exception e) {
            System.out.println("Oups, problème lors de l'initialisation !");
        }
    }

    public void ChoisirInstrument(int nbInstrument) {
        try {
            // Ajout de l'instrument
            ShortMessage mm = new ShortMessage();
            mm.setMessage(192, 1, nbInstrument, 0);
            MidiEvent me = new MidiEvent(mm, 1);
            t.add(me);
            System.out.println("Instrument OK : " + nbInstrument);
        }
        catch(Exception e) {
            System.out.println("Oups, problème lors du choix de l'instrument !");
        }
    }
    
    /* Permet de récupérer une note en fonction d'une Track */
    
    
    public void AjouterNote(int nbNote) {
        try {
            // Début de la note
            ShortMessage sm = new ShortMessage();
            sm.setMessage(144, 1, nbNote, 100);
            MidiEvent me = new MidiEvent(sm, nbTicks);
            t.add(me);

            // Fin de la note
            sm = new ShortMessage();
            sm.setMessage(128 , 1, nbNote, 100);
            me = new MidiEvent(sm, nbTicks + DUREE_TICK);
            t.add(me);
            
            nbTicks += DUREE_TICK;
            System.out.println("Ajout de note OK : " + nbNote);
        }
        catch (Exception e) {
            System.out.println("Oups, problème lors de l'ajout de la note !");
        }
    }
    
    void ReplayFromNote(long tick) {
        try {
            tick = (tick - 1) * DUREE_TICK;
            seq.setTickPosition(tick);
            seq.start();
        }
        catch (Exception e) {
            System.out.println("Oups, problème lors de la lecture !");
        }
    }
  
    void ReplayAfterStop () {
        try {
            seq.start();
        }
        catch (Exception e) {
            System.out.println("Oups, problème lors de la lecture !");
        }
    }
    
    void Play() {
        try {
            seq.setSequence(sequence);
            seq.start();
        }
        catch (Exception e) {
            System.out.println("Oups, problème lors de la lecture !");
        }
    }
    
     void Stop() {
        try {
            seq.stop();
        }
        catch (Exception e) {
            System.out.println("Oups, problème lors de la lecture !");
        }
    }

    void EnregistrerFichier(String filename) {
        try {
            File file = new File(filename);
            MidiSystem.write(sequence, 1, file);
            System.out.println("Enregistrement OK : " + filename);
        }
        catch (Exception e) {
            System.out.println("Oups, problème lors de la lecture !");
        }
    }
}
