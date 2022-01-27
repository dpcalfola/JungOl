package jungOl;

import java.io.IOException;
import java.util.Scanner;

public class J616_1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Triangle t1 = new Triangle(
                scan.nextInt(), scan.nextInt(),
                scan.nextInt(), scan.nextInt(),
                scan.nextInt(), scan.nextInt()
        );
        scan.close();

        System.out.printf("(%.1f, %.1f)", t1.getCenterOfGravityX(), t1.getCenterOfGravityY());
    }
}

class Triangle {

    private int x1, y1;
    private int x2, y2;
    private int x3, y3;
    private double centerOfGravityX = 0;
    private double centerOfGravityY = 0;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        centerOfGravityX = (x1 + x2 + x3) / 3.0;
        centerOfGravityY = (y1 + y2 + y3) / 3.0;
    }

    public double getCenterOfGravityX() {
        return centerOfGravityX;
    }

    public double getCenterOfGravityY() {
        return centerOfGravityY;
    }

}
