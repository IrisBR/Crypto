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
    private static Univers instance = new Univers();
    private HashMap<String, Cles> listeClesPubliques;
    private HashMap<String, Message> listMessagesPublics;
    
    /**
     * Constructeur de la classe Univers
     */
    private Univers(){
        this.listMessagesPublics = new HashMap<String,Message>();
        this.listeClesPubliques = new HashMap<String,Cles>();
    }
    
    /**
     * Getter de l'attribut instance
     * @return Univers
     */
    public Univers get(){
        return this.instance;
    }
    
    /**
     * Permet d'ajouter une clé à la liste listeClesPubliques
     * @param identifiant String
     * @param cles Cles
     */
    public void addCles(String identifiant, Cles cles){
        this.instance.listeClesPubliques.put(identifiant, cles);
    }
    
    /**
     * Getter d'une clé l'attribut listeClesPubliques
     * @param identifiant
     * @return 
     */
    public Cles getCles(String identifiant){
        return this.instance.listeClesPubliques.get(identifiant);
    }
    
    /**
     * Permet d'ajouter un message à la liste listMessagesPublics
     * @param identifiant String
     * @param message Message
     */
    public void addMessage(String identifiant, Message message){
        this.instance.listMessagesPublics.put(identifiant, message);
    }
    
    /**
     * Getter d'un message de l'attribut listMessagesPublics
     * @param identifiant
     * @return Message
     */
    public Message getMessage(String identifiant){
        return this.instance.listMessagesPublics.get(identifiant);
    }
}
