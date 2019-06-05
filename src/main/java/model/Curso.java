package model;

import java.util.ArrayList;

public class Curso {
	private int codigo;
	private String nome;
	private ArrayList<Aluno> alunos;
	
	public Curso(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.alunos = new ArrayList<Aluno>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addAlunos(Aluno novoAluno) {
		alunos.add(novoAluno);
	}
	
	public void removeAlunos(Aluno exAluno) {
		alunos.remove(exAluno);
	}
}
