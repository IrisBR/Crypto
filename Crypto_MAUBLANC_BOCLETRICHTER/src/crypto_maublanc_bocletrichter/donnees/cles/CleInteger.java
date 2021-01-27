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
public class CleInteger implements Cle{
    
    private Integer cle;
    
    public CleInteger(Integer cle){
        this.cle = cle;
    }

    @Override
    public String asString() {
        String res = "";
        try{
            res = String.valueOf(this.cle);
        }catch(Exception e){
            ExceptionConversionImpossible excep = new ExceptionConversionImpossible("Conversion Impossible en String");
            excep.gerer();
        }
        return res;
    }

    @Override
    public Integer asInteger() {
        Integer res = 0;
        try{
            res = this.cle;
        }catch(Exception e){
            ExceptionConversionImpossible excep = new ExceptionConversionImpossible("Conversion Impossible en String");
            excep.gerer();
        }
        return res;
    }
    
}
