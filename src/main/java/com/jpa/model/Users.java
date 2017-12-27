package com.jpa.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



//@Table(appliesTo = "")
@Entity
//@Table(name="users")
public class Users {

	 	
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	//@Column(name = "id")
	    @Id
	    private Integer  id;
	    
	 	@Column(name = "name")
	    private String name;
	   
	    @Column(name = "password")
	    private String password;
	    
	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "status")
	    private int status;
	    
	   /* protected Users() {
	    }

	    public Users(String name, String password, String email, int status) {
	        this.name = name;
	        this.password = password;
	        this.email = email;
	        this.status = status;
	    }*/

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}
	    
	    
}
