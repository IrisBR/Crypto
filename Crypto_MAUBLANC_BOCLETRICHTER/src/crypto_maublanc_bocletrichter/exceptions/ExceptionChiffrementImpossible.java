/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.exceptions;

/**
 *
 * @author Utilisateur
 */
public class ExceptionChiffrementImpossible extends ExceptionCryptographie {
    public ExceptionChiffrementImpossible(String message){
        super("Chiffrement Impossible",message);
    }
}
