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
    
    /*********************************************
    *** Définition des paramètres de la classe ***
    *********************************************/
    
    // On définit notre tableau d'individus.
    private Individu individus[]= new Individu[16];
    
    // On définit le taux de crossover
    private double T_CROSS=0.6;
    
    
    /**
     * Constructeur de la classe dans le cas d'une initialisation
     * 
     */
    public Population() {
        for (int i=0; i<10;i++){
            individus[i]= new Individu();
        }
    }
    
    /**
     * Constructeur de la classe dans le cas d'une régénération;
     * Selon le taux de crossover, on construit un nouvel individu
     * en fonction d'un de ses parents ou des deux; On amorce
     * ensuite la fonction de mutation.
     * 
     * @param pop 
     */
    public Population(Population pop){
        Individu ind ;
        
        // Crossover
        for(int i = 0 ; i < 10 ;i++)
        {
            double rnd = Math.random();
            if (rnd < T_CROSS) {
                //Selection
                Individu parent1 = selection(pop);
                //Selection
                Individu parent2 = selection(pop);
                ind = new Individu(parent1 , parent2);
            } else {
                Individu parent1 = selection(pop);
                ind = new Individu(parent1);
            }

            //Mutation
            ind.mutation();
            individus[i] = ind;
        }
    }

    /**
     * Permet de faire la selection d'un parent entre deux parents
     * au hasard; Bien évidemment, c'est celui possédant la 
     * plus grande valeur fitness qui est conservé.
     * 
     * @param pop
     * @return 
     */
    public Individu selection(Population pop) {
	int rnd1 = (int)(Math.random()*9);
	int rnd2 = (int)(Math.random()*9);
        
	if(pop.getIndividu(rnd1).getFitness() > pop.getIndividu(rnd2).getFitness()) {
            return pop.individus[rnd1];
	} else { 
            return pop.individus[rnd2];
        }
    }
    
    /**
     * getter Individu
     * @param i
     * @return 
     */
    public Individu getIndividu(int i){
        return individus[i];
    }   
}
