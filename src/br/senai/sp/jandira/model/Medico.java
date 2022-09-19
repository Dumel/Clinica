package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {  
	
	private String nome;
	private LocalDate dataDeNascimento;
	private Genero genero;
	private Especialidade[] especialidade;
	private String crm;
	private String Medico;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Genero getGenero() {
		return genero;
	}
	public Especialidade[] getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getMedico() {
		return Medico;
	}
	public void setMedico(String medico) {
		Medico = medico;
	}

}
