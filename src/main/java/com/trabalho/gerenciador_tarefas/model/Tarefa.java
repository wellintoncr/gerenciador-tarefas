package com.trabalho.gerenciador_tarefas.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Tarefa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String responsavel;

	@Column(name="dataEntrega", columnDefinition="DATE")
	private LocalDate dataEntrega;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long novoId) {
		this.id = novoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String novoResponsavel) {
		this.responsavel = novoResponsavel;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate novaDataEntrega) {
		this.dataEntrega = novaDataEntrega;
	}
}
