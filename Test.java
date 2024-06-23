//package com.student.test;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import com.onetomany.demo.Student;
//import com.onetomany.demo.Teacher;
//
//
//
//public class Test {
//
//	public static void main(String[] args) {
//		
//
//		EntityManagerFactory emEntityManagerFactory = Persistence.createEntityManagerFactory("S");
//		EntityManager emEntityManager = emEntityManagerFactory.createEntityManager();
//		
//		emEntityManager.getTransaction().begin();
//		Student s1 = new Student();
//		
//		s1.setStud_name("mansi");
//		s1.setStud_city("pune");
//		
//		Student s2 = new Student();
//		
//		
//		s2.setStud_name("neha");
//		s2.setStud_city("mumbai");
//		
//		Student s3 = new Student();
//		
//		s3.setStud_name("riya");
//		s3.setStud_city("kolkata");
//		
//		emEntityManager.persist(s1);
//		emEntityManager.persist(s2);
//		emEntityManager.persist(s3);
//		
//		List<Student> l1 = new ArrayList<Student>();
//		l1.add(s1);
//		l1.add(s2);
//		l1.add(s3);
//		
//		Teacher t1 = new Teacher();
//		t1.setTeacher_id(7899);
//		t1.setTeacher_name("mrs.asmita mam");
//		t1.setTeacher_salary(25000);
//		t1.setTeacher_city("pune");
//		t1.setStudent(l1);
//		
//		emEntityManager.merge(t1);
//		emEntityManager.getTransaction().commit();
//		
//		emEntityManager.close();
//		
//		
//		}
//
//}
