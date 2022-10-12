package tipocombustivel;

import java.util.Locale;
import java.util.Scanner;

public class TipoCombustivel {

    public static void main(String[] args) {
        int tipo,gas=0,alc=0,die=0;
        System.out.println("DIGITE O TIPO DE GASOLINA");
        System.out.println("1.ALCOOL "
                + "2.GASOLINA "
                + "3.DIESEL "
                + "4.FIM ");
        Scanner ler = new Scanner(System.in);
        tipo=ler.nextInt();
        
        while (tipo!=4){
            if (tipo==1){
                alc++;
            }else if(tipo==2){
                gas++;
            }else if(tipo==3){
                die++;
            }else{
                System.out.println("DIGITE UM TIPO VALIDO");
            }             
         
            tipo=ler.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("ALCOOL: " + alc);
        System.out.println("GASOLINA: " + gas);
        System.out.println("DIESEL: " + die);
 
   }
} 
