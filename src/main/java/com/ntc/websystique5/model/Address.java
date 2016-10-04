/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntc.websystique5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author data10
 */
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    private long address_id;
    @Column(name="street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;

    public Address() {
    }

    public Address( String street, String city, String country) {
        
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(long address_id) {
        this.address_id = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
