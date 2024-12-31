package com.yildiz;

import com.yildiz.entity.Employee;
import com.yildiz.entity.Owner;
import com.yildiz.entity.Person;
import com.yildiz.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Person person1 = new Person("emine","yıldız");
        //person1.setPersonId(1L);
        person1.setAddress("adana");
        Employee employee1 = new Employee("gülsüm","yıldız",
                "antalya", "1111",
                "gül@gmail.com", 100000, new Date(), "50L");
        employee1.setEmployeeId(1L);
        Owner owner = new Owner("yıldız", "ahmet", "istanbul","projectManager");
        owner.setOwnerId(1L);


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.persist(person1);
            session.flush();// buraya kadar yapılmış işlemleri kaydetmek içn kullanılır
            session.persist(employee1);
            session.flush();
            session.persist(owner);
            session.flush();
            tx.commit();
        }catch (HibernateError e) {
            System.out.println("HibernateError" + e.getMessage());
        }finally {
            session.close();
        }


    }
}