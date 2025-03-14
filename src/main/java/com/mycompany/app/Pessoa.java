package com.mycompany.app;

import java.util.List;
import java.util.ArrayList;

public class Pessoa {
	protected String nome;
	protected List<Livro> livros;
	
	public Pessoa(String nome, List<Livro> livros) {
		this.nome = nome;
		this.livros = new ArrayList<>();;
    }

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public List<Livro> getLivros(){
		return this.livros;
	}
  public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
}
