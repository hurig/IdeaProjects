package hu.firstjason.services;

import hu.firstjason.domain.Pen;
import hu.firstjason.domain.Person;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private List<Pen> pens = new ArrayList<>();
    {
        pens.add(new Pen(451321, "blue", false));
        pens.add(new Pen(352895, "red", false));
        pens.add(new Pen(318960, "black", true));
    }

    private List<Person> people = new ArrayList<>();
    {
        people.add(new Person("John Smith", 20, pens.get(0)));
        people.add(new Person("June Washington", 21, pens.get(1)));
        people.add(new Person("Jack Sparrow", 42, pens.get(2)));
    }

    public List<Person> getPeople() {
        return people;
    }

    public List<Pen> getPens(){
        return pens;
    }
}
