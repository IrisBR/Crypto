/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme;

import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import crypto_maublanc_bocletrichter.exceptions.ExceptionChiffrementImpossible;
import java.util.ArrayList;

/**
 *
 * @author iris et albane
 */
public class Algorithme {
    public String nom; //Attribut en lecture seule

    /**
     * Getter de l'attribut nom
     * @return String
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Chiffre le message donné en paramètre à l'aide éventuellement d'un ensemble de clés publiques et d'un ensemmble de clés privées
     * @param message Message
     * @param clesPubliques Cles
     * @param clesPrivees Cles
     * @return Message
     */
    public Message chiffrer(Message message, Cles clesPubliques, Cles clesPrivees){
        Message m = message;
        try{
            //A coder
        }catch(Exception e){
            ExceptionChiffrementImpossible excep = new ExceptionChiffrementImpossible("Chiffrement Impossible");
            excep.gerer();
        }
        return m;
    }
    
    /**
     * Déchiffre le message donné en paramètre à l'aide éventuellement d'un ensemble de clés publiques et d'un ensemmble de clés privées
     * @param message Message
     * @param clesPubliques Cles
     * @param clesPrivees Cles
     * @return Message
     */
    public Message dechiffrer(Message message, Cles clesPubliques, Cles clesPrivees){
        Message m = null;
        try{
            //A coder
        }catch(Exception e){
            ExceptionChiffrementImpossible excep = new ExceptionChiffrementImpossible("Chiffrement Impossible");
            excep.gerer();
        }
        return m;
    }
}
