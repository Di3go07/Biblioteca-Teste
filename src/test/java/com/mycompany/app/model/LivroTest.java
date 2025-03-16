package com.mycompany.app.model;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.mycompany.app.Autor.Cargo;

public class LivroTest{
	@Test
	public void getTituloRetornaTituloPassado(){
		//verifica se getTitulo() retorna o titulo passado ao construtor
		Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
		assertEquals("Eu, Robô", livro.getTitulo());
	}
	@Test
	public void setAutorArmazenaUmAutorNaInstancia(){
		//verifica se o autor passado no set é o mesmo retorna no getAutor()
		Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
		Autor autor = new Autor("Issac Asimov", new ArrayList<>(), "Russo", cargo);
		Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
		livro.setAutor(autor);
		assertEquals(autor, livro.getAutor());
	}
	@Test
	public void getAutor(){
		//verifica se o getAutor retorna a instância certa ao comparar o valor da variável nome da instância de Autor passada e a armazenada no Livro
                Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
                Autor autor = new Autor("Issac Asimov", new ArrayList<>(), "Russo", cargo);
                Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
                livro.setAutor(autor);
		assertEquals(autor.getNome(), livro.getAutor().getNome());
	}
	@Test
	public void getGeneroRetornaGeneroPassado(){
                //verifica se getGenero() retorna o genero passado ao construtor
		Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
		assertEquals("Ficção Científica", livro.getGenero());
	}
	@Test
	public void isDisponivelRetornaRespostaEsperada(){
		//verifica se o método passa a mensagem correta ao retornar se o livro está disponível
		Livro livro1 = new Livro("Eu, Robô", "Ficção Científica", true);
                Livro livro2 = new Livro("Fundação", "Ficção Científica", false);
		assertEquals("Disponível para empréstimo", livro1.isDisponivel());
		assertEquals("Emprestado", livro2.isDisponivel());
	}
	@Test
	public void alterarDisponivelMudaStatusDoLivro(){
		//verifica se o método alterarDisponivel inverteu o valor booleano do atributo disponivel na instância de Livro
		Livro livro = new Livro("Fundação", "Ficção Científica", false);
		livro.alterarDisponivel();
                assertEquals("Disponível para empréstimo", livro.isDisponivel());
	}
}