package com.demo.runtimepolymorphism;

public class Splender extends Bike {

    void run() {
        System.out.println("Running safely with 60kmpl");
    }

    public static void main(String[] args) {
        Bike b = new Splender();
        b.run();
    }
}
