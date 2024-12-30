package com.yildiz;

import com.yildiz.entity_models.Address;
import com.yildiz.entity_models.Customer;
import com.yildiz.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.Date;

public class AppMain {
    public static void main(String[] args) {
        Customer customer2 = new Customer();
        customer2.setFirstName("Ahmet");
        customer2.setLastName("sanane");
        customer2.setCreateDate(new Date());


        Customer customer = new Customer();
        customer.setFirstName("sena");
        customer.setLastName("yıldız");
        customer.setCreateDate(new Date());

        Address address1 = new Address();
        address1.setCountry("tr");
        address1.setCity("antalya");
        address1.setState("Kolkata");
        address1.setStreet("kepez");
        address1.setZip("070707");

        Address address2 = new Address();
        address2.setCountry("tr");
        address2.setCity("istanbul");
        address2.setState("Kolkata");
        address2.setStreet("ümraniye");
        address2.setZip("343434");

        Address address3 = new Address();
        address3.setCountry("tr");
        address3.setCity("elazıg");
        address3.setState("Kolkata");
        address3.setStreet("sürsürü");
        address3.setZip("232323");

        customer.getAddresses().add(address1);
        customer.getAddresses().add(address2);
        customer.getAddresses().add(address3);


        customer2.getAddresses().add(address1);
        customer2.getAddresses().add(address2);



        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(customer2);
            session.save(customer);

            tx.commit();
        }catch (HibernateError e) {
            System.out.println("HibernateError" + e.getMessage());
        }finally {
            session.close();
        }


    }
}