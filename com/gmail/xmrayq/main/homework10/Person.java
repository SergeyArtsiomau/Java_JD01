package com.gmail.xmrayq.main.homework10;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(int age) {
        this.age = age;
        this.name = "Name" ;
        this.surname = "Surname";


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Age=" + age +
                '}';
    }
}
