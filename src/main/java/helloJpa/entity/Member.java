package helloJpa.entity;
import javax.persistence.Id;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Member implements Serializable{
	private static final Long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Date dateOfBirth;
	private Role role;
	private Contact contact;
	public Member() {
		
	}
	public Member(String name, Date dateOfBirth, Role role, Contact contact) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.contact = contact;
	}
	public enum Role{
		Admin , Teacher , Student
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	

}

