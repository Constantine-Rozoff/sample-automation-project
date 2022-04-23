package net.absoft.mortalwombat;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void solveQuadraticEquationWithPositiveDiscriminant() {
        QuadraticEquationSolution expectedResult = new QuadraticEquationSolution(5, -1);
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        QuadraticEquationSolution solution = solver.solveQuadraticEquation(1, -4, -5);
        assertEquals(expectedResult, solution);

        // assertTrue(solution.getX1() == 5, "Unexpected x1");
        // assertTrue(solution.getX2() == -1, "Unexpected x2");
    }

    @Test
    public void solveQuadraticEquationWithNegativeDiscriminant() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        QuadraticEquationSolution solution = solver.solveQuadraticEquation(3, -4, 2);
        assertNull(solution, "Solution should be null");
    }

    @Test
    public  void solveQuadraticEquationWithDiscriminantEqualToZero() {
        QuadraticEquationSolution expectedResult = new QuadraticEquationSolution(1, 1);
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        QuadraticEquationSolution solution = solver.solveQuadraticEquation(1, -2, 1);
        assertEquals(expectedResult, solution);
    }

    @Test
    public  void QuadraticEquationShouldNotHaveFirstArgumentAsZero() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        assertThrows(IllegalArgumentException.class, () -> solver.solveQuadraticEquation(0, 2, 1));
    }

}
