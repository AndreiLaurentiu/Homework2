package com.strategy;

public class SeniorProgrammer implements Role{
    @Override
    public String description() {
        return SeniorProgrammer.class.getSimpleName();
    }

    @Override
    public String responsibilities() {

        return "Organizing the team and creating the architecture for projects.";
    }
}
