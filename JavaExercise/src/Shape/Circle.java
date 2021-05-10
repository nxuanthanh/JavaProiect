package Shape;

/**
 *
 * @author Admin
 */
public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean fill) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return " Circle{" + "radius=" + radius + '}'
                + super.toString() + " Dien tich: " + getArea();
    }

}
