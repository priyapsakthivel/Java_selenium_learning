package com.javacodegeeks.testng.maven;

import org.testng.annotations.*;

public class TestNgMavenExample1 {


    @Test
    public void met1(){
        System.out.println("@test_1");
    }
    @BeforeClass
    public void met2(){
        System.out.println("@BeforeClass_1");
    }
    @AfterTest
    public void met3(){
        System.out.println("@AfterTest_1");
    }
    @AfterTest
    public void met6(){
        System.out.println("@AfterTest_2");
    }
    @Test(groups = "training1")
    public void met4(){
        System.out.println("@test_2");
    }
    @BeforeClass
    public void met5(){
        System.out.println("@BeforeClass_2");
    }
    @BeforeMethod
    public void met7(){
        System.out.println("@BeforeMethod_1");
    }
    @BeforeMethod
    public void met8(){
        System.out.println("@BeforeMethod_2");
    }
   @BeforeSuite
    public void met9(){
        System.out.println("@BeforeSuite_1");
    }
    @BeforeSuite
    public void met10(){
        System.out.println("@BeforeSuite_2");
    }
    @BeforeGroups
    public void met11(){
        System.out.println("@BeforeGroups_1");
    }
    @BeforeGroups
    public void met12(){
        System.out.println("@BeforeGroups_2");
    }
    @Test(groups = "trial1")
    public void met13(){
        System.out.println("@Test_3");
    }  @Test (groups = "training1")
    public void met14(){
        System.out.println("@Test_4");
    }  @Test(groups = "trial1")
    public void met15(){
        System.out.println("@Test_5");
    }
    @AfterGroups
    public void met16(){
        System.out.println("@AfterGroups_1");
    }@AfterGroups
    public void met17(){
        System.out.println("@AfterGroups_2");
    }
    @AfterSuite
    public void met18(){
        System.out.println("@AfterSuite_2");
    }
    @AfterSuite
    public void met19(){
        System.out.println("@AfterSuite_1");
    } @AfterMethod
    public void met20(){
        System.out.println("@AfterMethod_1");
    }
    @AfterMethod
    public void met21(){
        System.out.println("@AfterMethod_2");
    }
    @AfterTest
    public void met22(){
        System.out.println("@AfterTest_2");
    }  @AfterTest
    public void met23(){
        System.out.println("@AfterTest_1");
    }  @AfterClass
    public void met24(){
        System.out.println("@AfterClass_1");
    } @AfterClass
    public void met25(){
        System.out.println("@AfterClass_2");
    }


}
