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
    public int notes[];
    public int fitness;
    
    public Individus() {
        ;
    }
    
    public void new_Individus(){
        for (int i=0; i<16; i++){
            notes[i]=(int)(Math.random() * 127)+1;
        }
    }
}
