package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        System.out.println("Car's engine is starting");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "Car's engine is starting";
    }

    public String accelerate() {
        System.out.println("the car is accelerating");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println("the car is braking");
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }
}
