import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Rectangle a = new Rectangle(10, 13);
//        System.out.println(a);
//        System.out.println(a.getArea());
        ArrayList<Rectangle> rectangles = inputRectangles();
        System.out.println(rectangles);
        double s = calcAvgArea(rectangles);
        System.out.println("средняя площадь "+s);
    }

    private static double calcAvgArea(ArrayList<Rectangle> rectangles) {
        double s=0;
        for (Rectangle r: rectangles) {
            s += r.getArea();
        }
        s /= rectangles.size();
        return s;
    }

    private static ArrayList<Rectangle> inputRectangles() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        double a, b;
        do {
            System.out.println(" вводите длину и ширину");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if(a>0 && b>0)
            {
                Rectangle r = new Rectangle(a, b);
                rectangles.add(r);
            }
        } while (a > 0 && b > 0);
        return rectangles;
    }
}