package com.maktab;

import com.maktab.model.Course;
import com.maktab.model.CourseGroup;
import com.maktab.model.Student;
import org.hibernate.Session;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        /**
         * Create Student & CourseGroup & Course
         */
//        Student student=new Student("1","ali Alavi");
//        session.save(student);
//
//        Course book=new Course("1","Java EE 10");
//        session.save(book);
//
//        CourseGroup group =new CourseGroup(1,5,book);
//        session.save(group);
//
//
//        CourseGroup  g1  = session.get(CourseGroup.class,1L);
//        Student p1 = session.get(Student.class,1L);
//        g1.getStudents().add(p1);
//        session.update(g1);

        /**
         * Read  Student & CourseGroup & Course
         */
//        List<Student> result1 = (List<Student>) session.createQuery("from " + Student.REF).list();
//        for (Student p : result1)
//            System.out.println(p);
//
//        List<CourseGroup> result2 = (List<CourseGroup>) session.createQuery("from " + CourseGroup.REF).list();
//        for (CourseGroup p : result2)
//            System.out.println(p);
//
//
//        List<Course> result3 = (List<Course>) session.createQuery("from " + Course.REF).list();
//        for (Course p : result3)
//            System.out.println(p);
        session.getTransaction().commit();


        session.close();
        HibernateUtil.shutdown();

    }
}
