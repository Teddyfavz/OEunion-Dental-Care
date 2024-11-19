package com.favcode.oeuniondentalcare.service;

import com.favcode.oeuniondentalcare.constant.OeuniondentalConstant;
import com.favcode.oeuniondentalcare.model.Person;
import com.favcode.oeuniondentalcare.model.Roles;
import com.favcode.oeuniondentalcare.repository.PersonRepository;
import com.favcode.oeuniondentalcare.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person){
        boolean isSavaed = false;
        Roles role = rolesRepository.getByRoleName(OeuniondentalConstant.PATIENT_ROLE);
        person.setRoles(role);
        person.setPwd(passwordEncoder.encode(person.getPwd()));
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
            isSavaed = true;

        return isSavaed;
    }

}
