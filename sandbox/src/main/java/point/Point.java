package point;

public class Point {

    double x;
    double y;




    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double distanceToOtherPoint(Point other){
        return Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y));
    }
}