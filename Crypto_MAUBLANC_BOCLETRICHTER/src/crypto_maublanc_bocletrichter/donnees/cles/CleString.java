/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.donnees.cles;

import crypto_maublanc_bocletrichter.exceptions.ExceptionConversionImpossible;

/**
 *
 * @author iris et albane
 */
public class CleString implements Cle{
    
    private String cle;

    public CleString(String cle){
        this.cle = cle;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String asString() {
        String res = "";
        try{
            res = this.cle;
        }catch(Exception e){
            ExceptionConversionImpossible excep = new ExceptionConversionImpossible("Conversion Impossible en String");
            excep.gerer();
        }
        return res;
    }

    @Override
    public Integer asInteger() {
        throw new ExceptionConversionImpossible("Conversion impossible en Integer");
    }

    
    
}
