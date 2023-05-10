
package entities;


public class PessoaJuridica extends Pessoa {

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }
    
    public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }
    

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    @Override
    public Double impostoCalc(Double rendaAnual, Double gastosSaude, Integer numeroFuncionarios) {
        if(numeroFuncionarios>=10){
            return '$' + ((rendaAnual*14)/100);
        }else{
            return '$' + ((rendaAnual*16)/100);
        }
    }

}