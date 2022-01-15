package quiz;

public class TwoDice {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.printf("(%d, %d)   ", j, i);
            }
            System.out.println();
        }
    }
}
