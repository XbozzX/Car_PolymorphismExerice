package com.learnProgramming;

public class BMW extends  Car{

    public BMW(String carName, int engineHorsePower, String typeOfFuel) {
        super(carName, engineHorsePower, typeOfFuel);
    }

    @Override
    public String startEngine() {
        return "Vrommmbbbrrrr";
    }
}
