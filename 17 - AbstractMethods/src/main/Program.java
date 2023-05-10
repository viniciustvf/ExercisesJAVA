
package main;


import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ArrayList<PessoaFisica> listFisica = new ArrayList<>();
        ArrayList<PessoaJuridica> listJuridica = new ArrayList<>();
        
        System.out.println("Enter the number of tax payers: ");
        int numTaxPayers = sc.nextInt();
        for(int i=0 ; i<=numTaxPayers ; i++){
            System.out.println("Tax payer #" + i + "data: ");
            System.out.println("Individual or company (i/c)?: ");
            
            char individualOrComp = sc.next().charAt(0);
            
            if(individualOrComp == 'i'){
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.println("Health expenditures: ");
                Double health = sc.nextDouble();
                
                listFisica.add(new PessoaFisica(name, anualIncome, health));
            
            }else if(individualOrComp == 'c'){
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.println("Number of employees: ");
                Integer numFuncionarios = sc.nextInt();
                
                listJuridica.add(new PessoaJuridica(name, anualIncome, numFuncionarios));
                
            }
        }
        System.out.println("TAXES PAID: ");
        Double soma = 0.0;
        for (PessoaFisica p : listFisica) {
            System.out.println(p.getNome() + ':' + p.impostoCalc(p.getRendaAnual(), p.getGastosSaude(), 0));  
            soma += p.impostoCalc(p.getRendaAnual(), p.getGastosSaude(), 0);
        }
        for (PessoaJuridica pj : listJuridica) {
            System.out.println(pj.getNome() + ':' + pj.impostoCalc(pj.getRendaAnual(), 0.0, pj.getNumeroFuncionarios()));  
            soma += pj.impostoCalc(pj.getRendaAnual(), 0.0, pj.getNumeroFuncionarios());
        }
        System.out.println("");
        System.out.println("TOTAL TAXES: $ " + soma);
    }
    
}
