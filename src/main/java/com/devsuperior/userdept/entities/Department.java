package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // dizendo que é uma entidade
@Table(name = "tb_department") // dando nome para a tabela
public class Department {

	@Id //dizendo que é ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Gerando ID automaticámente
	private Long id;
	private String name;

	public Department() {
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

}
