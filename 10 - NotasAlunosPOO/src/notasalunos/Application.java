package notasalunos;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("DIGITE SEU NOME E AS 3 NOTAS: ");
        aluno.name = sc.next();
        System.out.println();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        System.out.println();
        
        if(aluno.somaNota()>60.0){
            System.out.printf("NOTA FINAL = %.2f",aluno.somaNota());
            System.out.println("\nPASSOU");
        }else{
            System.out.printf("NOTA FINAL = %.2f",aluno.somaNota());
            System.out.println("\nNAO PASSOU");
            System.out.print("FALTOU " + aluno.quantoFaltou() + " PONTOS.");
        }
 
    }
    
}
