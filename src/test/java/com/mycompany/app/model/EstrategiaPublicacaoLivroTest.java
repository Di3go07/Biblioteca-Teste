package com.mycompany.app.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import com.mycompany.app.model.Autor;
import com.mycompany.app.model.Autor.Cargo;
import com.mycompany.app.model.Livro;
import com.mycompany.app.model.EstrategiaPublicacaoLivro;

public class EstrategiaPublicacaoLivroTest{
        @Test
        public void publicarRetornaMensagemEsperada(){
		//Para testar se a estratégia está retornando o comportamento certo do método, o código captura a saída no console e a converte em string para comparar
		//se o método publicar() retornou a mensagem esperada
        	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        	PrintStream originalOut = System.out;
        	System.setOut(new PrintStream(outputStream));

		Cargo cargo = Cargo.ESCRITOR;
		Autor autor = new Autor("Issac Asimov", new ArrayList<>(), "Russo", cargo);
		Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
		EstrategiaPublicacaoLivro LivroPublicado = new EstrategiaPublicacaoLivro(autor,livro);

		LivroPublicado.publicar();
		System.setOut(originalOut);

		String expectedOutput = "O autor Issac Asimov está publicando seu livro Eu, Robô\n";
        	assertEquals(expectedOutput, outputStream.toString());
	}
	@Test
	public void getLivroRetornaInstanciaCorreta(){
		//compara se o getLivro() retorna a instância esperada do Livro
		Cargo cargo = Cargo.ESCRITOR;
                Autor autor = new Autor("Issac Asimov", new ArrayList<>(), "Russo", cargo);
                Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
                EstrategiaPublicacaoLivro LivroPublicado = new EstrategiaPublicacaoLivro(autor,livro);

		assertEquals(livro, LivroPublicado.getLivro());
	}
}
