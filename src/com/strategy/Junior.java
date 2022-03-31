package com.strategy;

public class Junior implements Role{
    @Override
    public String description() {
        return Junior.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Writing a little better code and fixing bugs.";
    }
}
