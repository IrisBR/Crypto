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
    private HashMap<String, Message> listeMessagesPublics;
    
    /**
     * Constructeur de la classe Univers
     */
    private Univers(){
        this.listeMessagesPublics = new HashMap<String,Message>();
        this.listeClesPubliques = new HashMap<String,Cles>();
    }
    
    /**
     * Getter de l'attribut instance
     * @return Univers
     */
    public static Univers get(){
        return instance;
    }
    
    /**
     * Permet d'ajouter une clé à la liste listeClesPubliques
     * @param identifiant String
     * @param cles Cles
     */
    public static void addCles(String identifiant, Cles cles){
        instance.listeClesPubliques.put(identifiant, cles);
    }
    
    /**
     * Getter d'une clé l'attribut listeClesPubliques
     * @param identifiant
     * @return 
     */
    public static Cles getCles(String identifiant){
        return instance.listeClesPubliques.get(identifiant);
    }
    
    /**
     * Permet d'ajouter un message à la liste listMessagesPublics
     * @param identifiant String
     * @param message Message
     */
    public static void addMessage(String identifiant, Message message){
        instance.listeMessagesPublics.put(identifiant, message);
    }
    
    /**
     * Getter d'un message de l'attribut listMessagesPublics
     * @param identifiant
     * @return Message
     */
    public static Message getMessage(String identifiant){
        return instance.listeMessagesPublics.get(identifiant);
    }
}
