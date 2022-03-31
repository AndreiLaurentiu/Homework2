package com.strategy;

public class JavaProgrammer extends Programmer{
    public JavaProgrammer(String name, int salary, Role role, String progLang) {
        super(name, salary, role, progLang);
    }


    @Override
    public void languageSuperpower() {
        System.out.println("Writing entire apps super fast.");
    }
}
