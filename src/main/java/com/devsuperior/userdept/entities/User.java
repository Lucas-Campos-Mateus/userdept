package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // dizendo que é uma entidade
@Table(name = "tb_user") // colocando o nome da tabela de entidade
public class User {

	@Id // dizendo que é o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Gerando o ID automáticamente
	private Long id;
	private String name;
	private String email;

	@ManyToOne // dizendo que são muitos para um (Muitos users para um departamento)
	@JoinColumn(name = "department_id")
	private Department department;

	public User() {
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
