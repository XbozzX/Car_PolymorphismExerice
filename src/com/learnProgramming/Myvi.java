package com.learnProgramming;

public class Myvi extends Car {

    public Myvi(String carName, int engineHorsePower, String typeOfFuel) {
        super(carName, engineHorsePower, typeOfFuel);
    }

    @Override
    public String startEngine() {
        return "vromm";
    }

}
