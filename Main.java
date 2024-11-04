public class Main {
    public static void main(String[] args) {

        System.out.println("--- Shape test ---");
        Shapee s1 = new Shapee();
        Shapee s2 = new Shapee("black",false);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println("--- Circle test ---");
        Circle c1 = new Circle();
        Circle c2 = new Circle("white",true,2.0);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("--- Rectangle test ---");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle("red",false,2.0,4.0);
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        System.out.println("--- Square test ---");
        Square sq1 = new Square(2);
        Square sq2 = new Square(3,"black",false);
        System.out.println(sq1.toString());
        System.out.println(sq2.toString());



    }
}