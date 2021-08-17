package com.javacodegeeks.testng.maven;

public class ExampleForInheritanceChild  extends  ExampleForInheritance{
    public static void main(String[] args) {
        ExampleForInheritanceChild child=new ExampleForInheritanceChild();
        child.age();
        child.name();
    }
    public void age(){
        System.out.println("i am a child");
    }
}
