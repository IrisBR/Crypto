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
    public static final String nom;
    
    public Message chiffrer(Message message, Cles clesPubliques, Cles clesPrivees);
    
    public Message dechiffrer(Message message, Cles clesPubliques, Cles clesPrivees);
}
