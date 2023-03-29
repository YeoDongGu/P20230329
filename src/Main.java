
import java.util.Scanner;

class Triangle {
    private double x;
    private double y;

    public Triangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle[] tri = new Triangle[3];

        for (int i = 0; i < tri.length; i++) {
            double inp1 = sc.nextInt();
            double inp2 = sc.nextInt();
            tri[i] = new Triangle(inp1, inp2);
        }
        sc.close();

        double avgX = 0;
        double avgY = 0;
        for (int i = 0; i < tri.length; i++) {
            avgX += tri[i].getX();
        }
        avgX = avgX / tri.length;

        for (int i = 0; i < tri.length; i++) {
            avgY += tri[i].getY();
        }
        avgY = avgY / tri.length;

        System.out.printf("(%.1f, %.1f)", avgX, avgY);

    }

}
