package com.company.OOPS.Interfaces;

public class Car implements Brake,Engine{
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void Start() {
        System.out.println("I have a key less start");
    }

    @Override
    public void Stop() {

    }

    @Override
    public void acc() {

    }
}
