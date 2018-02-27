package com.arianit.restapp.service;

import com.arianit.restapp.domain.Person;
import com.arianit.restapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Finding and returning all person data using personRepository method
    public Iterable<Person> list() {
        return personRepository.findAll();
    }

    // Finding Person by given id using personRepository
    public Person readById(long id) {
        return personRepository.findOne(id);
    }

    // Finding and returning people ordered by name by ascending
    public List<Person> findAllOrderedByNameAsc() {
        return personRepository.findAllByOrderByNameAsc();
    }

    // Getting a list of persons and saving to H2 database using personRepository method
    public void save(List<Person> people) {
        personRepository.save(people);
    }

}