package com.curso.bookstore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable{

private static final long serialVersionUID = 1L;
	
private String nome;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String descricao;

@OneToMany(mappedBy = "categoria")
private List<Livro> livros = new ArrayList<>();

public Categoria() {
	super();
	// TODO Auto-generated constructor stub
}

public Categoria(String nome, Integer id, String descricao) {
	super();
	this.nome = nome;
	this.id = id;
	this.descricao = descricao;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public List<Livro> getLivros() {
	return livros;
}

public void setLivros(List<Livro> livros) {
	this.livros = livros;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Categoria other = (Categoria) obj;
	return Objects.equals(id, other.id);
}


}
