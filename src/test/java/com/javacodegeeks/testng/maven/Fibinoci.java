package com.javacodegeeks.testng.maven;

public class Fibinoci {
    public static void main(String[] args) {
        int pre =0;
        int next=1;

        for (int i = 0; i < 12; i++) {
           int sum= pre+next;
           pre=next;
           next=sum;
            System.out.println(sum);
        }

    }
}
