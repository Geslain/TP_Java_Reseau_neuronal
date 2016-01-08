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
public class Individus {
    public MidiGeneratorHelper notes;
    public int fitness;
    
    public Individus() {
        new_Individus();
    }
    
    public Individus(Individus parent1, Individus parent2) {
        new_Individus_from_parents(parent1, parent2);
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
    public void new_Individus(){
        notes.Init();
        notes.ChoisirInstrument((int)(Math.random() * 127)+1);
        fitness=0;
        for (int i=0; i<16; i++){
            notes.AjouterNote((int)(Math.random() * 127));
        }
    }
    
    /* Permet d'initialiser un Individu *
    * en fonction de ses deux parents. */
    public void new_Individus_from_parents(Individus parent1, Individus parent2){
        notes.Init();
        fitness=0;
        for (int i=0; i<16; i++){
            if(((int)(Math.random() * 2)+1) > 1){
                notes.AjouterNote_from_Index(parent1.notes.Get_Note(i), i);
            }
            else {
                notes.AjouterNote_from_Index(parent2.notes.Get_Note(i), i);
            }
        }
    }
    
    public void new_Individus_from_unique_parent(Individus parent){
        notes.Init();
        fitness=0;
        for (int i=0; i<16; i++){
            notes.AjouterNote_from_Index(parent.notes.Get_Note(i), i);
        }
    }
    
    public void mutation_individu(){
        MidiGeneratorHelper t1 = null;
        t1.Init();
        t1.ChoisirInstrument((int)(Math.random() * 127)+1);
        int cpt=0;
        for (int i=0; i<16; i++){
            if(((int)(Math.random() * 16)+1) < 2){
                t1.AjouterNote((int)(Math.random() * 127));
                notes.AjouterNote_from_Index(t1.Get_Note(cpt),i);
                cpt++;
            }
        }
    }
    
    public void Sauvegarde_Individu()
     {
        try {
            final String chemin = "C:\\Users\\Trusty\\Documents\\NetBeansProjects\\MusicEvolution\\tmp.txt";
            notes.EnregistrerFichier(chemin);
        } 
        catch (Exception e) {
            System.out.println("Impossible de creer le fichier");
        }
    }
}
