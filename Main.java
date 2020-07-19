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
