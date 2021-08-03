package com.javacodegeeks.testng.maven;

public class FindSecondLargestNo {
    public static void main(String[] args) {
        FindSecondLargestNo forloop = new FindSecondLargestNo();
        forloop.looping();
    }

    public void looping() {
        int a[] = {1889, 2, 3, 4, 5, 398789, 3, 3, 32, 32, 32, 23, 32, 32, 3232};
        int max = 0;
        int secondMax = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max ) {
                //finds which max is grt
                secondMax = max;
                max = a[i];
            }else if(a[i] > secondMax){
                secondMax = a[i];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);


    }
}
