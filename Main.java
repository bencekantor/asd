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

        System.out.println(feladat01(colors));//0

        String [] colors1={""};

        System.out.println(feladat01(colors1));//0

        String [] colors2={"a","b",};

        System.out.println(feladat01(colors2));//0

        String [] colors3={"a","b","c"};

        System.out.println(feladat01(colors3));//0



    }
}
