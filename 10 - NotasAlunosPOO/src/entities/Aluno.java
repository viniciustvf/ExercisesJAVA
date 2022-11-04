package entities;

public class Aluno {
    public String name;
    public double nota1,nota2,nota3;
    public double media = 60.00;
    public double somaNota(){
        double soma = nota1 + nota2 + nota3;
        return soma;
    }
    
    public double quantoFaltou(){
        double n1 = 30 - nota1;
        double n2 = 35 - nota2;
        double n3 = 35 - nota3;
        return (media - somaNota());
    }

}
