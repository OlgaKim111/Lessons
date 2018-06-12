public class FirstProgram {
    public static void main(String[] args) {
        hello("User!");
        double len=5;
        System.out.println("Area of Square with side "+ len +" = " +area(len));
        double a=3;
        double b=4;
        System.out.println("Area of Rectangle with sides " + a + " and " + b + " = " +area(a,b));
       
    }

    public static void hello(String somebody){
        System.out.println("Hello, "+somebody);
    }

    public static double area(double l){
       return l*l;

    }

    public static double area(double a, double b){
        return a*b;
    }

}
