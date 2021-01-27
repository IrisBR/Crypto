/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donnees.cles;

import crypto_maublanc_bocletrichter.donnees.cles.CleString;
import crypto_maublanc_bocletrichter.exceptions.ExceptionConversionImpossible;
import exceptions.ExceptionConversionImpossible;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author simonetma
 */
public class CleStringTest {
    
    
    /**
     * Test of asString method, of class CleString.
     */
    @Test
    public void testAsString() throws Exception {
        System.out.println("Test de la méthode asString");
        CleString instance = new CleString("cle De Test");
        String expResult = "cle De Test";
        String result = instance.asString();
        assertEquals(expResult, result);
    }

    /**
     * Test of asInteger method, of class CleString.
     */
    @Test
    public void testAsInteger() throws Exception {
        System.out.println("Test de la méthode asInteger");
        CleString instance = new CleString("cle De Test"); ;
        try{
            instance.asInteger();
            fail("La méthode devrait lever une exception");
        }
        catch(ExceptionConversionImpossible ex) {
            
        }
    }
    
}
