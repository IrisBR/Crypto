/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.protocoles;

import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.Algorithme;
import crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.AlgorithmeTransposition;
import crypto_maublanc_bocletrichter.entites.Personne;

/**
 *
 * @author iris et albane
 */
public class ProtocoleTransposition implements Protocole{

    @Override
    public void executer() {
        Personne alice = new Personne("Alice");
        Personne bob = new Personne("Bob");
        
        Algorithme a = new AlgorithmeTransposition();
        Algorithme b = new AlgorithmeTransposition();
        
        alice.setAlgorithme(a);
        bob.setAlgorithme(b);
        
        
    }
    
}
