package Shape;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double length, String color, boolean fill) {
        super(width, length, color, fill);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return " Square{" + " side = " + side + '}' + " diện tích " + getArea();
    }

}
