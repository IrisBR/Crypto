/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.donnees.messages;

import crypto_maublanc_bocletrichter.exceptions.ExceptionConversionImpossible;
import java.util.ArrayList;

/**
 *
 * @author iris et albane
 */
public class MessageString implements Message {
    private String message;
    
    public MessageString(String message){
        this.message = message;
    }
    
    /**
     * Permet de renvoyer le message sous forme d'une chaîne de caractère
     * @return String : contient le message
     */
    @Override
    public String asString() {
        String res = "";
        try{
            res = this.message;
        }catch(Exception e){
            ExceptionConversionImpossible excep = new ExceptionConversionImpossible("Conversion Impossible en String");
            excep.gerer();
        }
        return res;
    }

    /**
     * Permet de renvoyer le message sous forme d'un entier
     * @return Integer : contient le message
     */
    @Override
    public Integer asInteger() {
        Integer res = 0;
        try{
            res = Integer.parseInt(this.message);
        }catch(Exception e){
            ExceptionConversionImpossible excep = new ExceptionConversionImpossible("Conversion Impossible en Integer");
            excep.gerer();
        }
        return res;
    }

    @Override
    public ArrayList<Integer> getListAsciiCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
