/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case3;

/**
 *
 * @author Jihan
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorials {    
    public static  void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            try {
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();
                
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Input tidak valid, harap masukkan bilangan bulat.");
                scan.nextLine();
            }
            
            System.out.print("Ingin mencoba lagi? (y/n): ");
            keepGoing = scan.next();
        }
        
        System.out.println("Program selesai.");
    }
}
