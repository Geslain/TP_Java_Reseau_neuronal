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
    
    /*********************************************
    *** Définition des paramètres de la classe ***
    *********************************************/
    
    // Définition de notre tableau de notes de l'individu
    private Note notes[]; 
    
    // Définition de la fitness de l'individu
    private int fitness;
    
    // Dénition de l'instrument de l'individu
    private int instrument;
    
    // Définition du nombre de notes de départ de notre Individu
    private int nbNotesTrack = 16;
    
            
    /**
     * Permet d'initialiser un Individu 
     * en lui attribuant une valeur de   
     * fitness égale à 0 et de lui       
     * attribuer un instrument avec 16   
     * notes.                           
     */
    public Individu() {
        setFitness(0);
        setInstrument(((int)(Math.random() * 128)+1));
        notes = new Note[getNbNotesTrack()];
        for (int i=0; i<getNotes().length; i++){
            notes[i] = new Note();
            notes[i].randomNote();
        }
    }
    
    /**
     * Permet d'initialiser un Individu
     * en fonction d'un de ses deux parents.
     * 
     * @param parent 
     */
    public Individu(Individu parent) {
        setNbNotesTrack(parent.getNbNotesTrack());
        notes = new Note[parent.getNbNotesTrack()];
        setFitness(0);
        setInstrument(parent.getInstrument());
        System.arraycopy(parent.getNotes(), 0, getNotes(), 0, getNotes().length);
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
        int cutPoint = (int)(Math.random() * getNbNotesTrack())+1;
        if (parent1.getNbNotesTrack() > parent2.getNbNotesTrack()){
            setNbNotesTrack(parent1.getNbNotesTrack());
            notes = new Note[getNbNotesTrack()];
            for (int i=0; i<getNotes().length; i++){
                if(i < cutPoint) {
                    notes[i] = parent2.notes[i];
                } else {
                    notes[i] = parent1.notes[i];
                }
            }
        }
        else{
            setNbNotesTrack(parent2.getNbNotesTrack());
            notes = new Note[getNbNotesTrack()];
            for (int i=0; i<getNotes().length; i++){
                if(i < cutPoint ) {
                    notes[i] = parent1.notes[i];
                } else {
                    notes[i] = parent2.notes[i];
                }
            }
        }
        
    }
        
    /**
     * Permet de faire le test si une mutation a lieue ou non
     */
    public void mutation(){
        for (int i=0; i<getNbNotesTrack(); i++){
            int rnd = (int) (Math.random() * getNbNotesTrack())+1;
            if( rnd == 1 ){
                mutationType(i);
            }
        }
    }
    /**
     * Procédure de mutation, selon un tirage aléatoire on détermine
     * le type de la mutation :
     * -Délétion : 1
     * -Addition : 2
     * -Mutation classique : 3
     * 
     * @param index 
     */
    public void mutationType(int index){
        int mutationType = (int)(Math.random() * 3)+1;
        while((nbNotesTrack>19 && mutationType==2) || (nbNotesTrack<10 && mutationType==1)){
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
                for (int i=getNbNotesTrack()-1; i>=index; i-- ){
                    if (i==index){
                        notes[i].randomNote();
                    }
                    else{
                        notes[i].setId(notes[i-1].getId());
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
     * getter notes[]
     * @return 
     */
     public Note[] getNotes() {
        return notes;
    }
     /**
      * getter instrument
      * @return 
      */
    public int getInstrument() {
        return instrument;
    }
    
    /**
     * setter instrument
     * @param instrument 
     */
    public void setInstrument(int instrument) {
        this.instrument = instrument;
    }
    
    /**
     * getter fitness
     * @return 
     */
    public int getFitness() {
        return fitness;
    }
    /**
     * setter fitness
     * @param fitness 
     */
    public void setFitness(int fitness) {
        this.fitness = fitness;
    }
    
    /**
     * getter notes[i]
     * @param i
     * @return 
     */
    int getNote(int i) {
        return notes[i].getId();
    }
    
    /**
     * getter nbNotesTrack
     * @return 
     */
    public int getNbNotesTrack() {
        return nbNotesTrack;
    }
    
    /**
     * setter nbNotesTrack
     * @param nbNotesTrack 
     */
    public void setNbNotesTrack(int nbNotesTrack) {
        this.nbNotesTrack = nbNotesTrack;
    }
}