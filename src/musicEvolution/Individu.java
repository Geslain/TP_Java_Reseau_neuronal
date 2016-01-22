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
        notes = new Note[parent.notes.length];
        nbNotesTrack=parent.notes.length;
        setFitness(0);
        setInstrument(parent.getInstrument());
        notes=Arrays.copyOf(parent.notes, parent.notes.length);
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
            case 1:
                setInstrument(parent1.getInstrument());
                break;
            case 2:
                setInstrument(parent2.getInstrument());
                break;
        }
        int cutPoint = (int)(Math.random() * nbNotesTrack)+1;
        if (parent1.notes.length < parent2.notes.length){
            notes = new Note[parent2.notes.length];
            int i;
            for (i=0; i<parent1.notes.length; i++){
                if(i < cutPoint) {
                    notes[i] = parent1.notes[i];
                } else {
                    notes[i] = parent2.notes[i];
                }
            }
            while(i<parent2.notes.length){
                notes[i] = parent2.notes[i];
                i++;
            }
        }
        else{
            notes = new Note[parent1.notes.length];
            int i;
            for (i=0; i<parent2.notes.length; i++){
                if(i < cutPoint) {
                    notes[i] = parent1.notes[i];
                } else {
                    notes[i] = parent2.notes[i];
                }
            }
            while(i<parent1.notes.length){
                notes[i] = parent1.notes[i];
                i++;
            }
        }
        mutation();
    }
        
    /**
     * 
     */
    public void mutation(){
        for (int i=0; i<notes.length; i++){
            int rnd = (int) (Math.random()*notes.length) + 1;
            if( rnd == 1){
                mutationType(i);
            }
        }
    }
    /**
     *
     * @param index 
     */
    public void mutationType(int index){
        nbNotesTrack=notes.length;
        int mutationType = (int)(Math.random() * 3)+1;
        while((nbNotesTrack>19 && mutationType==2) || (nbNotesTrack<10 && mutationType==1)){
            mutationType = (int)(Math.random() * 3)+1;
        }
        switch (mutationType){
            //délétion
            case 1 :
                nbNotesTrack--;
                for (int i=index; i<nbNotesTrack; i++ ){
                    notes[i].setId(notes[i+1].getId());
                }
                notes = Arrays.copyOf(notes, nbNotesTrack);
                break;
            //addition
            case 2 :
                nbNotesTrack++;
                notes = Arrays.copyOf(notes, nbNotesTrack);
                notes[nbNotesTrack-1]=new Note();
                for (int i=nbNotesTrack-1; i>=index; i-- ){
                    //if (i<nbNotesTrack-1){
                    if(i==index)
                        notes[i].randomNote();
                    else
                        notes[i].setId(notes[i-1].getId());
                        
                    //}
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