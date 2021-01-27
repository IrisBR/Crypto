/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.donnees.cles;

import java.util.HashMap;

/**
 *
 * @author iris et albane
 */
public class Cles {
    private HashMap<String, Cle> listeCles;
    
    /**
     * Constructeur de la classe
     */
    public Cles(){
        this.listeCles = new HashMap<>();
    }
    
    /**
     * 
     * @param nom
     * @return 
     */
    public Cle getCle(String nom){
        Cle c = this.listeCles.get(nom);
        return c;
    }
    
    /**
     * 
     * @param nom
     * @param cle 
     */
    public void addCle(String nom, Cle cle){
        this.listeCles.put(nom, cle);
    }
}
