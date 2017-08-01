package pl.akademiakodu.hellospring.dao;

import pl.akademiakodu.hellospring.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macie on 31.07.2017.
 */
public class PersonDaoImpl implements PersonDao {

    static List<Person> people = new ArrayList<>();

    static {
        people.add(new Person(1L, "Adam", "Nowak"));
        people.add(new Person(2L, "Maccie", "Deaca"));
        people.add(new Person(3L, "Jan", "Wąs"));
        people.add(new Person(4L, "Michal", "Wąs"));
        people.add(new Person(5L, "Witek", "Alfa"));
    }

    @Override
    public List<Person> findByLastName(String lastName){
        //findbyallname + split zeby wyswietlac lastname
        List<Person> results = new ArrayList<>();


        for (Person person: people){

            if(person.getLastName().equals(lastName)){
                results.add(person);
            }

        }
        return results;
    }
    public List<Person> findAll(){
        return people;
    }
    
    public Person findOne(Long id){
        Person result = null;  //musibyc null bo zmienna obiektowa musi byc zadeklarowana(inaczej kompilator tego nie pusci)
        for (Person person: people){
            if( person.getId().longValue() == id.longValue()){
                result = person;
            }
        }
        return result;
    }
}
