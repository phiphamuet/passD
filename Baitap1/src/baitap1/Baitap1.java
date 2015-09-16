/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baitap1;

/**
 *
 * @author phi
 */
public class Baitap1 {

    /**
     * @param args the command line arguments
     */
      public static double[] solve(double a, double b, double c) {
 
        double x1, x2, delta;
        double[] results = new double[2];
 
        if (a != 0) {
            delta = b*b - 4*a*c;
            
            if (delta > 0) {
                x1 = ((-b) - delta) / (2 * a);
                x2 = ((-b) + delta) / (2 * a);
                results[0] = x1;
                results[1] = x2;
                System.out.println("x1=" + x1 + "\n" + "x2=" + x2);
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                System.out.println("x1=" + x1);
            } else { 
                System.out.println("No real roots");
            } 
        } else { 
            System.out.println("Error");
        } 
 
        return results;
    } 

    
    
}
