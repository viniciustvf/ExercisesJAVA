package entities;


public class PessoaFisica extends Pessoa {

    private Double gastosSaude;
    
    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    
    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    
    
    
    @Override
    public Double impostoCalc(Double rendaAnual, Double gastosSaude, Integer numeroFuncionarios) {
        Double calc;
        if(rendaAnual<=20000.0){
            calc = '$' + ((rendaAnual*15)/100) - (gastosSaude*50)/100;
        }else{
            calc = '$' + ((rendaAnual*25)/100) - (gastosSaude*50)/100;
        } 
        return calc;
    }
}
