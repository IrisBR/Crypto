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
public class ExceptionCryptographie extends Exception {
    private String nom;
    private String message;
    
    public ExceptionCryptographie(String nom, String message){
        this.nom = nom;
        this.message = message;
    }
    
    public void gerer(){
        System.err.println(this.nom.toUpperCase() + " : " + this.message);
        this.printStackTrace(System.err) ;
    }
}
