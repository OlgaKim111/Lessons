package point;


    public class DistanceBetweenPoints {
        public static void main(String[] args) {


            Point p1 = new Point(2, 4);
            Point p2 = new Point(5, 8);



            System.out.println("The Distance between Point1 and Point2 = " + distance(p1,p2));
            System.out.println(p2.distanceToOtherPoint(p1));

        }

        public static double distance(Point p1, Point p2) {

            return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));



        }
    }
