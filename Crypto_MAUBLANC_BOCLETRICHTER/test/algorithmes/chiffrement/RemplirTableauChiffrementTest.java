/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmes.chiffrement;

import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.AlgorithmeTransposition;
import crypto_maublanc_bocletrichter.donnees.cles.Cle;
import crypto_maublanc_bocletrichter.donnees.cles.CleString;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import crypto_maublanc_bocletrichter.donnees.messages.MessageString;
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simonetma
 */
public class RemplirTableauChiffrementTest {
    
    

    

    /**
     * Test of dechiffrer method, of class AlgorithmeTransposition.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemplirTableauSansBourrage() throws Exception {
        System.out.println("Test du remplissage du tableau sans bourrage");
        Message message = new MessageString("Bonjour comment ca va ?");
        Cle cleString = new CleString("Chat");
        
        AlgorithmeTransposition instance = new AlgorithmeTransposition();
        Method methode = instance.getClass().getDeclaredMethod("remplirTableauChiffrement", Message.class,Cle.class);
        methode.setAccessible(true);
        char[][] result = (char[][]) methode.invoke(instance, message,cleString);
        
        char[][] expResult = {
            {'B','o','n','j'},
            {'o','u','r',' '},
            {'c','o','m','m'},
            {'e','n','t',' '},
            {'c','a',' ','v'},
            {'a',' ','?','x'},
        };
        
        assertArrayEquals(expResult,result);
    }
    
    /**
     * Test of dechiffrer method, of class AlgorithmeTransposition.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemplirTableauSansBourrage2() throws Exception {
        System.out.println("Test du remplissage du tableau sans bourrage");
        Message message = new MessageString("Bonjour, comment ca va ?");
        Cle cleString = new CleString("Chat");
        
        AlgorithmeTransposition instance = new AlgorithmeTransposition();
        Method methode = instance.getClass().getDeclaredMethod("remplirTableauChiffrement", Message.class,Cle.class);
        methode.setAccessible(true);
        char[][] result = (char[][]) methode.invoke(instance, message,cleString);
        
        char[][] expResult = {
            {'B','o','n','j'},
            {'o','u','r',','},
            {' ','c','o','m'},
            {'m','e','n','t'},
            {' ','c','a',' '},
            {'v','a',' ','?'},
        };
        
        assertArrayEquals(expResult,result);
    }
}
