package com.learnProgramming;

public class Main {

    public static void main(String[] args) {
        //Create the object
	    Car car = new Car(4,true);

        Myvi myvi = new Myvi(6,true);
        myvi.startEngine();

        ProtonSaga protonSaga = new ProtonSaga(8, false);
        protonSaga.startEngine();

        BMW6Series bmw6Series = new BMW6Series(12,true);
        bmw6Series.startEngine();
    }
}

class  Car{
    //declare the field
    private String CarName;
    private boolean EngineState;
    private int NumberOfCylinders;
    private int NumberOfWheel;
    private double CurrentSpeed;

    //create the constructor for init the field
    public Car(int numberOfCylinders,boolean engineState){
        this.EngineState = engineState;
        this.NumberOfCylinders = numberOfCylinders;
        this.NumberOfWheel = 4;
        this.CurrentSpeed = 0.00;
    }

    //create the getter
    public String getCarName(){
        return this.CarName;
    }

    public double getCurrentSpeed(){
        return this.CurrentSpeed;
    }

    //create the method that indicate the behavior of the Car
    public void startEngine(){
        if (this.EngineState){
            System.out.println("Engine Start");
        } else {
            System.out.println("Engine not turning on");
        }
    }

    public double accelerate(double speed){
        int cylinder = NumberOfCylinders;
        double totalSpeed = cylinder * speed;
        this.CurrentSpeed = totalSpeed;
        return totalSpeed;
    }

    public void brake() {
        System.out.println("BRAKE!!");
    }
}

//Create a subclass to demonstrate polymorphism
class Myvi extends Car{

    public Myvi(int numberOfCylinders, boolean engineState) {
        super(numberOfCylinders, engineState);
    }

    @Override
    public void startEngine() {
        System.out.println("Myvi fly");
        super.startEngine();
    }
}

class ProtonSaga extends Car{

    public ProtonSaga(int numberOfCylinders, boolean engineState) {
        super(numberOfCylinders, engineState);
    }

    @Override
    public void startEngine() {
        System.out.println("ProtonSga starting");
        super.startEngine();
    }
}

class BMW6Series extends Car{

    public BMW6Series(int numberOfCylinders, boolean engineState) {
        super(numberOfCylinders, engineState);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW booting up the system");
        super.startEngine();
    }
}