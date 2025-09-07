package com.trabalho.gerenciador_tarefas.model;

import java.util.Objects;

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
	private String nomeResponsavel;
	
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
	
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	
	public void setNomeResponsavel(String novoNomeResponsavel) {
		this.nomeResponsavel = novoNomeResponsavel;
	}
}
