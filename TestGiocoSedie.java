/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giocosedie;

import java.util.logging.Logger;

/**
 *
 * @author Francesco Genovese
 */
public class TestGiocoSedie {
    private final static int NUMSEDIE = 15;
    private static Logger logger = Logger.getLogger("GiocoSedie.TestGiocoSedie");
    
    /**
     * @param args è di tipo String ed è un arry per passare i parametri da linea di comando
     *
     */
    public static void main(String[] args) {
        Posto sedie[] = new Posto[NUMSEDIE];

	for (int k = 0; k < sedie.length; k++)
		sedie[k] = new Posto();

	Display display = new Display(sedie);
	System.out.println("Sto facendo partire il Display.");
        logger.info("Sto facendo partire il Display.");
	display.start();

	Partecipante array[] = new Partecipante[NUMSEDIE+1];
	for (int i = 0; i < NUMSEDIE + 1; i++) {
		array[i] = new Partecipante(sedie);
                System.out.println("Sto facendo partire il thread n." + array[i].getId());
                logger.info("Sto facendo partire il thread n." + array[i].getId());
                array[i].start();
                }
	}
    }
 
