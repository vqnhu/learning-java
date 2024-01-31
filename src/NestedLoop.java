import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        // nested loop = a loop inside of a loop

//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter x of rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter x of columns: ");
//        columns = scanner.nextInt();
//        System.out.println("Enter symbols to use");
//        symbol = scanner.next();
//
//        for (int i = 1; i <= rows; i++) {
//            System.out.println();
//            for (int j = 1; j <= columns; j++) {
//                System.out.print(symbol);
//
//
//            }
//        }

        int[][][] numb = {
                {{1, 3, 5, 7, 9}},
                {{0, 2, 4, 6, 8}},
                {{1, 2, 3, 4, 5}}
        };


        for (int i = 0; i < numb.length; i++) {
            for (int j = 0; j < numb[i].length; j++) {
                for (int k = 0; k < numb[i][j].length; k++) {
                    System.out.print(numb[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
