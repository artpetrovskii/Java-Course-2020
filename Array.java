package ru.geekbrains.java;

public class Array {

    public static
    void main(String[] args) {
        //задание 1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Задание 1:  ");
        for (int i = 0; i < arrll; i++) {
            System.out.println(i + "-" + arr[i]);
        }

        //задание 2
        int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.println(" ");
        System.out.println("Задание 2:  ");

        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println(" ");
        }

        //задание 3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr3 = array3.length;
        for (int i = 0; i < arr3; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.println(" ");
        System.out.print("Задание 3:  ");

        for (int i = 0; i < arr3; i++) {

            System.out.print(+array3[i] + ", ");

        }

        //задание 4
        int[][] sqArr = new int[2][2]; // default прописанные в Java {{0, 0}, {1, 0}};
        System.out.println("");
        System.out.println("Задание 4:  ");
        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                if (i < j) {
                    sqArr[i][j] = 0;
                } else if (i > j) {
                    sqArr[i][j] = 1;
                } else {
                    sqArr[i][j] = 1;
                }
                System.out.print(sqArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}