package JavaOOP;

/**
 *
 * @author Admin
 */
public class TestShape {

    public static void main(String[] args) {
        Shape[] vec = {new Circle(3), new Rectangle(4, 5), new Circle(4), new Circle(8)};
        for (int index = 0; index < vec.length; index++) {
            System.out.println(vec[index]);
        }
    }
}

abstract class Shape {

    public abstract double area();

    public String toString() {
        return " Dien tich la: " + area();
    }
}

class Rectangle extends Shape {

    private double width, height;

    public Rectangle(double wVal, double hVal) {
        width = wVal;
        height = hVal;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
