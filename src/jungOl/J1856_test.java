package jungOl;

public class J1856_test {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int x = scan.nextInt();
//        int y = scan.nextInt();

        int x = 4;
        int y = 5;

        int[][] ttArray = new int[x][y];

        // make array
        for (int i = 0; i < ttArray.length; i++) {
            for (int j = 0; j < ttArray[0].length; j++) {
                ttArray[i][j] = (j+1) + (i*y);
            }
        }


        // print
        for (int i = 0; i < ttArray.length; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < ttArray[0].length; j++) {
                    System.out.print(ttArray[i][j] + " ");
                }
            }else {
                for (int j = ttArray.length; j >= 0; j--) {
                    System.out.print(ttArray[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("==========================");

//        int[] test = {1,2,3,4,5};
//        printAscending(test);
//        System.out.println();
//        printDescending(test);


        for (int i = 0; i < ttArray.length; i++) {
            for (int j = 0; j < ttArray[0].length; j++) {
                System.out.print(ttArray[i][j] + " ");
            }
            System.out.println();

        }





    }

    private static void printAscending(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void printDescending(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
