package calculomedia;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        float n1,n2,n3,media;
        
        System.out.println("CALCULADORA DE MEDIAS!");
        
        Scanner teclado = new Scanner(System.in);       
        
        System.out.println("Digite sua primeira nota: ");
        n1 = teclado.nextFloat();
              
        System.out.println("Digite sua segunda nota: ");
        n2 = teclado.nextFloat();
               
        System.out.println("Digite sua terceira nota: ");
        n3 = teclado.nextFloat();
       
        
        media = (n1+n2+n3)/3;
        System.out.println("Sua média é: " + media);
        
        if(media<6){
            System.out.println("Voce foi reprovado =(. ");
        }else{
            System.out.println("Parabéns! voce foi aprovado. ");
        }
    }
        
    
}
