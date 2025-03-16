
package com.mycompany.app.model;


public class Artigo {
	private String titulo;
	private Autor autor;
	private String genero;
	private boolean isPublicado;

	public Artigo(String titulo, Autor autor, String genero, boolean isPublicado){
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.isPublicado = isPublicado;
	}
	public String verificaPublicado() {
		if (this.isPublicado) {
			return "O artigo está publicado";
          	}else{
            		return "Desculpe, o artigo ainda não foi publicado";
          	}
	}
	public void exibirDetalhes(){
		 System.out.println("Titulo: " + this.titulo);
		 System.out.println("Autor: " + this.autor.getNome());
		 System.out.println("Genero: " + this.genero);
		 System.out.println(this.verificaPublicado());
	}
}
