/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmes.chiffrement;

import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.Algorithme;
import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import crypto_maublanc_bocletrichter.donnees.messages.MessageString;


/**
 * Description de la classe
 * @author Matthieu
 */
public class AlgorithmeFake implements Algorithme {

    @Override
    public String getNom() {
       return "Algorithme de Test";
    }

    @Override
    public Message chiffrer(Message message, Cles clesPubliques, Cles clesPrivees){
        return new MessageString("Chiffre");
    }

    @Override
    public Message dechiffrer(Message message, Cles clesPubliques, Cles clesPrivees){
        return new MessageString("Dechiffre");
    }

}
