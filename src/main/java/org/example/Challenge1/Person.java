package org.example.Challenge1;

//Step 3: Create a record 'Person' with the properties 'id', 'name', and
// 'favoriteDay', where 'favoriteDay' is of type DaysOfWeek.
public record Person(String id, String nam, DaysOfWeek favoriteDay) {
}
