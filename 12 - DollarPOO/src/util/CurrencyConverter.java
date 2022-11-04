
package util;

public class CurrencyConverter {

    public static double calcDol(double dollar,double quanto){
        return ((dollar + dollar*6/100) * quanto);
    }
}
