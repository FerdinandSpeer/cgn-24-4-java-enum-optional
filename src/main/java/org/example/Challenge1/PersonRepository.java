package org.example.Challenge1;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//Step 4: Create a class PersonRepository with a list/map of persons.

public class PersonRepository {
    Map<String, Person> persons = new HashMap<>();

    public void addPerson(Person newPerson) {
        persons.put(newPerson.id(), newPerson);
    }
//Step 5: Write a method in the class PersonRepository that searches for and returns a person
// based on their id from the list/map. The method should return an Optional.

    public Optional<Person> getPerson(String id) {
        for(Person p:persons.values()) {
            if(p.id().equals(id)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
