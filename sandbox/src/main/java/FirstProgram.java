public class FirstProgram {
    public static void main(String[] args) {
        hello("User!");

        Square s=new Square();
        s.l=5;
        System.out.println("Area of Square with side "+ s.l +" = " +area(s));

        Rectangle r=new Rectangle();
        r.a=3;
        r.b=4;
        System.out.println("Area of Rectangle with sides " + r.a + " and " + r.b + " = " +area(r));
       
    }

    public static void hello(String somebody){
        System.out.println("Hello, "+somebody);
    }

    public static double area(Square s){
       return s.l * s.l;

    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }

}
