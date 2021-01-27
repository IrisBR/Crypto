/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme;

import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;

/**
 *
 * @author iris et albane
 */
public interface Algorithme {
    
    /**
     * 
     * @return 
     */
    public abstract String getNom();
    
    /**
     * 
     * @param message
     * @param clesPubliques
     * @param clesPrivees
     * @return 
     */
    public Message chiffrer(Message message, Cles clesPubliques, Cles clesPrivees);
    
    /**
     * 
     * @param message
     * @param clesPubliques
     * @param clesPrivees
     * @return 
     */
    public Message dechiffrer(Message message, Cles clesPubliques, Cles clesPrivees);
}
