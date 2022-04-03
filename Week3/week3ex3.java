package Week3;

import java.util.Random;
import java.util.Scanner;

public class week3ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int num = input.nextInt();
        input.close();
        if (num > 1) {
            Random rand = new Random();
            boolean checkRowAll = false;
            boolean CheckColumnAll = false;
            int[][] matrix = new int[num][num];
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    int numMatrix = rand.nextInt(2);
                    matrix[i][j] = numMatrix;
                }
            }
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println("");
            }
            for (int i = 0; i < num; i++) {
                if (CheckRow(matrix, i)) {
                    System.out.println("All " + matrix[i][i] + "s on row " + i);
                    checkRowAll = true;
                }
            }
            if (!checkRowAll) {
                System.out.println("No same number on a row");
            }
            for (int i = 0; i < num; i++) {
                if (CheckColumn(matrix, i)) {
                    System.out.println("All " + matrix[i][i] + "s on column " + i);
                    CheckColumnAll = true;
                }
            }
            if (!CheckColumnAll) {
                System.out.println("No same number on a column");
            }
            if (CheckSubDiagonal(matrix, 0, 1)) {
                System.out.println("All " + matrix[0][0] + "s on the superdiagonal");
            } else {
                System.out.println("No same numbers on superdiagonal");
            }
            if (CheckDiagonal(matrix, 0, 0)) {
                System.out.println("All " + matrix[0][0] + "s on the diagonal");
            } else {
                System.out.println("No same numbers on diagonal");
            }
            if (CheckSubDiagonal(matrix, 1, 0)) {
                System.out.println("All " + matrix[0][0] + "s on the subdiagonal");
            } else {
                System.out.println("No same numbers on subdiagonal");
            }
        } else {
            System.out.println("Plese try again");
        }
    }

    static boolean CheckRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][i] != matrix[row][0]) {
                return false;
            }
        }
        return true;
    }

    static boolean CheckColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] != matrix[0][column]) {
                return false;
            }
        }
        return true;
    }

    static boolean CheckDiagonal(int[][] matrix, int column, int row) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][column] != matrix[row + i][column + i]) {
                return false;
            }
        }
        return true;
    }

    static boolean CheckSubDiagonal(int[][] matrix, int column, int row) {
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[row][column] != matrix[row + i][column + i]) {
                return false;
            }
        }
        return true;
    }
}
