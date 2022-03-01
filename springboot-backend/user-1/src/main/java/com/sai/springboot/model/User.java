package com.sai.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long id;
	@Column(name="firstname")
	    private String firstname;
	@Column(name="lastname")
	    private String lastname;
	@Column(name="dob")
	    private String dob;
	@Column(name="gender")
	    private String gender;
	@Column(name="address")
	    private String address;
	public User() {
	
	}
	    
	       public User(String firstname, String lastname, String dob, String gender, String address) {
	    	  super();
	          this.firstname = firstname;
	          this.lastname = lastname;
	          this.dob=dob;
	          this.gender=gender;
	          this.address=address;
	       }
	       public long getId() {
	           return id;
	       }
	       public void setId(long id) {
	           this.id = id;
	       }
	       public String getfirstname() {
	           return firstname;
	       }
	       public void setfirstname(String firstname) {
	           this.firstname = firstname;
	       }
	       public String getlastname() {
	           return lastname;
	       }
	       public void setlastname(String lastname) {
	           this.lastname = lastname;
	       }
	       public String getdob() {
	   		return dob;
	   	}
	   	public void setdob(String dob)
	   	{
	   		this.dob=dob;
	   	}
	   	public String getgender() {
	   		return gender;
	   	}
	   	public void setgender(String gender) {
	   		this.gender=gender;
	   	}
	   	public String getaddress() {
	   		return address;
	   	}
	   	public void setaddress(String address)
	   	{
	   		this.address=address;
	   	}
}
	          
	
