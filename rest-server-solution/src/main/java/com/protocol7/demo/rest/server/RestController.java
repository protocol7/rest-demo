package com.protocol7.demo.rest.server;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class RestController {

    @Resource
    private ContactRepository contactRepository;
    
    @RequestMapping("/contacts/{id}")
    public @ResponseBody Contact show(@PathVariable("id") long id) throws IOException {
        return contactRepository.find(id);
    }

    @RequestMapping(value="/contacts/{id}", method=RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable long id, @RequestBody Contact contact) throws IOException {
        contact.setId(id);
        contactRepository.persist(contact);
    }

}
