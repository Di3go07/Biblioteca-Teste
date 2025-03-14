package com.mycompany.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest{
	@Test
	public void getIdadeRetornaIdadePassada(){
		//instancia a classe Usuario e verifica se o método getIdade() retorna a idade passada no construtor
		Usuario user = new Usuario("Diego", new ArrayList<>(), 17);
		assertEquals(17, user.getIdade());
	}
	@Test
	public void setIdadeModificaAIdade(){
		//verifica se, após executar o setIdade(), o método getIdade() retornará a nova idade passada
		Usuario user = new Usuario("Diego", new ArrayList<>(), 17);
		user.setIdade(19);
		assertEquals(19, user.getIdade());
	}
	@Test
	public void getEmprestimosRetornaListaDeLivros(){
		//adiciona livros à lista da instância de User e verifica se a função getEmprestimos() retorna as instâncias de livros armazenadas no Array do objeto
		Livro livro1 = new Livro("O Hobbit","Fantasia",true);
		Livro livro2 = new Livro("Eu, Robô", "Ficção Científica", true);
                Usuario user = new Usuario("Diego", new ArrayList<>(), 17);
		user.adicionarLivro(livro1);
		user.adicionarLivro(livro2);
		List<Livro> listaEsperada = Arrays.asList(livro1, livro2);
		assertEquals(listaEsperada, user.getEmprestimos());
	}
}
