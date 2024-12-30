package com.yildiz;

import com.yildiz.entity_models.Customer;
import com.yildiz.entity_models.CustomerDetail;
import com.yildiz.entity_models.Order;
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

        Order order1 = new Order();
        order1.setProduct("elma");
        order1.setCode("111");
        order1.setAmount(BigDecimal.valueOf(55.25));
        order1.setCreateDate(new Date());


        Order order2 = new Order();
        order2.setProduct("üzüm");
        order2.setCode("222");
        order2.setAmount(BigDecimal.valueOf(55.25));
        order2.setCreateDate(new Date());


        Order order3 = new Order();
        order3.setProduct("portakal");
        order3.setCode("333");
        order3.setAmount(BigDecimal.valueOf(55.25));
        order3.setCreateDate(new Date());

        // bir birlerini bilsinler kim kimden nesne oluştrumuş kime bağanacak ilişki kuracak bilsin
        order1.setCustomer(customer);
        customer.getOrders().add(order1);

        order2.setCustomer(customer);
        customer.getOrders().add(order2);

        order3.setCustomer(customer2);
        customer2.getOrders().add(order3);


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(customer2);
            session.save(customer);
            session.save(order1);
            session.save(order2);
            session.save(order3);
            tx.commit();
        }catch (HibernateError e) {
            System.out.println("HibernateError" + e.getMessage());
        }finally {
            session.close();
        }


    }
}