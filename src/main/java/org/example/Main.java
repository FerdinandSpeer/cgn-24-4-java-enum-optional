package org.example;

import org.example.Challenge1.DaysOfWeek;
import org.example.Challenge1.Person;
import org.example.Challenge1.PersonRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.MONDAY.getValue());
        System.out.println(DaysOfWeek.TUESDAY.getValue());
        System.out.println(DaysOfWeek.WEDNESDAY.getValue());
        System.out.println(DaysOfWeek.THURSDAY.getValue());
        System.out.println(DaysOfWeek.FRIDAY.getValue());
        System.out.println(DaysOfWeek.SATURDAY.getValue());
        System.out.println(DaysOfWeek.SUNDAY.getValue());
        System.out.println("___________________");
//Step 6: In your main method, check if the person exists. If they do,
// print the name and favorite day of the week to the console.

        PersonRepository personRepository = new PersonRepository();

        personRepository.addPerson(new Person("123", "John Doe", DaysOfWeek.SATURDAY));
        personRepository.addPerson(new Person("456", "Johanna Glue", DaysOfWeek.FRIDAY));

        System.out.println(personRepository.getPerson("123"));
        System.out.println(personRepository.getPerson("455").orElse(new Person("000", "Person NOT FOUND", DaysOfWeek.MONDAY)));

    }

}