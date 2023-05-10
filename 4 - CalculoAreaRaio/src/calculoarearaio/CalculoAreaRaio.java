package calculoarearaio;

import java.util.Locale;
import java.util.Scanner;

public class CalculoAreaRaio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner ent = new Scanner(System.in);
        System.out.println("DIGITE O RAIO: ");
        
        double raio = ent.nextDouble();
        double raio2 = Math.pow(raio, 2.0);
        double area = Math.PI * raio2;
        
        System.out.printf("AREA: %.4f ", area);
        
    }
}
