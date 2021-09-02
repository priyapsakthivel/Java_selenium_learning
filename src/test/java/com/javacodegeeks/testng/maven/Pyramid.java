package com.javacodegeeks.testng.maven;

public class Pyramid {

    public static void main(String[] args) {
        for (int i = 5; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        Pyramid pyramid = new Pyramid();
        pyramid.model(pyramid);
    }

    public String car() {
        System.out.println("audi");
        return "audi";
    }

    public String colour() {
        System.out.println("black");
        return "";
    }

    public Object model(Object pyramid) {
        System.out.println("q8");
        return pyramid;
    }
}

//experimenting
//no im giving a clue
//just imagine pyramid's first character is
// " " " " " " * " " " " " "
//" " " " " " * * " " " " " "
//" " " " " * * * * " " " " "
//can i google?

//think like this and do da
//yep sure
//dont google like that your a tech girl now
//nee pyramid podadha adha paathale enake bayama iruku
// :(
//sorry
//no problem
//      :)
//wat shld i do now?

// write a program to find occurances of word in a string , eg : sajhsjaksfafsas find how many a is presentok