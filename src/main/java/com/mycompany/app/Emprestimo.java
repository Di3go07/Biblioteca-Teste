package com.mycompany.app;
import java.time.LocalDate;

public class Emprestimo {
	private LocalDate dataRetirada;
	private LocalDate dataDevolucao;
	private Livro livro;
	private Usuario usuario;

	public Emprestimo(LocalDate dataRetirada, LocalDate dataDevolucao, Livro livro, Usuario usuario){
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
		this.livro = livro;
		this.usuario = usuario;
	}

	public LocalDate getDataRetirada(){
		return this.dataRetirada;
	}
	public LocalDate getDataDevolucao(){
    return this.dataDevolucao;
  }
	public Livro getLivro(){
		return this.livro;
	}
	public Usuario getUsuario(){
		return this.usuario;
	}
}

