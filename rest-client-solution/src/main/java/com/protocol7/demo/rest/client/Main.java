package com.protocol7.demo.rest.client;

import java.io.IOException;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

public class Main {

    public static void main(String[] args) throws ResourceException, IOException {
        ClientResource cr = new ClientResource("http://localhost:8080/contacts/123");
        Contact contact = new Contact("Niklas", "Gustavsson");
        cr.put(contact);
        cr.release();
        
        Contact contact2 = cr.get(Contact.class);

        System.out.println(contact2.getFirstName());
        cr.release();
    }
}
