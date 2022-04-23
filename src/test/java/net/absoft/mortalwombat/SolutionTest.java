package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void positiveDiscriminatWithTwoRoots () {
        double a = 1;
        double b = -4;
        double c = -5;
        double discriminant = Solution.findDiscriminant(a, b, c);
        System.out.println(discriminant);
        double[] expectedResult = {5, -1};
        double[] result = Solution.solve(a, b, discriminant);
        Assert.assertEquals(expectedResult, result, "quadratic equation has no solution");
    }

    @Test
    public void DiscriminatWith1Root () {
        double a = 4;
        double b = -4;
        double c = 1;
        double discriminant = Solution.findDiscriminant(a, b, c);
        System.out.println(discriminant);
        double[] expectedResult = {0.5, 0};
        double[] result = Solution.solve(a, b, discriminant);
        Assert.assertEquals(expectedResult, result, "quadratic equation has no solution");
    }

    @Test
    public void negativeDiscriminatWithNoRoots () {
        double a = 3;
        double b = -4;
        double c = 2;
        double discriminant = Solution.findDiscriminant(a, b, c);
        System.out.println(discriminant);
        double[] expectedResult = {0,0};
        double[] result = Solution.solve(a, b, discriminant);
        Assert.assertEquals(expectedResult, result, "quadratic equation has no solution");
    }
}
