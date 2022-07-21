package com.company;

public class Main {

    public static int feladat01(String [] szinek){



        int counter=0;
        for (int i = 0; i < szinek.length-1 ; i++) {
            for (int j = 0; j < szinek.length-1; j++) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        String [] colors={"a"};

        System.out.println(feladat01(colors));

    }
}
