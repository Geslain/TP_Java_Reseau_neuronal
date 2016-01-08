/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicEvolution;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gess
 */
public class Modele extends Observable implements Runnable{

    private Thread t;
    private Population p;
    
    public Modele() {      
        t = new Thread(this);        
    }
    
    @Override
    public void run(){
        
     p = new Population();   
     while(true)
     {
        Population newPop;        
        actualiser();
        try {
            pause();
        } catch (InterruptedException ex) {
            Logger.getLogger(Modele.class.getName()).log(Level.SEVERE, null, ex);
        }
        newPop = new Population(p);
        
        // Survie
        p = newPop;
     }        
    }
    
    public void pause() throws InterruptedException
    {
        synchronized(this){
            this.wait();
        }
    }
    
    public void continu(){
        synchronized(this){
            this.notify();
        }
    }
    
    public void actualiser(){
        setChanged();
        notifyObservers();
    }

    void demarre() {
        t.start();
    }

    Population getPopulation() {
        return p;
    }
}
