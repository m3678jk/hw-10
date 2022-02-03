package taskOne.withStream;

import taskTwo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterOfList {
    private List<Person> people = new ArrayList<Person>();

    {
        people.add(new Person(1, "Jane", "Peterson"));
        people.add(new Person(2, "Jordan", "Pat"));
        people.add(new Person(3, "Luca", "Cat"));
        people.add(new Person(4, "Mate", "Gates"));
        people.add(new Person(5, "Steve", "Freeman"));
        people.add(new Person(6, "Javier", "Stone"));
        people.add(new Person(7, "John", "Black"));

    }

    public List<Person> getPeople() {
        return people;
    }

    public String filter(List<Person> list) {
       String result = list.stream()
               .filter(person -> person.getSequenceNumber() % 2 != 0)
               .map(object -> Objects.toString(object, null))
               .collect(Collectors.joining(", "));

        return result;
    }

}

class TesterOfFilter {
    public static void main(String[] args) {
        FilterOfList fil = new FilterOfList();
        System.out.println(fil.filter(fil.getPeople()));

    }
}