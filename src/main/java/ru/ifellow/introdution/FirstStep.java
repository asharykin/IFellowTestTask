package ru.ifellow.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        // с yTop и yBottom запутанное условие, так как OY направлена вниз
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i];
        }
        return arraySum;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int arrayProduct = 1;
        for (int i = 0; i < array.length; i++) {
            arrayProduct = arrayProduct * array[i];
        }
        return arrayProduct;
    }

    public int min(int[] array){
        int arrayMin = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < arrayMin) {
                arrayMin = array[i];
            }
        }
        return arrayMin;
    }

    public int max(int[] array){
        int arrayMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > arrayMax) {
                arrayMax = array[i];
            }
        }
        return arrayMax;
    }

    public double average(int[] array){
        double arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i];
        }
        return array.length == 0 ? 0 : arraySum / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int a = array[i];
                int b = array[j];
                if (a < b) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            array[i] = a * a * a;
        }
    }

    public boolean find(int[]array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int a = array[i];
            int b = array[n - i - 1];
            array[i] = b;
            array[n - i - 1] = a;
        }
    }

    public boolean isPalindrome(int[]array){
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int a = array[i];
            int b = array[n - i - 1];
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        int matrixSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSum = matrixSum + matrix[i][j];
            }
        }
        return matrixSum;
    }

    public int max(int[][] matrix){
        int matrixMax = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrixMax) {
                    matrixMax = matrix[i][j];
                }
            }
        }
        return matrixMax;
    }

    public int diagonalMax(int[][] matrix){
        int diagonalMax = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > diagonalMax) {
                diagonalMax = matrix[i][i];
            }
        }
        return diagonalMax;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                return false;
            }
        }
        return true;
    }

}
