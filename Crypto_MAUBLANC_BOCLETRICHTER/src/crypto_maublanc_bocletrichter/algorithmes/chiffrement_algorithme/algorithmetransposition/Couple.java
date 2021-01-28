/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.algorithmes.chiffrement_algorithme.algorithmetransposition;

import java.util.Comparator;

/**
 *
 * @author iris et albane
 */
public class Couple{
    private char caractere;
    private int position;
    
    /**
     * Setter de l'attribut caractere
     * @param caractere char
     */
    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    /**
     * Setter de l'attribut position
     * @param position int
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Getter de l'attribut caractere
     * @return char
     */
    public char getCaractere() {
        return this.caractere;
    }

    /**
     * Getter de l'attribut position
     * @return int
     */
    public int getPosition() {
        return this.position;
    }
    
    public Couple(char caractere, int position){
        this.caractere = caractere;
        this.position = position;
    }
}
