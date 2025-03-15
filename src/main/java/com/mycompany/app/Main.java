package com.mycompany.app;

import com.mycompany.app.model.Autor;
import com.mycompany.app.model.Autor.Cargo;
import com.mycompany.app.model.Livro;
import com.mycompany.app.model.Artigo;
import com.mycompany.app.model.Usuario;
import com.mycompany.app.model.Emprestimo;
import com.mycompany.app.model.UsuarioAutorDecorator;
import com.mycompany.app.model.EstrategiaPublicacaoLivro;
import com.mycompany.app.model.EstrategiaPublicacaoArtigo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
	 public static void main(String[] args){
		//Criando instâncias
		Cargo cargo = Cargo.ESCRITOR;
		Autor autor = new Autor("J.R.R Tolkien", new ArrayList<>(), "Britânico", cargo);

		Livro livro = new Livro("O Hobbit", "Fantasia", true);
		autor.adicionarLivro(livro);

        	UsuarioAutorDecorator contextoLivro = new UsuarioAutorDecorator(new EstrategiaPublicacaoLivro(autor, livro));

		Usuario user = new Usuario("Diego", new ArrayList<>(), 17);

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmprestimo = LocalDate.parse("24/02/2025", formato);
		LocalDate dataDevolucao = LocalDate.parse("02/03/2025", formato);
		Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, user);

		Cargo cargo2 = Cargo.USUARIO;
		Autor userAutor = new Autor("Diego Penna", new ArrayList<>(), "Brasileiro", cargo2);
		Artigo artigo = new Artigo("Tolkien na literatura", userAutor, "Fantasia", true);
		UsuarioAutorDecorator contextoArtigo = new UsuarioAutorDecorator(new EstrategiaPublicacaoArtigo(userAutor, artigo));

		//Processamento
		System.out.println("--- Publicando livro ---");
	        	    contextoLivro.executarPublicacao();
		System.out.println("--- Dados do livro ---");
		            livro.exibirDetalhes();
		System.out.println("--- Usuário ---");
		            System.out.println(user);
   		 System.out.println("--- Detalhes do empréstimo ---");
		            System.out.println("Livro: " + livro.getTitulo());
                	    System.out.println("Autor: " + livro.getAutor().getNome());
                	    System.out.println("Data retirada: " + emprestimo.getDataRetirada());
               		    System.out.println("Data devolução: " + emprestimo.getDataDevolucao());
			    livro.alterarDisponivel();
    		System.out.println("--- Dados do livro ---");
                	    livro.exibirDetalhes();
                System.out.println("--- Artigo ---");
			    contextoArtigo.executarPublicacao();
	}
}
