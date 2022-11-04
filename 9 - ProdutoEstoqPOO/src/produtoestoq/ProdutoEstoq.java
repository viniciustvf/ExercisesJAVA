package produtoestoq;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class ProdutoEstoq {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        
        System.out.println("ENTER PRODUCT DATA: ");
        System.out.print("NAME: ");
        String name = ent.nextLine();
        System.out.print("PRICE: ");
        double price = ent.nextDouble();
        System.out.print("QUANTITY: ");
        int quantity = ent.nextInt();
        Product product = new Product(name,price,quantity);
        
        System.out.println();
        System.out.println("PRODUCT DATA: " + product);
        System.out.println();
        System.out.print("ENTER THE NUMBER OF PRODUCTS TO BE ADDED IN STOCK: ");
        quantity = ent.nextInt();
        product.addProducts(quantity);
        System.out.println("UPDATE DATA: " + product);
        System.out.println();
        System.out.print("ENTER THE NUMBER OF PRODUCTS TO BE REMOVED FROM STOCK: ");
        quantity = ent.nextInt();
        product.removeProducts(quantity);
        System.out.println("UPDATE DATA: " + product);
        
       ent.close();
    }
    
}
