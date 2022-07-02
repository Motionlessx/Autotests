public class Main {
    public static void main(String[] args) {
        Hello("user");
    }
    public static void Hello(String somebody) {
        System.out.println("Hello " + somebody);
    }
    public Square s = new Square(5) {

    };
    public static double area(Square s){
        return s.x * s.x;
    }

}

