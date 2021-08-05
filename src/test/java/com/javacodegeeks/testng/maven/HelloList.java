package com.javacodegeeks.testng.maven;

import afu.plume.RegexUtil;
import bsh.StringUtil;
import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.*;
import java.util.regex.Pattern;

public class HelloList {


    public static void main(String[] args) {
        HelloList helloList = new HelloList();
        ClassA classA=new ClassA();
        List<Modelcreation> list = new ArrayList<Modelcreation>();
        Modelcreation modelcreation= new Modelcreation();
        modelcreation.setEcommerce("amazon");
        modelcreation.setIteam("fridge");
        modelcreation.setPersonName("balaji");
        list.add(modelcreation);

        Modelcreation modelcreation1= new Modelcreation();
        modelcreation1.setPersonName("mohan");
        modelcreation1.setIteam("tripod");
        modelcreation1.setEcommerce("Flipkart");
        list.add(modelcreation1);

        Modelcreation modelcreation2= new Modelcreation();
        modelcreation2.setPersonName("mohan");
        modelcreation2.setIteam("cam");
        modelcreation2.setEcommerce("ebay");
        list.add(modelcreation2);

        Modelcreation modelcreation3= new Modelcreation();
        list.add(modelcreation3);

        list.add(null);


        try {
            for(Modelcreation arrayloop:list){
                System.out.println(arrayloop.getEcommerce());
                System.out.println(arrayloop.getIteam());
                System.out.println(arrayloop.getPersonName() );

            }
        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("errrrrroooooooooorrrrrrrr");
        }
        catch (Exception e){
            System.out.println("tyiuoip");

        }
        finally {
            System.out.println("try some good code");
            helloList.name(modelcreation,classA);
        }


    }
    public  void name(Modelcreation modelcreation,ClassA classA ){
        StringUtils.isQuoted("");
        WebDriver webdriver= new EdgeDriver();
        Scanner scanner = new Scanner(System.in);

        Locale locale = new Locale("");
        scanner.useLocale(locale);


        Parents parents= new Parents();
        List<Parents> list= new ArrayList<>();
        HashMap<Integer,Parents> integerParentsHashMap= new HashMap<>();
        helloMom(parents,list,integerParentsHashMap);

    }


    public void helloMom(Parents a, List<Parents> b, HashMap<Integer,Parents> c){

    }





}

