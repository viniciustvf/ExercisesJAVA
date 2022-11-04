package aluguel;

import entities.Hospede;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos quartos vao ser alugados?: ");
        int qtdQuartos = sc.nextInt();
        
        int[] quantidade = new int[qtdQuartos+1];
        Hospede[] quartos = new Hospede[10];
        
        for(int i=1; i<quantidade.length;i++){
            System.out.print("ALUGUEL #" + i + ":" );
            System.out.print("\nNOME: ");
            String name = sc.next();
            System.out.print("EMAIL: ");
            String email = sc.next();
            System.out.print("QUARTO: ");
            int quarto = sc.nextInt();
            quartos[quarto] = new Hospede(name,email,quarto);
        }
        
        System.out.println("Quartos ocupados: ");
        
        for(int i=1; i<quartos.length;i++){
            if((null) != quartos[i]){    
                quartos[i].quartosOcupados();
            }    
        } 
    }      
}
    

