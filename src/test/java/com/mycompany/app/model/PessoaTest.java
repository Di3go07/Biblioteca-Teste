package com.mycompany.app.model;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PessoaTest{
	@Test
	public void getNomeIgualNomePassado(){
	//o objeto recebe o valor "Diego" e a atribui como nome da instância de Pessoa e a função verifica se o método getNome retorna o valor esperado
		Pessoa pessoa = new Pessoa("Diego", new ArrayList<>());
		assertEquals("Diego", pessoa.getNome());
	}
	@Test
	public void setNomeArmazenaValorPassado(){
	//cria uma instância de Pessoa e passa a função setNome para alterar o atributo nome do objeto. A função verifica se o getNome() retorna o novo nome
		Pessoa pessoa = new Pessoa("Diego", new ArrayList<>());
		pessoa.setNome("Diego Penna");
		assertEquals("Diego Penna", pessoa.getNome());
	}
	@Test
	public void adicionarLivroArmazenouOsLivros(){
	//cria instâncias de livros e adiona ao Array List<Livro> de Pessoa. A função teste verifica se adicionou corretamente as duas instâncias de livro à classe.
		Livro livro1 = new Livro("O Hobbit","Fantasia",true);
		Livro livro2 = new Livro("Eu, Robô", "Ficção Científica", true);
		Pessoa pessoa = new Pessoa("Diego", new ArrayList<>());
		pessoa.adicionarLivro(livro1);
		pessoa.adicionarLivro(livro2);
		List<Livro> listaEsperada = Arrays.asList(livro1, livro2);
		assertEquals(listaEsperada, pessoa.getLivros());
	}
	@Test
	public void getLivrosRetornaAListaEsperada(){
	//funciona como a anterior e verifica se a função getLivros() retornou uma lista contendo os livros que foram passados
                Livro livro1 = new Livro("O Hobbit","Fantasia",true);
                Livro livro2 = new Livro("Eu, Robô", "Ficção Científica", true);
                Pessoa pessoa = new Pessoa("Diego", new ArrayList<>());
                pessoa.adicionarLivro(livro1);
                pessoa.adicionarLivro(livro2);
                List<Livro> listaEsperada = Arrays.asList(livro1, livro2);
                assertEquals(listaEsperada, pessoa.getLivros());

	}
}