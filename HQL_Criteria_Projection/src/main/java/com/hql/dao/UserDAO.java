package com.hql.dao;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.criteria.internal.compile.CriteriaInterpretation;

import com.hql.config.Config;
import com.hql.dto.User;

public class UserDAO {

	Config config = new Config();
	SessionFactory factory = config.getSessionFactory();
	Session session = null;

	public void insertUser(User user) {
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		System.out.println("Data updated...");
		session.close();
	}

	public int updateUser(String name, int id) {

		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update User set name =:name where id = :id");

		query.setParameter("name", name);
		query.setParameter("id", id);

		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("success");
		session.close();
		return result;

	}

	public List<User> showUserDetails() {

		session = factory.openSession();

		Query query = session.createQuery("from User");

		List<User> list = query.getResultList();
		return list;
	}

	public int deleteUser(int id) {

		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete from User where id = :id");
		query.setParameter("id", id);
		int result = query.executeUpdate();
		return result;

	}

	public List criteriaMethod() {
		session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		Criterion name = Restrictions.eq("name", "shawn");
		criteria.add(name);
		List criteriaList = criteria.list();
		return criteriaList;

	}

	public List<User> projectionMethod() {
		session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		Projection name = Projections.property("name");
		criteria.setProjection(name);
		List<User> list = criteria.list();
		return list;
	}

}
