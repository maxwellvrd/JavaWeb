package model.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;
	private String email;
	private String telefone;
	private LocalDate dtNascimento;

	public Aluno() {

	}

	@Override
	public String toString() {
		return "Aluno \nID: " + id
				+ "\nNome: " + nome
				+ "\nEmail: " + email
				+ "\nTelefone: " + telefone
				+ "\nData Nascimento: " + dtNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (email == null) {
			return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}