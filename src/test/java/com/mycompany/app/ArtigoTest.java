package com.mycompany.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArtigoTest{
	@Test
	public void verificaPublicadoRetornaMensagemCerta(){
                Autor.Cargo cargo = Autor.Cargo.USUARIO;
                Autor userAutor = new Autor("Diego Penna", new ArrayList<>(), "Brasileiro", cargo);

		Artigo artigo = new Artigo("Tolkien na literatura", userAutor, "Literatura", true);
		assertEquals("O artigo está publicado", artigo.verificaPublicado());
                Artigo artigo2 = new Artigo("Inteligência Artifical", userAutor, "tecnologia", false);
                assertEquals("Desculpe, o artigo ainda não foi publicado", artigo2.verificaPublicado());
	}
}
