import org.junit.Assert;
import org.junit.Test;

public class HW4Test {
    @Test
    public void letterGradeShouldReturnAWhenBetween90And100() {
        Assert.assertEquals('A', HW4.letterGrade(90));
        Assert.assertEquals('A', HW4.letterGrade(95));
        Assert.assertEquals('A', HW4.letterGrade(100));
    }

    @Test
    public void letterGradeShouldReturnBWhenBetween80And90() {
        Assert.assertEquals('B', HW4.letterGrade(80));
        Assert.assertEquals('B', HW4.letterGrade(85));
        Assert.assertEquals('B', HW4.letterGrade(89));
    }

    @Test
    public void letterGradeShouldReturnCWhenBetween70And80() {
        Assert.assertEquals('C', HW4.letterGrade(70));
        Assert.assertEquals('C', HW4.letterGrade(75));
        Assert.assertEquals('C', HW4.letterGrade(79));
    }

    @Test
    public void letterGradeShouldReturnDWhenBetween60And70() {
        Assert.assertEquals('D', HW4.letterGrade(60));
        Assert.assertEquals('D', HW4.letterGrade(65));
        Assert.assertEquals('D', HW4.letterGrade(69));
    }

    @Test
    public void letterGradeShouldReturnFWhenBetween0And60() {
        Assert.assertEquals('F', HW4.letterGrade(0));
        Assert.assertEquals('F', HW4.letterGrade(30));
        Assert.assertEquals('F', HW4.letterGrade(59));
    }

    @Test
    public void letterGradeShouldReturnXWhenOver100OrLowerThan0() {
        Assert.assertEquals('X', HW4.letterGrade(-1));
        Assert.assertEquals('X', HW4.letterGrade(-10));
        Assert.assertEquals('X', HW4.letterGrade(101));
        Assert.assertEquals('X', HW4.letterGrade(110));
    }

}