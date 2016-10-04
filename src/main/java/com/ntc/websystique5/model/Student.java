/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntc.websystique5.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author data10
 */
@Entity
@Table(name= "student")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "student_id")
   private long id;
   @Column(name="first_name")
   private String first_name;
   @Column(name="last_name")
   private String last_name;
   @Column(name="section")
   private String section;
   @OneToOne(cascade = CascadeType.ALL)
   @PrimaryKeyJoinColumn
   private Address address;

    public Student() {
    }

    public Student( String first_name, String last_name, String section) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.section = section;
     
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
   
     @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + first_name + ", lastName="
                + last_name + ", section=" + section + ", address=" + address
                + "]";
    }
   
   
    
}
