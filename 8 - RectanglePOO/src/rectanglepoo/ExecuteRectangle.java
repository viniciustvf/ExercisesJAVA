package rectanglepoo;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class ExecuteRectangle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        
        Rectangle retangulo1 = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        retangulo1.width = ent.nextDouble();
        retangulo1.height = ent.nextDouble();
        
        System.out.println(retangulo1);
  
    }
    
}
