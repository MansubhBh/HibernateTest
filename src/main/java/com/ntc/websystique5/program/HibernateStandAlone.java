/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntc.websystique5.program;

import com.ntc.websystique5.model.Address;
import com.ntc.websystique5.model.Student;
import com.ntc.websystique5.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author data10
 */
public class HibernateStandAlone {
    
    public static void main(String args[]){
        Student student = new Student("ram ", "sharan", "bct b");
        Address address = new Address("marchawar","nyc", "nepal");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.persist(student);
        System.out.println("persisting in database: student");
        
        address.setAddress_id(student.getId());
        student.setAddress(address);
        
        session.save(student);
        System.out.println("saved in database: student");
        List<Student> students = (List<Student>)session.createQuery("from Student ").list();
        for(Student s : students){
            System.out.println("Details " + s);
        }
        session.getTransaction().commit();
        session.close();
    }
    
    
    
}
