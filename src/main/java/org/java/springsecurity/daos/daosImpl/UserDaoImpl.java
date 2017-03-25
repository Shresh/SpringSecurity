//package org.java.springsecurity.daos.daosImpl;
//
//import javax.annotation.Resource;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.java.springsecurity.daos.UserDao;
//import org.java.springsecurity.models.Users;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//@Repository
//public class UserDaoImpl implements UserDao{
//	
//	@Resource
//	private SessionFactory sessionFactory; 
//
//	@Override
//	@Transactional
//	public Long insert(Users users) {
//		Session session = sessionFactory.getCurrentSession();
//		Long id = (Long) session.save(users);
//		return id;
//	}
//
//}
