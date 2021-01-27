/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.entites;

import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import java.util.HashMap;

/**
 *
 * @author iris et albane
 */
public class Univers {
    private Univers instance;
    private HashMap<String, Cles> listeClesPubliques;
    private HashMap<String, Message> listMessagesPublics;
    
    /**
     * Constructeur de la classe Univers
     */
    private Univers(){
        
    }
    
    public Univers get(){
        
    }
    
    public void addCles(String identifiant, Cles cles){
        
    }
    
    public Cles getCles(String identifiant){
        
    }
    
    public void addMessage(String identifiant, Message message){
        
    }
    
    public Message getMessage(String identifiant){
        
    }
}
