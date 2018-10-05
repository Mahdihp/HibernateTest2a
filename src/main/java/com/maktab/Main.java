package com.maktab;

import com.maktab.model.Book;
import com.maktab.model.Group;
import com.maktab.model.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import sun.nio.cs.ext.GB18030;

import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        /**
         * Create Person & Group & Book
         */
//        Person person=new Person("ali Alavi");
//        session.save(person);
//
//        Group group =new Group("group1");
//        session.save(group);
//
//        Book book=new Book("Java EE 10",person);
//        session.save(book);

//        Group  g1  = session.get(Group.class,1L);
//        Person p1 = session.get(Person.class,1L);
//        g1.getMembers().add(p1);
//        session.save(g1);

        /**
         * Read  Person & Group & Book
         */
        List<Person> result1 = (List<Person>) session.createQuery("from " + Person.REF).list();
        for (Person p : result1)
            System.out.println(p);
//
//        List<Group> result2 = (List<Group>) session.createQuery("from " + Group.REF).list();
//        for (Group p : result2)
//            System.out.println(p);
//
//
//        List<Book> result3 = (List<Book>) session.createQuery("from " + Book.REF).list();
//        for (Book p : result3)
//            System.out.println(p);
        session.getTransaction().commit();

    }
}
