
package entities;


public class Jogador {
    Integer casaAtual;
    Integer meuNumero;
    
    Dado dado = new Dado();
    public Jogador(){
    }

    public Jogador(Integer casaAtual, Integer meuNumero) {
        this.casaAtual = casaAtual;
        this.meuNumero = meuNumero;
    }

    public Integer getCasaAtual() {
        return casaAtual;
    }

    public void setCasaAtual(Integer casaAtual) {
        this.casaAtual += casaAtual;
    }

    public Integer getMeuNumero() {
        return meuNumero;
    }

    public void setMeuNumero(Integer meuNumero) {
        this.meuNumero = meuNumero;
    }
    
    public int jogar(){
        this.meuNumero = dado.rolar();
        return meuNumero;
    }
}
