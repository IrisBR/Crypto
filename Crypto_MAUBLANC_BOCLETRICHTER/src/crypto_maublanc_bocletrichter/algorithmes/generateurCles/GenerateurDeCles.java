/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.generateurCles;

import crypto_maublanc_bocletrichter.donnees.cles.Cles;

/**
 *
 * @author alban
 */
public interface GenerateurDeCles {
    /**
     * Permet de générer une clé publique
     * @return Cles
     */
    public Cles genererClePublique();
    
    /**
     * Permet de générer une clé privée
     * @return Cles
     */
    public Cles genererClePrivee();
}
