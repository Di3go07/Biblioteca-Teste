package com.mycompany.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutorTest{
	@Test
	public void getCargoRetornaCargoPassado(){
		Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
                Autor autor = new Autor("J.R.R Tolkien", new ArrayList<>(), "Britânico", cargo);
                assertEquals(Autor.Cargo.ESCRITOR, autor.getCargo());
                Autor.Cargo novoCargo = Autor.Cargo.USUARIO;
		Autor userAutor = new Autor ("Diego Penna", new ArrayList<>(), "Brasileiro", novoCargo);
                assertEquals(Autor.Cargo.USUARIO, userAutor.getCargo());
	}
	@Test
	public void getNacionalidadeRetornaNacionalidade(){
		//cria uma instância do Autor e verifica se getNacionalidade() retorna a passada no construtor
		Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
		Autor autor = new Autor("J.R.R Tolkien", new ArrayList<>(), "Britânico", cargo);
		assertEquals("Britânico", autor.getNacionalidade());
	}
	@Test
	public void setNacionalidadeArmazenaNovaNacionalidade(){
		//cria uma instância do Autor e verifica se o setNacionalidade() alterou o valor do atributo nacionalidade dessa instância
		Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
        Autor autor = new Autor("J.R.R Tolkien", new ArrayList<>(), "Britânico", cargo);
		autor.setNacionalidade("Britânico");
		assertEquals("Britânico", autor.getNacionalidade());
	}
	@Test
	public void adicionarLivroAcrescentaLivroNaLista(){
		//cria instâncias de Livro para armazena-los na Array do Autor. A função verifica se o getObrasPublicadas() retorna a lista de obras publicada
		//também testa se a instância de livro recebeu corretamente o autor que adicionou o livro à sua lista pessoal
		Livro livro1 = new Livro("O Hobbit","Fantasia",true);
		Livro livro2 = new Livro("Beren e Lúthien", "Conto", true);
		Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
                Autor autor = new Autor("J.R.R Tolkien", new ArrayList<>(), "Britânico", cargo);
		autor.adicionarLivro(livro1);
		autor.adicionarLivro(livro2);
		List<Livro> listaEsperada = Arrays.asList(livro1, livro2);
                assertEquals(listaEsperada, autor.getObrasPublicadas());
		assertEquals("J.R.R Tolkien", livro1.getAutor().getNome());
	}
	@Test
	public void getObrasPublicadas(){
               //verifica se a lista retornada no getObrasPublicadas contém todas as instâncias de Livro adicionada ao Array da instância do Autor
	 	Livro livro1 = new Livro("O Hobbit","Fantasia",true);
                Livro livro2 = new Livro("Beren e Lúthien", "Conto", true);
                Livro livro3 = new Livro("O Silmarillion", "Fantasia", true);
		Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
                Autor autor = new Autor("J.R.R Tolkien", new ArrayList<>(), "Britânico", cargo);
                autor.adicionarLivro(livro1);
                autor.adicionarLivro(livro2);
                autor.adicionarLivro(livro3);
		List<Livro> listaEsperada = Arrays.asList(livro1, livro2, livro3);
		assertEquals(listaEsperada, autor.getObrasPublicadas());
	}
	@Test
	public void getObrasPublicadasPorGenerosRetornaListaFiltrada(){
		//verifica se a lista retornada ao buscar Obras pelo genero contem os livros que espera-se que o método retorne
		Livro livro1 = new Livro("O Hobbit","Fantasia",true);
                Livro livro2 = new Livro("Beren e Lúthien", "Conto", true);
                Livro livro3 = new Livro("O Silmarillion", "Fantasia", true);
		Autor.Cargo cargo = Autor.Cargo.ESCRITOR;
                Autor autor = new Autor("J.R.R Tolkien", new ArrayList<>(), "Britânico", cargo);
		autor.adicionarLivro(livro1);
		autor.adicionarLivro(livro2);
		autor.adicionarLivro(livro3);
		Livro[] LivrosEsperados = new Livro[2];
		LivrosEsperados[0] = livro1;
		LivrosEsperados[1] = livro3;
		assertTrue(Arrays.equals(LivrosEsperados, autor.getObrasPublicadasPorGeneros("Fantasia")));

	}
}

