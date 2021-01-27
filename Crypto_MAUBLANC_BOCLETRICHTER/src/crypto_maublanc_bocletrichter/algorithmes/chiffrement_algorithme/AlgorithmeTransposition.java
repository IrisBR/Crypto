/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme;

import crypto_maublanc_bocletrichter.donnees.cles.Cle;
import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import crypto_maublanc_bocletrichter.exceptions.ExceptionConversionImpossible;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/**
 *
 * @author iris et albane
 */
public class AlgorithmeTransposition implements Algorithme{
    private SecureRandom generateur;
    
    @Override
    public String getNom() {
        return "X";
    }

    @Override
    public Message chiffrer(Message message, Cles clesPubliques, Cles clesPrivees) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message dechiffrer(Message message, Cles clesPubliques, Cles clesPrivees) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Permet de remplir le tableau avec le message passé en paramètre
     * @param message Message
     * @param cle Cle
     * @return char[][]
     * @throws ExceptionConversionImpossible 
     */
    private char[][] remplirTableauChiffrement(Message message,Cle cle) throws ExceptionConversionImpossible{
        ByteBuffer b = ByteBuffer.allocate(4) ;
        b.putInt((cle.asString()+message.asString()).hashCode()) ;
        this.generateur = new SecureRandom (b.array()) ;

        //Création des variables locales
        int id = 0; //Contient la place de la lettre en cours d'ajout dans le tableau
        char[][] tab;
        
        try{
            int tailleCle = cle.asString().length();
            int tailleM = message.asString().length();
            
            //Calcul du nombre de ligne du tableau
            int tailleLigne = tailleM/tailleCle;
            if(tailleM % tailleCle != 0) tailleLigne++; //Arrondi le calcul à l'entier supérieur ou égal comme ça aucune lettre n'est oublié

            
            //Création du tableau
            tab = new char[tailleLigne][tailleCle];
            
            System.out.println(this.bourrage());
            
            //Implémentation du tableau avec le message
            for(int i = 0; i < tailleLigne; i++){
                for(int j = 0; j < tailleCle; j++){
                    tab[i][j] = this.bourrage();
                    id++;
                }
            }
        }catch(Exception e){
            throw new ExceptionConversionImpossible("Impossible de remplir le tableau");
        }
        return tab;
    }
    
    /**
     * Permet de renvoyer un caractère aléatoire parmi a…z et A…Z
     * @return char
     */
    private char bourrage(){
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c = alphabet.charAt(this.generateur.nextInt(alphabet.length()));
        return c;
    }
}
