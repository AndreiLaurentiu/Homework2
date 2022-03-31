package com.strategy;

public class LeadProgrammer implements Role{
    @Override
    public String description() {
        return LeadProgrammer.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Making big tech and administrative decisions";
    }
}
