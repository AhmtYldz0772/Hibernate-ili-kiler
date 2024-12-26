package com.yildiz;

import com.yildiz.entity_models.Customer;
import com.yildiz.entity_models.CustomerDetail;
import com.yildiz.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {
        Customer customer2 = new Customer();
        customer2.setFirstName("Ahmet");
        customer2.setLastName("sanane");
        customer2.setCreateDate(new Date());
        CustomerDetail customerDetail2 = new CustomerDetail();
        customerDetail2.setAddres("istanbul");
        customerDetail2.setEmail("sanane@gmail.com");
        customerDetail2.setPhone("11111111111111");
        customerDetail2.setCreateDate(new Date());
        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);



        Customer customer = new Customer();
        customer.setFirstName("sena");
        customer.setLastName("yıldız");
        customer.setCreateDate(new Date());

        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setAddres("istanbul");
        customerDetail.setEmail("sanane@gmail.com");
        customerDetail.setPhone("11111111111111");
        customerDetail.setCreateDate(new Date());
        customerDetail.setCustomer(customer);
        customer.setCustomerDetail(customerDetail);




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