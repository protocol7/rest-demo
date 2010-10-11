package com.protocol7.demo.rest.server;

import se.vgregion.core.domain.patterns.entity.Entity;


public class Contact implements Entity<Contact, Long> {

    private long id;

    private int age;

    private String firstName;

    private Address homeAddress;

    private String lastName;

    public Contact() {
    }

    public Contact(long id, String firstName, String lastName, Address homeAddress, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean sameAs(Contact other) {
        // TODO Auto-generated method stub
        return false;
    }

}
