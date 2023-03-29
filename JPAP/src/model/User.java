package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.annotation.processing.Generated;
import javax.persistence.*;



@Entity

@Table (name= "User1")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name= "id_user")
	
	private Long id_user ;
@Column(name= "id_user")

private String name;
@Column(name= "id_user")

private String surname;
@Column(name= "id_user")

private String email;


	
	
	
	
	
}
