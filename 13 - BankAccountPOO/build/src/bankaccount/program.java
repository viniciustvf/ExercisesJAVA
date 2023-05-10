package bankaccount;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        Integer number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        Account client;
        System.out.print("Is there na initial deposit? (y/n): ");
        String decision = sc.next();
        System.out.print("Enter Withdraw limit: ");
        Double withDrawLimit = sc.nextDouble();
        String charr = "y";
        if(decision.equals(charr)){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            client = new Account(number,name,initialDeposit,withDrawLimit);
            
        }else{
            client = new Account(number,name,withDrawLimit);
        }
        sc.next();
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(client);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        client.deposit(sc.nextDouble());
        System.out.print("Update account data: ");
        System.out.println(client);
        System.out.println();
        try{
            System.out.print("Enter a withdraw value: ");
            client.withdraw(sc.nextDouble());
        }
        catch(IllegalArgumentException e){
            System.out.println("Erro no saque - " + e.getMessage());
        }
        System.out.println("Update account data: ");
        System.out.print(client);
        
        
    }
}
