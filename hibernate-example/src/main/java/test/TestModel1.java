package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.duolingo.models.model1;
import ams2.duolingo.utils.HibernateUtil;

public class TestModel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model1 m1 = new model1();
		m1.setName("Edipo");
		m1.setLast_name("Rey");
		model1 m2 = new model1();
		m2.setName("Luis");
		m2.setLast_name("Gongora");

		Transaction t = null;
		try(Session session = 
				HibernateUtil.getSessionFactory().openSession()){            
			t = session.beginTransaction();
			session.save(m1);
			session.save(m2);
			t.commit();
		}catch(Exception e) {

		}

	}

}
