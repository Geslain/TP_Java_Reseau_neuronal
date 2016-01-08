/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicEvolution;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Trusty
 */
public class Individu {
    public MidiGeneratorHelper notes;
    public int fitness;
    
    public Individu() {
        newIndividu();
    }
    
    public Individu(Individu parent1, Individu parent2) {
        newIndividuFromParents(parent1, parent2);
    }
    
    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }
    
    /* Permet d'initialiser un Individu *
    * en lui attribuant une valeur de   *
    * fitness égale à 0 et de lui       *
    * attribuer un instrument avec 16   *
    * notes.                           */ 
    public void newIndividu(){
        notes.Init();
        notes.ChoisirInstrument((int)(Math.random() * 127)+1);
        fitness=0;
        for (int i=0; i<16; i++){
            notes.AjouterNote((int)(Math.random() * 127));
        }
    }
    
    /* Permet d'initialiser un Individu *
    * en fonction de ses deux parents. */
    public void newIndividuFromParents(Individu parent1, Individu parent2){
        notes.Init();
        fitness=0;
        for (int i=0; i<16; i++){
            if(((int)(Math.random() * 2)+1) > 1){
                notes.AjouterNote(parent1.notes.getT().get(i));
            }
            else {
                notes.AjouterNote(parent2.notes.getT().get(i));
            }
        }
    }
    
    public void newIndividuFromUniqueParent(Individu parent){
        notes.Init();
        fitness=0;
        for (int i=0; i<16; i++){
            notes.AjouterNote(parent.notes.getT().get(i));
        }
    }
    
    public void mutationIndividu(){
        MidiGeneratorHelper t1 = null;
        t1.Init();
        t1.ChoisirInstrument((int)(Math.random() * 127)+1);
        int cpt=0;
        for (int i=0; i<16; i++){
            if(((int)(Math.random() * 16)+1) < 2){
                t1.AjouterNote((int)(Math.random() * 127));
                notes.AjouterNote(i);
                cpt++;
            }
        }
    }
    
    public void sauvegardeIndividu()
     {
        try {
            final String chemin = "tmp.midi";
            notes.EnregistrerFichier(chemin);
        } 
        catch (Exception e) {
            System.out.println("Impossible de creer le fichier");
        }
    }
}
