package com.mycompany.app.model;
import com.mycompany.app.interfaces.*;


public class EstrategiaPublicacaoArtigo implements Publicavel{
        private Autor autor;
        private Artigo artigo;

    	public EstrategiaPublicacaoArtigo(Autor autor, Artigo artigo) {
        	this.autor = autor;
        	this.artigo = artigo;
    	}
	public Artigo getArtigo(){
		return this.artigo;
	}
        @Override
        public void publicar(){
                System.out.println("O usuário " + this.autor.getNome() + " está publicando um artigo");
        }
}
