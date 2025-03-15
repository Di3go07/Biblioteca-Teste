package com.mycompany.app.model;
import java.util.List;
import java.util.ArrayList;

public class Usuario extends Pessoa{
	private int idade;
	
	public Usuario(String nome, List<Livro> livros, int idade) {
        	super(nome, livros); 
        	this.idade = idade;
	}
	
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public List<Livro> getEmprestimos(){
		return this.livros;
	}
	@Override
  public String toString() {
    return "Nome: " + nome + " / " + "Idade: " + idade + " anos";
  }
}
