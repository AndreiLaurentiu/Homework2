package com.strategy;

public abstract class Programmer {
    private String name;
    private int salary;
    private Role role;
    private String progLang;

    public abstract void languageSuperpower();

    public Programmer(String name, int salary, Role role, String progLang) {
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.progLang = progLang;
    }

    public String getRole() {
        return role.description();
    }

    public String tasks() {
        return role.responsibilities();
    }

    public String getName() {
        return name;
    }

    public void promote(Role newRole){
        role = newRole;
    }

    public String grade() { return this.name + "is a " + role.description();}

    public void work() { System.out.println(name + " will " + role.responsibilities());

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", role=" + getRole() +
                ", progLang='" + progLang + '\'' +
                '}';
    }
}
