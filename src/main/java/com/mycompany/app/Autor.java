package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
	private String nacionalidade;

	public Autor(String nome, List<Livro> livros, String nacionalidade) {
        	super(nome, livros); 
        	this.nacionalidade = nacionalidade;
	}

	public String getNacionalidade(){
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	public List<Livro> getObrasPublicadas(){
		return this.livros;
	}
	public Livro[] getObrasPublicadasPorGeneros(String genero){
		List<Livro> lista_por_genero = new ArrayList<>();
		for (Livro l : this.livros){
			if (l.getGenero().equals(genero)){
				lista_por_genero.add(l);
			}
		}
		Livro[] listaPorGenero = new Livro[lista_por_genero.size()];
        	listaPorGenero = lista_por_genero.toArray(listaPorGenero);

		return listaPorGenero;
	}
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
    livro.setAutor(this);
	}
}
