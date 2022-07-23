package com.learnProgramming;

public class Car {
    private String carName;
    private int engineHorsePower;
    private String typeOfFuel;


    public Car(String carName, int engineHorsePower, String typeOfFuel) {
        this.carName = carName;
        this.engineHorsePower = engineHorsePower;
        this.typeOfFuel = typeOfFuel;
    }

    public String getCarName(){
        return this.carName;
    }


    public String startEngine(){
        return "shhhhh";
    }
    public int accelerate(int rpmNumber){
        int totalSpeed = (int) (rpmNumber * this.engineHorsePower / 60);
        return totalSpeed;
    }
    public void brake(){
        System.out.println("BRAKE ON");
    }
}
