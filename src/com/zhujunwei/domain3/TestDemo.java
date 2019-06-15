package com.zhujunwei.domain3;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.zhujunwei.utils.HibernateUtils;

public class TestDemo {

	@Test
	public void test01() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		S s1 = new S();
		s1.setS_name("朱俊伟");
		S s2 = new S();
		s1.setS_name("朱俊伟2");
		
		C c1 = new C();
		c1.setC_name("Java开发");
		
		s1.getCc().add(c1);
		s2.getCc().add(c1);
		c1.getSs().add(s1);
		c1.getSs().add(s2);
		
		session.save(s1);
		session.save(s2);
		session.save(c1);
		
		transaction.commit();
	}
}
