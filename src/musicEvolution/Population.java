/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicEvolution;

/**
 *
 * @author Trusty
 */
public class Population {
    private Individu individus[]= new Individu[16];
    private double T_CROSS=0.6;
    
    public Population() {
        for (int i=0; i<10;i++){
            individus[i]= new Individu();
        }
    }
    
    public Population(Population pop){
        Individu ind ;
        for(int i = 0 ; i < 10 ;i++)
        {
            double rnd = Math.random();
            if (rnd < T_CROSS) {
                Individu parent1 = selection(pop);
                Individu parent2 = selection(pop);
                ind = new Individu(parent1 , parent2);
            } else {
                Individu parent1 = selection(pop);
                ind = new Individu(parent1);
            }

            ind.mutation();
            individus[i] = ind;
        }
    }

    public Individu selection(Population pop) {
	int rnd1 = (int)(Math.random()*9);
	int rnd2 = (int)(Math.random()*9);
        
	if(pop.getIndividu(rnd1).getFitness() > pop.getIndividu(rnd2).getFitness()) {
            return pop.individus[rnd1];
	} else { 
            return pop.individus[rnd2];
        }
    }
    
    public Individu getIndividu(int i){
        return individus[i];
    }   
}
