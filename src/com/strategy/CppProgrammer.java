package com.strategy;

public class CppProgrammer extends Programmer{
    public CppProgrammer(String name, int salary, Role role, String progLang) {
        super(name, salary, role, progLang);
    }

    @Override
    public void languageSuperpower() {
        System.out.println("Writing super fast code.");
    }

}
