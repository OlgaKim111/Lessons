public class FirstProgram {
    public static void main(String[] args) {
        hello("User!");

        Square s=new Square(2);

        System.out.println("Area of Square with side "+ s.l +" = " +s.area());

        Rectangle r=new Rectangle(3,5);

        System.out.println("Area of Rectangle with sides " + r.a + " and " + r.b + " = " +s.area());
       
    }

    public static void hello(String somebody){
        System.out.println("Hello, "+somebody);
    }



}
