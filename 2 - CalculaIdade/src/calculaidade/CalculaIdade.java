/*
Programa calcula a idade e mostra dias de vida, considerando ano
com 365 dias e mês com 30 dias.
 */
package calculaidade;

import java.util.Scanner;

public class CalculaIdade {

    public static void main(String[] args) {
        int ano,mes,dia,idade,mesi,diai,anosemdia,mesemdia,diasdevida;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("DIGITE O ANO EM QUE VOCÊ NASCEU: ");
        ano = entrada.nextInt();
             
        System.out.println("MES: ");
        mes = entrada.nextInt();
             
        System.out.println("DIA: ");
        dia = entrada.nextInt();
             
        idade = ((ano)-(2022))*-1;
        mesi = ((mes)-(9))*-1;
        diai = ((dia)-(15))*-1;
        
        System.out.print("Voce tem " + idade + " anos ");
        System.out.print(mesi + " meses e ");
        System.out.println(diai + " dias de vida.");
        
        anosemdia = idade*365;
        
        mesemdia = mesi*30;
        
        diasdevida = anosemdia + mesemdia;
       
        System.out.print("Em dias, você está vivo à: " + diasdevida + " dias.");
    }
    
}
