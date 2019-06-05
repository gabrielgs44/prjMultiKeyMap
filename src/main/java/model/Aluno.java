package model;

import java.util.ArrayList;

public class Aluno {
	private Integer matricula;
	private String nome;
	private ArrayList<Curso> cursos;
	
	public Aluno(Integer matricula, String nome, ArrayList<Curso> cursos) {
		this.matricula = matricula;
		this.nome = nome;
		this.cursos = new ArrayList<Curso>();
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addCurso(Curso novoCurso) {
		cursos.add(novoCurso);
	}
	public void removeCurso(Curso exCurso) {
		cursos.remove(exCurso);
	}
}
