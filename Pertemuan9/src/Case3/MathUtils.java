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
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak didefinisikan untuk bilangan negatif.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Faktorial hanya didefinisikan hingga 16 karena overflow.");
        }
        
        int fac = 1;
        for (int i=n; i>0; i--) {
            fac *= i;
        }
        return fac;
    }
}
