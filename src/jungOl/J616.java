package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J616 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // input
        int[] triangleX = new int[3];
        int[] triangleY = new int[3];
        for (int i = 0; i < 3; i++) {
            triangleX[i] = Integer.parseInt(st.nextToken());
            triangleY[i] = Integer.parseInt(st.nextToken());
        }
        br.close();


        // calculate
        int sumOfCoordinateX = 0;
        int sumOfCoordinateY = 0;
        double centerOfGravityX = 0;
        double centerOfGravityY = 0;

        for (int i = 0; i < 3; i++) {
            sumOfCoordinateX += triangleX[i];
            sumOfCoordinateY += triangleY[i];
        }
        centerOfGravityX = sumOfCoordinateX / 3.0;
        centerOfGravityY = sumOfCoordinateY / 3.0;

        // print
        System.out.printf("(%.1f, %.1f)", centerOfGravityX, centerOfGravityY);

    }


}
