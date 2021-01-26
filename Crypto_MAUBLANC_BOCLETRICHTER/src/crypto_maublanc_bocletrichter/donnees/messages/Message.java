/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.donnees.messages;

import java.util.ArrayList;

/**
 *
 * @author iris et albane
 */
public interface Message {
    public String asString();
    
    public Integer asInteger();
    
    public ArrayList<Integer> getListAsciiCode();
}
