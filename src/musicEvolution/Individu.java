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
    private Note notes[];
    private int fitness;
    private static int instrument = (int)(Math.random() * 128)+1;
    private static int NB_NOTES_TRACK = 16;
    private double T_MUT = 1/NB_NOTES_TRACK;
            
    /**
     * Permet d'initialiser un Individu 
     * en lui attribuant une valeur de   
     * fitness égale à 0 et de lui       
     * attribuer un instrument avec 16   
     * notes.                           
     */
    public Individu() {
        notes = new Note[NB_NOTES_TRACK];
        for (int i=0; i<NB_NOTES_TRACK; i++){
            notes[i] = new Note();
            notes[i].randomNote();
        }
        fitness = 0;
    }
    
    /**
     * Permet d'initialiser un Individu
     * en fonction de ses deux parents.
     * 
     * @param parent 
     */
    public Individu(Individu parent) {
        notes = new Note[NB_NOTES_TRACK];
        fitness = 0;
        for (int i=0; i<NB_NOTES_TRACK ;i++){
            notes[i] = parent.notes[i];
        }
    }
    
    /**
     * Permet d'initialiser un Individu
     * en fonction de ses deux parents. 
     * 
     * @param parent1
     * @param parent2 
     */
    public Individu(Individu parent1, Individu parent2) {
        fitness = 0;
        notes = new Note[NB_NOTES_TRACK];
        int cutPoint = (int)(Math.random() * NB_NOTES_TRACK)+1;
        for (int i=0; i<NB_NOTES_TRACK; i++){
            if(i < cutPoint) {
                notes[i] = parent1.notes[i];
            } else {
                notes[i] = parent2.notes[i];
            }
        }
        mutation();
    }
        
    /**
     * 
     */
    public void mutation(){
        for (int i=0; i<NB_NOTES_TRACK; i++){
            double rnd = Math.random();
            if( rnd < T_MUT){
                notes[i].randomNote();
            }
        }
        mutation();
    }
    
    /**
     * 
     * @return 
     */
     public Note[] getNotes() {
        return notes;
    }

     /**
      * 
      * @return 
      */
    public static int getInstrument() {
        return instrument;
    }
    
    /**
     * 
     * @return 
     */
    public int getFitness() {
        return fitness;
    }

    /**
     * 
     * @param fitness 
     */
    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    int getNote(int i) {
        return notes[i].getId();
    }
}
