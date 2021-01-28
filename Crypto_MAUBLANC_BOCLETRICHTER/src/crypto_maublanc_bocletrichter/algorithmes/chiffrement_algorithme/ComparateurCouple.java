/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme;

import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.algorithmetransposition.Couple;
import java.util.Comparator;

/**
 *
 * @author Utilisateur
 */
public class ComparateurCouple implements Comparator<Couple>{

    /**
     * Permet de trier deux couples suivant l'ordre lexicographique
     * @param o1 Couple
     * @param o2 Couple
     * @return int
     */
    @Override
    public int compare(Couple o1, Couple o2) {
        int res = 0;
        int resC = o1.getCaractere() - o2.getCaractere();
        int resP = o1.getPosition() - o2.getPosition();
        
        res = resC + resP;
        
        return res;
    }
    
}
