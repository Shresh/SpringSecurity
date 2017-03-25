//package org.java.springsecurity;
//
//import org.java.springsecurity.daos.UserDao;
//import org.java.springsecurity.models.Users;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class SignupController {
//	
//	@Autowired
//	private UserDao userDao;
//	
//	@RequestMapping(value = "/signup", method = RequestMethod.GET)
//	public String signUp(){
//		return "signUp";
//	}
//	@RequestMapping(value = "/signup",method = RequestMethod.POST)
//	public String signups(@ModelAttribute Users users,Model model){
//		System.out.println(users.getPassword());
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
//		users.setPassword(encoder.encode(users.getPassword()));
//		
//		userDao.insert(users);
//		return "signUp";
//	}
//}
