package pl.akademiakodu.hellospring.dao;

import pl.akademiakodu.hellospring.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macie on 31.07.2017.
 */
public interface PersonDao {
    List<Person> findByLastName(String lastName);
    List<Person> findAll();

    //wyszukaj jednego po id:
    Person findOne(Long id);

}
