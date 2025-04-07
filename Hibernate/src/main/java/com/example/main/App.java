package com.example.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.example.model.Employee;
import com.example.util.HibernateUtil;
import com.learning.Hibernate.Employee;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Insert Employee Record
        Employee emp1 = new Employee("John Doe", 50000);
        Employee emp2 = new Employee("Jane Doe", 60000);
        
        session.save(emp1);
        session.save(emp2);

        transaction.commit();
        session.close();

        System.out.println("Employees saved successfully!");
        HibernateUtil.shutdown();
    }
}
