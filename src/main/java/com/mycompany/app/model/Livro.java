package com.mycompany.app.model;

public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private boolean disponivel;

 public Livro(String titulo, String genero, boolean disponivel) {
        	this.titulo = titulo;
        	this.genero = genero;
		      this.disponivel = disponivel;
  }

	public String getTitulo(){
		return this.titulo;
	}
	public Autor getAutor(){
		return this.autor;
	}
	public void setAutor(Autor autor) {
        this.autor = autor;
  }
  public String getGenero(){
    return this.genero;
  }
  public String isDisponivel(){
    if (this.disponivel) {
      return "Disponível para empréstimo";
	  }else{
	    return "Emprestado";
	  }
	}
	public void alterarDisponivel(){
		this.disponivel = !this.disponivel;
	}
	public void exibirDetalhes(){
	  System.out.println("Livro: " + this.getTitulo());
    	  System.out.println("Autor: " + this.getAutor().getNome() + " - " + this.getAutor().getCargo());
    	  System.out.println("Genero: " + this.getGenero());
   	  System.out.println("Status: " + this.isDisponivel());

	}
}
