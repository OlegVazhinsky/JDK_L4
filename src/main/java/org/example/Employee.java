package org.example;

public class Employee {
    private int id;
    private String phoneNumber;
    private String name;
    private int expirience;

    public Employee(int id, String phone, String name, int expirience) {
        this.id = id;
        this.phoneNumber = phone;
        this.name = name;
        this.expirience = expirience;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExpirience() {
        return expirience;
    }

    @Override
    public String toString() {
        return "\n__________________________________________\n" +
                "Name : " + name + "\n" +
                "id : " + id + "\n" +
                "phone : " + phoneNumber + "\n" +
                "expirience : " + expirience + "\n";
    }
}
