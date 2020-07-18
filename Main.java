package ru.geekbrains.java;

public class Main {
public static void main(String[] args) {
    //задание 5
    int[] arr1 = new int[] {1, 2, 3, 4, 5};
    int minValue = arr1[0];
    int maxValue = arr1[0];
    System.out.println("Задание 5:  ");
    for (int i = 1; i < arr1.length; i++) {
        if (arr1[i] < minValue){
            minValue = arr1[i];
        }
    for(i=0; i < arr1.length; i++){
            maxValue=0;
            for(i=0; i < arr1.length; i++){
                if(maxValue < arr1[i]) {
                    maxValue=arr1[i];
                }
            }
        }
    System.out.println("минимальный элемент: " + minValue);
    System.out.println("максимальный элемент: " + maxValue);
    }

    // задание 6
    int[] mass = new int [6];
    System.out.println("Задание 6:  ");
    for (int i=0; i<6; i++) {
        if (i == 0) {
            mass[0] = 1;
        }
        if (i == 1) {
            mass[1] = 3;
        }
        if (i == 2) {
            mass[2] = 2;
        }
        if (i == 3) {
            mass[3] = 1;
        }
        if (i == 4)
        {
            mass[4] = 2;
        }
        if (i == 5) {
            mass[5] = 4;
        }
        int p;
        int q;
        p = mass [0] + mass[1] + mass [2];
        q = mass [3] + mass [4] + mass [5];
        switch (p-q) {
            case 0:
                System.out.println("true");
                break;
            case 1:
            case -1:
                System.out.println("false");
                break;
        }
    }
}

package ru.geekbrains.java.lesson1;

public class Main {
    // задание 1
    public static void main(String[] args) {
        }
    // задание 2
    public void variables() {
        byte a = -37;
        short b = -23964;
        int c = 471193;
        long d = 17899456908L;
        float dot = 11573;
        double two = 345.57f;
        char other = '#';
        boolean valid = true;
        String str = "homework1";
    }
    // задание 3
    public static float expression(float x, float y, float z, float w){
        return x * (y + (z / w));
    }
    // задание 4
    public static boolean returning(int first, int second){
        return 10 <= first + second && first + second <= 20;
    }
    // задание 5
    public static void negativity(int i){
        System.out.println(i < 0 ? "-" : "+");
    }
    // задание 6
    public static boolean returning2(int l){
        return l < 0;
    }
    // задание 7
    public static void string(String name){
        System.out.printf("Hey, %s!", name);
    }
    // задание 8
    public static boolean leaping(int year){
        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
    }
}
