/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_maublanc_bocletrichter.donnees.cles;

/**
 *
 * @author iris et albane
 */
public class CleInteger implements Cle{
    
    private Integer cle;
    
    public CleInteger(Integer cle){
        this.cle = cle;
    }

    @Override
    public String asString() {
        return String.valueOf(this.cle);
    }

    @Override
    public Integer asInteger() {
        return this.cle;
    }
    
}
