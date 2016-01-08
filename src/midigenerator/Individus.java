/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midigenerator;
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
        ;
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
    public void new_Individus_from_parents(Individus enfant, Individus parent1, Individus parent2){
        enfant.notes.Init();
        enfant.fitness=0;
        for (int i=0; i<16; i++){
            if(((int)(Math.random() * 2)+1) > 1){
                enfant.notes.AjouterNote_from_Note(parent1.notes.Get_Note(i), i);
            }
            else {
                enfant.notes.AjouterNote_from_Note(parent2.notes.Get_Note(i), i);
            }
        }
    }
    
    public void new_Individus_from_unique_parent(Individus enfant, Individus parent){
        enfant.notes.Init();
        enfant.fitness=0;
        for (int i=0; i<16; i++){
            enfant.notes.AjouterNote_from_Note(parent.notes.Get_Note(i), i);
        }
    }
    
    public void mutation_individu(Individus individu){
        for (int i=0; i<16; i++){
            if(((int)(Math.random() * 16)+1) < 2){
                //individu.notes.AjouterNote((int)(Math.random() * 127));
            }
        }
    }
}
