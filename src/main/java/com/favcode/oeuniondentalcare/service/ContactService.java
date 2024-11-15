package com.favcode.oeuniondentalcare.service;


import com.favcode.oeuniondentalcare.constant.OeuniondentalConstant;
import com.favcode.oeuniondentalcare.model.Contact;
import com.favcode.oeuniondentalcare.repository.ContactRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactService() {
        System.out.println("Contact Service Bean initialized");;
    }

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = false;
        contact.setStatus(OeuniondentalConstant.OPEN);
        contact.setCreatedBy(OeuniondentalConstant.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int result = contactRepository.saveContactMsg(contact);
        if (result>0) {
            isSaved = true;
        }

        return isSaved;
    }

    public List<Contact> findMsgsWithOpenStatus() {
        List<Contact> contactMsgs =contactRepository.findMsgsWithStatus(OeuniondentalConstant.OPEN);
        return contactMsgs;
    }

    public boolean updateMsgStatus(int contactId, String updatedBy) {
        boolean isUpdated = false;
        int result = contactRepository.updateMsgStatus(contactId, OeuniondentalConstant.CLOSE, updatedBy);
        if (result > 0){
            isUpdated = true;
        }

        return isUpdated;
    }
}
