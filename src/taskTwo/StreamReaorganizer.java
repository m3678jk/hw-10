package taskTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReaorganizer <T>{
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

    public List<Person> filter(List<Person> list){
        List<Person> result = list.stream()
                .sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
                .collect(Collectors.toList());

        return result;
    }

    public void print(List<Person> list){
        for (Person l : list){
            System.out.println(l);
        }
    }
}


class TesterStream {
    public static void main(String[] args) {
        StreamReaorganizer sr = new StreamReaorganizer();

        //System.out.println(sr.getPeople());
        System.out.println("List before changes :" + "\n");
                sr.print(sr.getPeople());
        System.out.println("\n");
        System.out.println("List after changes : \n ");
                sr.print(sr.filter(sr.getPeople()));
        System.out.println("\n");


    }
}