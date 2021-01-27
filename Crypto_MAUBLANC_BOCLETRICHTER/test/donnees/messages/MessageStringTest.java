/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donnees.messages;

import crypto_maublanc_bocletrichter.donnees.messages.MessageString;
import crypto_maublanc_bocletrichter.exceptions.ExceptionConversionImpossible;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthieu
 */
public class MessageStringTest {
    
    @Test
    public void testAsString_1() throws ExceptionConversionImpossible {
        System.out.println("1er Test de la méthode asString");
        MessageString instance = new MessageString("Ceci est un message de test");
        String expResult = "Ceci est un message de test";
        String result = instance.asString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAsString_2() throws ExceptionConversionImpossible {
        System.out.println("2nd Test de la méthode asString");
        MessageString instance = new MessageString("");
        String expResult = "";
        String result = instance.asString();
        assertEquals(expResult, result);
    }
/*
    @Test
    public void testAsInteger_1() {
        System.out.println("1er Test de la méthode asInteger");
        MessageString instance = new MessageString("Ceci est un message de test");
        try {
            instance.asInteger();
            fail("La méthode devrait renvoyer une exception");
        }
        catch(ExceptionConversionImpossible ex) {
        }
    }
    
    @Test
    public void testAsInteger_2() {
        System.out.println("2nd Test de la méthode asInteger");
        MessageString instance = new MessageString("");
        try {
            instance.asInteger();
            fail("La méthode devrait renvoyer une exception");
        }
        catch(ExceptionConversionImpossible ex) {
            
        }
    }
    
    @Test
    public void testAsInteger_3() {
        System.out.println("3eme Test de la méthode asInteger");
        MessageString instance = new MessageString("215");
        Integer expResult = 215;
        try {
            Integer result = instance.asInteger();
            assertEquals(expResult, result);
        }
        catch(Exception ex) {
            fail("La méthode ne devrait pas renvoyer une exception");
        }
    }*/
    
}
