import org.junit.Assert;

public class largestElementTest {
    largestElement i = new largestElement();
    double[][] array = {
            {23.5, 35, 2, 10},
            {4.5, 3, 45, 3.5},
            {35, 44, 5.5, 9.6}
    };

    @org.junit.Test
    public void locateLargest() throws Exception {
        String expect = "[1, 2]";
        Assert.assertEquals("Expected result = (1,2)", expect, i.locateLargest(array));
        System.out.println(i.locateLargest(array));
    }
}
