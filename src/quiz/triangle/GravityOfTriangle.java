package quiz.triangle;

public class GravityOfTriangle {
    public static void main(String[] args) {

        Triangle t = new Triangle(0,0,2,0,0,3);

        t.printGravityOfTriangle();

    }








}

class Triangle {

    int x1, y1, x2, y2, x3, y3 ;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    void printGravityOfTriangle(){
        double gCoordinateX = (double) (x1+x2+x3) / 3 ;
        double gCoordinateY = (double) (y1+y2+y3) / 3 ;

        System.out.printf("%.1f , %.1f\n", gCoordinateX, gCoordinateY);
    }
}


