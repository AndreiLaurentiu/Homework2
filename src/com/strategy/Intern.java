package com.strategy;

public class Intern implements Role{
    @Override
    public String description() {
        return Intern.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Writing basic code and discovering the tech world.";
    }
}
