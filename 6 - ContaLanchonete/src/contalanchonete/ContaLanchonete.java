package contalanchonete;

import java.util.Locale;
import java.util.Scanner;

public class ContaLanchonete {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        
        int qtd;
        float preco,cachorro,salada,bacon,tor,refr;
        char cod;
        
        System.out.println("DIGITE O CODIGO DO PRODUTO: ");   
        cod = (char) ent.nextByte();
        System.out.println("DIGITE A QUANTIDADE: ");
        qtd = ent.nextInt();
        ent.close();
        
        if (cod==1){
            preco = (float) 4.00;
            cachorro = preco*qtd;
            System.out.printf("TOTAL: R$%.2f",cachorro);
        }else if(cod==2){
            preco = (float) 4.50;
            salada = preco*qtd;
            System.out.printf("TOTAL: R$%.2f",salada);
        }else if(cod==3){
            preco = (float) 5.00;
            bacon = preco*qtd;
            System.out.printf("TOTAL: R$%.2f",bacon);
        }else if(cod==4){
            preco = (float) 2.00;
            tor = preco*qtd;
            System.out.printf("TOTAL: R$%.2f",tor);
        }else if(cod==5){
            preco = (float) 1.50;
            refr = preco*qtd;
            System.out.printf("TOTAL: R$%.2f",refr);
        }else{
            System.out.println("DIGITE UM CODIGO VALIDO.");
    }
  }
}
