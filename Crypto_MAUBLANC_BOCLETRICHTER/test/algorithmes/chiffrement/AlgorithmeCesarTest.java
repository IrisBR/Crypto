/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmes.chiffrement;

import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.Algorithme;
import crypto_maublanc_bocletrichter.donnees.cles.CleInteger;
import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import crypto_maublanc_bocletrichter.donnees.messages.MessageString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Matthieu
 */
public class AlgorithmeCesarTest {
    
    /**
     * Test of chiffrer method, of class AlgorithmeCesar.
     * @throws java.lang.Exception
     */
    @Test
    public void testChiffrer() throws Exception {
        System.out.println("Test de la méthode chiffrer");
        Message message = new MessageString("Bonjour comment CA va !");
        Cles clesPubliques = null;
        Cles clesPrivees = new Cles();
        clesPrivees.addCle("cleCesar", new CleInteger(10));
        Algorithme instance = new Algorithme();
        String expResult = "Lyxtyeb mywwoxd MK fk !";
        String result = instance.chiffrer(message, clesPubliques, clesPrivees).asString();
        assertEquals(expResult, result);
    }

    /**
     * Test of dechiffrer method, of class AlgorithmeCesar.
     * @throws java.lang.Exception
     */
    @Test
    public void testDechiffrer() throws Exception {
        System.out.println("Test de la méthode déchiffrer");
        Message message = new MessageString("Lyxtyeb mywwoxd MK fk !");
        Cles clesPubliques = null;
        Cles clesPrivees = new Cles();
        clesPrivees.addCle("cleCesar", new CleInteger(10));
        Algorithme instance = new Algorithme();
        String expResult = "Bonjour comment CA va !";
        String result = instance.dechiffrer(message, clesPubliques, clesPrivees).asString();
        assertEquals(expResult, result);
    }
    
}
