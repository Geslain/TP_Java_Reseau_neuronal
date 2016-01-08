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
    // Entier représentant une note
    private int id;
    
    public Note() {
        this.id =0;
    }
    
    public Note(int _id) {
        this.id =_id;
    }
    
    public void randomNote() {
        this.id = (int)(Math.random() * 127);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
