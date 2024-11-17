package com.favcode.oeuniondentalcare.service;

import com.favcode.oeuniondentalcare.model.Person;
import com.favcode.oeuniondentalcare.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public boolean createNewPerson(Person person){
        boolean isSavaed = false;
        person = personRepository.save(person);
        if (null != person)
            isSavaed = true;

        return isSavaed;
    }

}
