package com.persistence.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.persistence.entity.Faculty;
import com.persistence.entity.PermanentFaculty;
import com.persistence.entity.VendorFaculty;

public class TablePerClassTest {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		PermanentFaculty pf = new PermanentFaculty();
		pf.setName("Ronald");
		pf.setSalary(50000);

		VendorFaculty vf = new VendorFaculty();
		vf.setName("Joseph");
		vf.setWages(5000);

		try {

			session.beginTransaction();
			session.persist(pf);
			session.persist(vf);
			session.getTransaction().commit();
			System.out.println("Data persisted successfully");

		} catch(HibernateException ex) {
			ex.printStackTrace();
		} finally {
			if(session!=null){
				session.close();
			}
		}
	}

}
