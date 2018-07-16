package com.gmail.xmrayq.main.homework19.task2;


public final class Person {
    private final String name;
    private final String surname;
    private final int year;


    public int getYear() {
        return year;
    }

    private Person(PersonBuilder1 personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.year = personBuilder.getYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                '}';
    }

    public static final class PersonBuilder1 {

        private String name;
        private String surname;
        private int year;

        public PersonBuilder1 withName(final String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder1 withSurname(final String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder1 withYear(final int year) {
            this.year = year;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public int getYear() {
            return year;
        }

        public Person build() {

            return new Person(this);
        }
    }


}

