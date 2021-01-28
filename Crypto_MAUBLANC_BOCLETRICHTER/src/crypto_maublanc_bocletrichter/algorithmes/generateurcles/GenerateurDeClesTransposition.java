/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.generateurcles;

import crypto_maublanc_bocletrichter.donnees.cles.CleString;
import crypto_maublanc_bocletrichter.donnees.cles.Cles;
import java.security.SecureRandom;

/**
 *
 * @author alban
 */
public class GenerateurDeClesTransposition implements GenerateurDeCles{
    private int taille;
    
    public GenerateurDeClesTransposition(int taille){
        this.taille = taille;
    }
    
    public Cles genererClePublique(){
        return null;
    }
    
    public Cles genererClePrivee(){
        Cles res = new Cles();
        String s ="";
        while (s.length()< this.taille){
            SecureRandom rand = new SecureRandom();
            int i = rand.nextInt();
            
            if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)){
                String c = Character.toString((char) i);
                s += c;
            }
        }
        CleString c = new CleString(s);
        res.addCle("cleTransposition", c);
        return res;
    }
    
}
