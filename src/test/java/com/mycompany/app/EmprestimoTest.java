package com.mycompany.app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EmprestimoTest{
	@Test
	public void getDataRetiradaRetornaDataPassada(){
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmprestimo = LocalDate.parse("24/02/2025", formato);
		LocalDate dataDevolucao = LocalDate.parse("02/03/2025", formato);
		Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
		Usuario user = new Usuario("Diego", new ArrayList<>(), 17);

		Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, user);
		assertTrue(dataEmprestimo.isEqual(emprestimo.getDataRetirada()));
	}
	@Test
        public void getDataDevolucaoRetornaDataPassada(){
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataEmprestimo = LocalDate.parse("24/02/2025", formato);
                LocalDate dataDevolucao = LocalDate.parse("02/03/2025", formato);
                Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
                Usuario user = new Usuario("Diego", new ArrayList<>(), 17);

                Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, user);
                assertTrue(dataDevolucao.isEqual(emprestimo.getDataDevolucao()));
        }
	@Test
	public void getLivroRetornaLivroPassado(){
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataEmprestimo = LocalDate.parse("24/02/2025", formato);
                LocalDate dataDevolucao = LocalDate.parse("02/03/2025", formato);
                Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
                Usuario user = new Usuario("Diego", new ArrayList<>(), 17);

                Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, user);
		assertEquals(livro, emprestimo.getLivro());
	}
	@Test
	public void getUsuarioRetornaUsuarioPassado(){
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataEmprestimo = LocalDate.parse("24/02/2025", formato);
                LocalDate dataDevolucao = LocalDate.parse("02/03/2025", formato);
                Livro livro = new Livro("Eu, Robô", "Ficção Científica", true);
                Usuario user = new Usuario("Diego", new ArrayList<>(), 17);

                Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, user);
		assertEquals(user, emprestimo.getUsuario());
	}
}
