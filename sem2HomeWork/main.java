package sem2HomeWork;

/**
 * main
 */
public class main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 10);
        Rectangle r2 = new Rectangle();
        System.out.printf("ширина %d, высота %d\n", r1.getWidht(), r1.getHeight());
        System.out.printf("ширина %d, высота %d\n", r2.getWidht(), r2.getHeight());
        System.out.println(r1.calculateArea());
        r1.calculatePerimeter();
        r2.calculatePerimeter();


    }
}