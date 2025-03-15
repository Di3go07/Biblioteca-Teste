package com.mycompany.app.model;
import com.mycompany.app.interfaces.*;



public class EstrategiaPublicacaoLivro implements Publicavel{
	private Autor autor;
	private Livro livro;

	public EstrategiaPublicacaoLivro(Autor autor, Livro livro){
		this.autor = autor;
		this.livro = livro;
	}
	public Livro getLivro(){
		return this.livro;
	}
	@Override
	public void publicar(){
		System.out.println("O autor " + this.autor.getNome() + " está publicando seu livro " + this.livro.getTitulo());
	}
}
