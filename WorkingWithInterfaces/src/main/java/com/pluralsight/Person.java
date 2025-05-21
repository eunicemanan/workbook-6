package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare this person's last name with the other person's last name
        int last = this.lastName.compareTo(other.lastName);

        // If last names are the same, compare by first name instead
        // Otherwise, return the result of the last name comparison
        return last == 0 ? this.firstName.compareTo(other.firstName) : last;
    }

    public String getFirstName() {
        return firstName; }

    public String getLastName() {
        return lastName; }

    public int getAge() {
        return age; }
}
