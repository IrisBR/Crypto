/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.entites;

import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.Algorithme;
import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import crypto_maublanc_bocletrichter.exceptions.ExceptionAlgorithmeNonDefini;

/**
 *
 * @author iris et albane
 */
public class Personne {
    private String nom; //Atribut en lecture seule
    private Algorithme algorithme;
    private Cles clesPrivees;
    
    /**
     * Getter de l'attribut nom
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter de l'attribut algorithme
     * @return Algorithme
     */
    public Algorithme getAlgorithme() {
        return algorithme;
    }

    /**
     * Getter de l'attribut clesPrivees
     * @return Cles
     */
    public Cles getClesPrivees() {
        return clesPrivees;
    }
    
    /**
     * Setter de l'attribut algorithme
     * @param algorithme 
     */
    public void setAlgorithme(Algorithme algorithme) {
        this.algorithme = algorithme;
    }

    /**
     * Setter de l'attribut clesPrivees
     * @param clesPrivees 
     */
    public void setClesPrivees(Cles clesPrivees) {
        this.clesPrivees = clesPrivees;
    }
    
    /**
     * Constructeur de la classe Personne
     * @param nom 
     */
    public Personne(String nom){
        this.nom = nom;
    }
    
    public Message chiffrer(Message message, Cles clesPubliques){
        Message m = null;
        try{
            m = this.algorithme.chiffrer(message, clesPubliques, this.clesPrivees);      
        }catch(Exception e){
            ExceptionAlgorithmeNonDefini excep = new ExceptionAlgorithmeNonDefini("Algorithme non défini");
            excep.gerer();
        }
        return m;
    }
    
    public Message dechiffrer(Message message, Cles clesPubliques){
        Message m = null;
        try{
            m = this.algorithme.dechiffrer(message, clesPubliques, this.clesPrivees);
        }catch(Exception e){
            ExceptionAlgorithmeNonDefini excep = new ExceptionAlgorithmeNonDefini("Algorithme non défini");
            excep.gerer();
        }
        return m;
    }
}
