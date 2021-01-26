/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.donnees.cles;

import java.util.HashMap;

/**
 *
 * @author alban
 */
public class Cles {
    private HashMap<String, Cle> listeCles;
    
    public Cles(){
        this.listeCles = new HashMap<>();
    }
    
    public Cle getCle(String nom){
        Cle c = this.listeCles.get(nom);
        return c;
    }
    
    public void addCle(String nom, Cle cle){
        this.listeCles.put(nom, cle);
    }
}
