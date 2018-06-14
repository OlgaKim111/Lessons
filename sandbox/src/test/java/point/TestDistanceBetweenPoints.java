package point;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDistanceBetweenPoints {

    @Test
    public void TestDistance(){
        Point p1= new Point(2,4);
        Point p2= new Point(5,8);
        Assert.assertEquals(p1.distanceToOtherPoint(p2), 5.0);
    }
}
