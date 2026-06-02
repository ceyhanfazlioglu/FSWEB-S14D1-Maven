package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() * 1.25);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = developer;
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (midDevelopers[index] == null) {
            midDevelopers[index] = developer;
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = developer;
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }
}