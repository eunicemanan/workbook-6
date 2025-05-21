package com.pluralsight.program;

import com.pluralsight.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<Person>();
        al.add(new Person("Eunice", "Manan", 24));
        al.add(new Person("Joseph", "Smith", 34));
        al.add(new Person("John", "Doe", 42));
        al.add(new Person("Matthew", "James", 27));
        al.add(new Person("Christopher", "Breaux", 37)); // Removed extra space
        al.add(new Person("Giveon", "Evans", 30));
        al.add(new Person("Tyson", "Ngo", 22));


        String lastName = "Manan";
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {

            System.out.println(person);
        }




        Collections.sort(al);

        System.out.println("");

        for (Person str : al) {
            System.out.println(str.getFirstName() + " " + str.getLastName() + " " + str.getAge());
        }
    }
}
