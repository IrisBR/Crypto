/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme;

import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.algorithmetransposition.Couple;
import crypto_maublanc_bocletrichter.donnees.cles.Cle;
import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import crypto_maublanc_bocletrichter.donnees.messages.Message;
import crypto_maublanc_bocletrichter.exceptions.ExceptionConversionImpossible;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;

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
        return null;
    }

    @Override
    public Message dechiffrer(Message message, Cles clesPubliques, Cles clesPrivees) {
        return null;
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
                    if(id >= tailleM){
                        tab[i][j] = this.bourrage();
                    }else{
                        tab[i][j] = message.asString().charAt(id);
                    }
                    id++;
                    System.out.println(tab[i][j]);
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
    
    /**
     * Permet de ranvoyer l'odre dans lequel lire les colonnes d'après la clé donnée en paramètre sous forme d'un liste d'entiers
     * @param cle Cle
     * @return ArrayList<Integer> 
     * @throws ExceptionConversionImpossible 
     */
    private ArrayList<Integer> getOrdreColonne(Cle cle) throws ExceptionConversionImpossible {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Couple> couples = new ArrayList<>();
        String sCle = cle.asString();
        try{
            
        }catch(Exception e){
            throw new ExceptionConversionImpossible("Conversion Impossible");
        }
        return res;
    }
}
