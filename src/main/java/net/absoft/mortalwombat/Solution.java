package net.absoft.mortalwombat;

public class Solution {

    double a;
    double b;
    double c;
    double D;

    static public double findDiscriminant (double a, double b, double c) {
        double D = Math.pow(b, 2) - (4 * a * c);
        System.out.println(D);
        return D;
    }

    static double[] solve (double a, double b, double discriminant) {
        double x1, x2;
        double[] results = new double[2];

        if(a != 0) {
            if(discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant))/(2 * a);
                x2 = (-b - Math.sqrt(discriminant))/(2 * a);
                results[0] = x1;
                results[1] = x2;
                System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
            } else if(discriminant == 0) {
                x1 = -b/(2 * a);
                results[0] = x1;
                System.out.println("x1 = " + x1);
            } else {
                System.out.println("No real roots");
            }
        } else {
            System.out.println("Error: division by zero.");
        }return results;
    }
}
