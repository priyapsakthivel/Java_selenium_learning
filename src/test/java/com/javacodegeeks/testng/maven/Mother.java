package com.javacodegeeks.testng.maven;

public class Mother {


    public static void main(String[] args) {

        //Parent power
        Mother parent = new Mother();
        parent.helloWorld();

        //Parent and Child power
        Mother parentChild = new Child();
        parentChild.helloWorld();
        //Casting
        ((Child) parentChild).helloWorld1();

        //child power
        Child child1 = new Child();
        child1.helloWorld();
        child1.helloWorld1();

    }

    public void helloWorld() {

    }


}
