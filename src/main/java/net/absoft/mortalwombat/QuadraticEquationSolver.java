package net.absoft.mortalwombat;

public class QuadraticEquationSolver {
    public QuadraticEquationSolution solveQuadraticEquation(double a, double b, double c) {

        if (a == 0) {
            throw new IllegalArgumentException("Error: division by zero");
        }

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant < 0) {
            return null;
        }

        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new QuadraticEquationSolution(x1, x2);
    }
}
