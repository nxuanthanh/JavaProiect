package Shape;

/**
 *
 * @author Admin
 */
public class shapeDriver {

    public static void main(String[] args) {
        Shape sh = new Shape("Hong", true);
        Circle cr = new Circle(5, "Vang", true);
        Rectangle re = new Rectangle(7, 9);
        Square sq = new Square(8);
        System.out.println(sh);
        System.out.println(cr);
        System.out.println(re);
        System.out.println(sq);
    }

}
