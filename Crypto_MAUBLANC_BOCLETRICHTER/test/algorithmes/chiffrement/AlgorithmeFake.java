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
import crypto_maublanc_bocletrichter.exceptions.ExceptionCryptographie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


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
    public Message chiffrer(Message message, Cles clesPubliques, Cles clesPrivees) throws ExceptionCryptographie {
        return new MessageString("Chiffre");
    }

    @Override
    public Message dechiffrer(Message message, Cles clesPubliques, Cles clesPrivees) throws ExceptionCryptographie {
        return new MessageString("Dechiffre");
    }

}
