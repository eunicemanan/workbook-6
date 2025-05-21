package com.pluralsight;

import com.pluralsight.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("LeBron", "James", 39));
        people.add(new Person("Stephen", "Curry", 36));
        people.add(new Person("Kevin", "Durant", 35));
        people.add(new Person("Giannis", "Antetokounmpo", 29));
        people.add(new Person("Joel", "Embiid", 30));
        people.add(new Person("Luka", "Doncic", 25));
        people.add(new Person("Jayson", "Tatum", 26));
        people.add(new Person("Nikola", "Jokic", 29));
        people.add(new Person("Anthony", "Davis", 31));
        people.add(new Person("Jimmy", "Butler", 34));
        people.add(new Person("Kawhi", "Leonard", 32));
        people.add(new Person("Devin", "Booker", 27));

        // Duplicate last names
        people.add(new Person("Jalen", "Williams", 23));
        people.add(new Person("Grant", "Williams", 25));
        people.add(new Person("Jaden", "Ivey", 22));
        people.add(new Person("Keyontae", "Johnson", 24));
        people.add(new Person("Keldon", "Johnson", 24));
        people.add(new Person("Draymond", "Green", 34));
        people.add(new Person("Josh", "Green", 23));
        people.add(new Person("Trey", "Murphy", 24));



        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        double averageAge = (double) totalAge/ people.size();
        System.out.println("\nAverage age: " + averageAge);

        List<Integer> ages = new ArrayList<>();
        for (Person person : people)
            ages.add(person.getAge());

        int oldestAge = Collections.max(ages);
        int youngestAge = Collections.min(ages);

        System.out.println(oldestAge);
        System.out.println(youngestAge);

        String lastName = "Green";
        List<Person> matchingPeople = new ArrayList<>();

        for (Person person : people) {
            if(person.getLastName().equals(lastName)){
                matchingPeople.add(person);
            }
        }

        for (Person person : matchingPeople) {
            System.out.println(person);
        }
    }
}
