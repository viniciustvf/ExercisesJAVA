package entities;


public abstract class Pessoa {
    String name;
    Double rendaAnual;

    public Pessoa() {
    }

    public Pessoa(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }
 

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double impostoCalc(Double renda, Double gastosSaude, Integer numeroFuncionarios);

}
