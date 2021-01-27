/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.exceptions;

/**
 *
 * @author iris et albane
 */
public class ExceptionConversionImpossible extends ExceptionCryptographie {
    public ExceptionConversionImpossible(String message){
        super("Conversion Impossible",message);
    }
}