package com.favcode.oeuniondentalcare.service;


import com.favcode.oeuniondentalcare.model.Contact;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Slf4j
@Service
@ApplicationScope
@Data
public class ContactService {

    private int counter = 0;

    public ContactService() {
        System.out.println("Contact Service Bean initialized");;
    }

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
