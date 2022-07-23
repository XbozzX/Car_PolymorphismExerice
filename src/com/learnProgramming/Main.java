package com.learnProgramming;

public class Main {

    public static void main(String[] args) {
        //Create the object
         Myvi myvi = new Myvi("myviV2",200,"Petrol");
         System.out.println(myvi.startEngine());
         System.out.println(myvi.accelerate(5));
         myvi.brake();

         BMW bmw = new BMW("BMW 6 series", 800,"Petrol");
         System.out.println(bmw.startEngine());
         System.out.println(bmw.accelerate(5));
         bmw.brake();

         Tesla tesla = new Tesla("Tesla X", 600,"Electric");
         System.out.println(tesla.startEngine());
         System.out.println(tesla.accelerate(5));
         tesla.brake();
    }
}

