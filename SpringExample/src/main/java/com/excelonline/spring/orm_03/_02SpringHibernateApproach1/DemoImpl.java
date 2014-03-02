package com.excelonline.spring.orm_03._02SpringHibernateApproach1;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class DemoImpl implements DemoInter{

	private SessionFactory factory = null;
	
	
	public void setFactory(SessionFactory factory) {
		System.out.println("Setter of spring class");
		this.factory = factory;
	}

	public Iterator getData() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("In spring class getData()");
		
		Session  ses = factory.openSession();
		
		Query query = ses.createQuery("from User");
		Iterator i1 = query.iterate();
		//ses.close();
		return i1;
	}

	
}
