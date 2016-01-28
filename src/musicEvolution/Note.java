/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicEvolution;

/**
 *
 * @author Gess
 */
public class Note {
    
    /*********************************************
    *** Définition des paramètres de la classe ***
    *********************************************/
    
    // Entier représentant une note
    private int id;
    
    /**
     * Constructeur permettant d'initialiser une note.
     */
    public Note() {
        this.id =0;
    }
    
    /**
     * Constructeur permettant de créer une note en fonction
     * d'une autre.
     * 
     * @param _id 
     */
    public Note(int _id) {
        this.id =_id;
    }
    
    /**
     * Procédure permettant de choisir une note au hasard.
     * 
     */
    public void randomNote() {
        this.id = (int)(Math.random() * 127);
    }

    /**
     * getter id
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    
    /**
     * setter id
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
