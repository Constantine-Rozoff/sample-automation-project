package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can't play game");
    }

    @Test
    public void testThatTooYongUsersCanNotPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.canPlayGame(5), "Aged user can play game");
    }
}
