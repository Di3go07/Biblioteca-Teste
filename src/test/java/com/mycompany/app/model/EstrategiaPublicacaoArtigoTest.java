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
import com.mycompany.app.model.Artigo;
import com.mycompany.app.model.EstrategiaPublicacaoArtigo;

public class EstrategiaPublicacaoArtigoTest{
        @Test
        public void publicarRetornaMensagemEsperada(){
		//Para testar se a estratégia está retornando o comportamento certo do método, o código captura a saída no console e a converte em string para comparar 
		//se o método publicar() retornou a mensagem esperada
        	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        	PrintStream originalOut = System.out;
        	System.setOut(new PrintStream(outputStream));

                Cargo cargo2 = Cargo.USUARIO;
		Autor userAutor = new Autor("Diego Penna", new ArrayList<>(), "Brasileiro", cargo2);
                Artigo artigo = new Artigo("Tolkien na literatura", userAutor, "Fantasia", true);
                EstrategiaPublicacaoArtigo ArtigoUser = new EstrategiaPublicacaoArtigo(userAutor, artigo);

		ArtigoUser.publicar();
		System.setOut(originalOut);

        	String expectedOutput = "O usuário Diego Penna está publicando um artigo\n";
        	assertEquals(expectedOutput, outputStream.toString());
	}
	@Test
	public void getArtigoArmazenaInstanciaCorreta(){
		//compara se o getArtigo() retorna a instância esperada do Artigo
		Cargo cargo2 = Cargo.USUARIO;
                Autor userAutor = new Autor("Diego Penna", new ArrayList<>(), "Brasileiro", cargo2);
                Artigo artigo = new Artigo("Tolkien na literatura", userAutor, "Fantasia", true);
                EstrategiaPublicacaoArtigo ArtigoUser = new EstrategiaPublicacaoArtigo(userAutor, artigo);

		assertEquals(artigo, ArtigoUser.getArtigo());
	}
}

