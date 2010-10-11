package com.protocol7.demo.rest.server;

import java.io.IOException;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class FooBarMessageConverter extends AbstractHttpMessageConverter<Contact> {

    public FooBarMessageConverter() {
        super(new MediaType("text", "x-p7-foobar"));
    }

    @Override
    protected Contact readInternal(Class<? extends Contact> clazz, HttpInputMessage inputMessage) throws IOException,
            HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return clazz.equals(Contact.class);
    }

    @Override
    protected void writeInternal(Contact t, HttpOutputMessage outputMessage) throws IOException,
            HttpMessageNotWritableException {
        outputMessage.getBody().write(t.getFirstName().getBytes());
    }

}
