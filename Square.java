public class Square extends Rectangle {
    public Square() {

    }
    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color,boolean filled) {
        super(color,filled,side,side);

    }
    public double getSide() {
        return super.getLength() * super.getLength();
    }
    public void setSide(double side) {

    }
    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    public String toString() {
        return "A Square with side= "+getSide();
    }


}
