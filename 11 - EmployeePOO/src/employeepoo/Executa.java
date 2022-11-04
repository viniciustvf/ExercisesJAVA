package employeepoo;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Executa {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("NAME: "); 
        emp.name = sc.next();
        
        System.out.print("GROSS SALARY: ");
        emp.grossSalary = sc.nextDouble();
        
        System.out.print("TAX: ");
        emp.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Name and Net Salary: " + emp.name + "$ " + (emp.grossSalary - emp.tax));
        
        System.out.println();
        System.out.print("Which percentage to increase salary?: ");
        double inputnometodo = sc.nextDouble();
        emp.increaseSalary(inputnometodo);
        
        System.out.println();
        System.out.println("Update data: " + emp);
        sc.close();
    }
    
}
