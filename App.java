import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        double n1 = sc.nextDouble();
        System.out.println("enter y1");
        double n2 = sc.nextDouble();
        System.out.println("enter x2");
        double n3 = sc.nextDouble();
        System.out.println("enter y2");
        double n4 = sc.nextDouble();
        double m = slope(n1, n2, n3, n4);
        double dx = Math.abs(n1 - n3);
        double dy = Math.abs(n2 - n4);
        double xp = n1;
        double yp = n2;
        int max;
        if (dx > dy) {
            max = (int) dx;
        } else {
            max = (int) dy;
        }
        if ((m) < 1) {
            for (int i = 0; i < max; i++) {
                System.out.print(xp);
                System.out.print(",");
                System.out.print(yp);
                xp = 1 + xp;
                yp = m + yp;
                System.out.println();
            }
        } else if (m == 1) {
            for (int i = 0; i < max; i++) {
                System.out.print(xp);
                System.out.print(",");
                System.out.print(yp);
                xp = 1 + xp;
                yp = 1 + yp;
                System.out.println();
            }
        } else {
            for (int i = 0; i < max; i++) {
                System.out.print(xp);
                System.out.print(",");
                System.out.print(yp);
                xp = 1 / m + xp;
                yp = 1 + yp;
                System.out.println();
            }

        }

    }

    public static double slope(double x1, double y1, double x2, double y2) {
        double dx = Math.abs(x1 - x2);
        double dy = Math.abs(y1 - y2);
        double m = dy / dx;
        // System.out.println(m);
        return m;
    }

}
