package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="users")
@NamedQueries({
    @NamedQuery(
        name = "findUserById",
        query = "from User a where a.userId = :id"
        //query = "from User a where a.id = 1"
        ),
})
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userId")
	private int userId;
	
	@Column
	private String name;
	
	@Column
	private String emailId;
	
	@Column
	private int phone;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
