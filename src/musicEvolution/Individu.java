/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicEvolution;
import java.util.Arrays;
/**
 *
 * @author Trusty
 */
public final class Individu {
    private Note notes[];
    private int fitness;
    private int instrument;
    private int nbNotesTrack = 16;
    private double T_MUT = 1/nbNotesTrack;
            
    /**
     * Permet d'initialiser un Individu 
     * en lui attribuant une valeur de   
     * fitness égale à 0 et de lui       
     * attribuer un instrument avec 16   
     * notes.                           
     */
    public Individu() {
        notes = new Note[nbNotesTrack];
        for (int i=0; i<notes.length; i++){
            notes[i] = new Note();
            notes[i].randomNote();
        }
        setFitness(0);
        setInstrument(((int)(Math.random() * 128)+1));
    }
    
    /**
     * Permet d'initialiser un Individu
     * en fonction de ses deux parents.
     * 
     * @param parent 
     */
    public Individu(Individu parent) {
        notes = new Note[nbNotesTrack];
        setFitness(0);
        setInstrument(parent.getInstrument());
        System.arraycopy(parent.notes, 0, notes, 0, notes.length);
    }
    
    /**
     * Permet d'initialiser un Individu
     * en fonction de ses deux parents. 
     * 
     * @param parent1
     * @param parent2 
     */
    public Individu(Individu parent1, Individu parent2) {
        setFitness(0);
        int instrumentHeritage = (int)(Math.random() * 2)+1;
        switch(instrumentHeritage){
            case 0:
                setInstrument(parent1.getInstrument());
                break;
            case 1:
                setInstrument(parent2.getInstrument());
                break;
        }
        notes = new Note[nbNotesTrack];
        int cutPoint = (int)(Math.random() * nbNotesTrack)+1;
        for (int i=0; i<notes.length; i++){
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
        for (int i=0; i<nbNotesTrack; i++){
            double rnd = Math.random();
            //if( rnd < T_MUT){
                mutationType(i);
           // }
        }
    }
    /**
     *
     * @param index 
     */
    public void mutationType(int index){
        int mutationType = (int)(Math.random() * 3)+1;
        while(nbNotesTrack>19 && mutationType==2){
            mutationType = (int)(Math.random() * 3)+1;
        }
        while(nbNotesTrack<10 && mutationType==1){
            mutationType = (int)(Math.random() * 3)+1;
        }
        switch (mutationType){
            //délétion
            case 1 :
                nbNotesTrack--;
                for (int i=index; i<nbNotesTrack; i++ ){
                    notes[i]=notes[i+1];
                }
                notes = Arrays.copyOf(notes, notes.length-1);
                break;
            //addition
            case 2 :
                nbNotesTrack++;
                notes = Arrays.copyOf(notes, nbNotesTrack);
                notes[nbNotesTrack-1]=new Note();
                for (int i=index; i<nbNotesTrack; i++ ){
                    if (i<nbNotesTrack-1){
                        notes[i+1].setId(notes[i].getId());
                        if(i==index)
                            notes[i].randomNote();
                    }
                }
                break;
            //mutation
            case 3 :
                notes[index].randomNote();
                break;
        }
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
    public int getInstrument() {
        return instrument;
    }
    
    /**
     * 
     * @param instrument 
     */
    public void setInstrument(int instrument) {
        this.instrument = instrument;
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
    
    /**
     * 
     * @param i
     * @return 
     */
    int getNote(int i) {
        return notes[i].getId();
    }
    
    /**
     * 
     * @return 
     */
    public int getNbNotesTrack() {
        return nbNotesTrack;
    }
    
    /**
     * 
     * @param nbNotesTrack 
     */
    public void setNbNotesTrack(int nbNotesTrack) {
        this.nbNotesTrack = nbNotesTrack;
    }
}