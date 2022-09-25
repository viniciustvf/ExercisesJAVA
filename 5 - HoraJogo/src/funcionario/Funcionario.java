package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        int hora1,hora2,duracao = 0;
        
        System.out.println("DIGITE A HORA INICIAL DE UM JOGO: ");
        hora1 = ent.nextInt();
        System.out.println("DIGITE A HORA FINAL DE UM JOGO: ");
        hora2 = ent.nextInt();
        
        if (hora1 < hora2){
            duracao = hora2 - hora1;
            System.out.println("O JOGO DUROU: " + duracao + " HORAS");
        }else{
            duracao = 24 - (hora1 - hora2);
            System.out.println("O JOGO DUROU: " + duracao + " HORAS");
        }   
    }   
}
