//package org.java.springsecurity.models;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.java.springsecurity.enums.Role;
//
//@Entity
//@Table(name = "users_tablerole")
//public class UserRole {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	@Column(name = "role", nullable = false, columnDefinition = "enum('ROLE_ADMIN','ROLE_USER')default 'ROLE_USER'")
//	@Enumerated(EnumType.STRING)
//	private Role role = Role.ROLE_USER;
//	@OneToOne
//	@JoinColumn(name = "user_id")
//	private Users users;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public Role getRole() {
//		return role;
//	}
//	public void setRole(Role role) {
//		this.role = role;
//	}
//	public Users getUsers() {
//		return users;
//	}
//	public void setUsers(Users users) {
//		this.users = users;
//	}
//	
//	
//}
