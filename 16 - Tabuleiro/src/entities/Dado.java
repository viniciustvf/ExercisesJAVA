
package entities;

import java.util.Random;


public class Dado {
    Integer numeroAtual;

    public Dado(Integer numeroAtual) {
        this.numeroAtual = numeroAtual;
    }

    public Dado() {
    }

    public Integer getNumeroAtual() {
        return numeroAtual;
    }

    public void setNumeroAtual(Integer numeroAtual) {
        this.numeroAtual = numeroAtual;
    }
    
    
    public int rolar(){
        return new Random().nextInt(6) + 1; 
    }
}
