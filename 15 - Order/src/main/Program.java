<<<<<<< HEAD
package main;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime datetimenow = LocalDateTime.now();
        
        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String clientName = sc.nextLine();
        System.out.println("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirth = LocalDate.parse(sc.next(), format01);
        
        Client client = new Client(clientName,clientEmail,clientBirth);
       
        System.out.println("---------------------------------------");
        
        System.out.println("ENTER ORDER DATA: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        Order order = new Order(datetimenow, status, client);
        
        System.out.println("How many items to this order?: ");
        Integer qttItem = sc.nextInt();
        for(int i=0 ; i<=qttItem ; i++){
            System.out.println("Enter #" + i++ + " item data: ");
            System.out.println("Product name: ");
            String productName = sc.next();
            System.out.println("Product price: ");
            Double productPrice = sc.nextDouble();
            
            Product product = new Product(productName, productPrice);
            
            System.out.println("Quantity: ");
            Integer quantity = sc.nextInt();
            
            OrderItem item = new OrderItem(quantity,productPrice,product);
            order.addItem(item);
        }
        
        System.out.println(order);
        
        
        
        
        
        
    }
    
}
=======
package main;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime datetimenow = LocalDateTime.now();
        
        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String clientName = sc.nextLine();
        System.out.println("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirth = LocalDate.parse(sc.next(), format01);
        
        Client client = new Client(clientName,clientEmail,clientBirth);
       
        System.out.println("---------------------------------------");
        
        System.out.println("ENTER ORDER DATA: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        Order order = new Order(datetimenow, status, client);
        
        System.out.println("How many items to this order?: ");
        Integer qttItem = sc.nextInt();
        for(int i=0 ; i<=qttItem ; i++){
            System.out.println("Enter #" + i++ + " item data: ");
            System.out.println("Product name: ");
            String productName = sc.next();
            System.out.println("Product price: ");
            Double productPrice = sc.nextDouble();
            
            Product product = new Product(productName, productPrice);
            
            System.out.println("Quantity: ");
            Integer quantity = sc.nextInt();
            
            OrderItem item = new OrderItem(quantity,productPrice,product);
            order.addItem(item);
        }
        
        System.out.println(order);
        
        
        
        
        
        
    }
    
}
>>>>>>> 6dee2d66686813728fb5980e145b925adced9452
