package main;

public class Main {
    public static void main(String[] args) {
        int a = 1;

        while(a<= 10){
            System.out.println(a++ + " - " + ((10 - a++)));
        }
    }
}
