package model;

import java.util.ArrayList;

public class Incricao {
	private int codigo;
	private String horario;
	private Aluno aluno;
	private Curso curso;
	
	public Incricao(int codigo, String horario, Aluno aluno, Curso curso) {
		this.codigo = codigo;
		this.horario = horario;
		this.aluno = aluno;
		this.curso = curso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	} 
	
	
}
