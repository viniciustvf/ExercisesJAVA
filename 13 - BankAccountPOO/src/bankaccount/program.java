package bankaccount;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double value = 0;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        Account client;
        System.out.print("Is there na initial deposit? (y/n): ");
        String decision = sc.next();
        String charr = "y";
        if(decision.equals(charr)){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            client = new Account(number,name,initialDeposit);
            
        }else{
            client = new Account(number,name);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(client);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        client.deposit(value);
        System.out.print("Update account data: ");
        System.out.println(client);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        client.withdraw(value);
        System.out.println("Update account data: ");
        System.out.print(client);
        
        
    }
}
