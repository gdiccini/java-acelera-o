package br.com;

import br.com.alunos.Aluno;
import br.com.alunos.ValidationException;
import br.com.disciplinas.Disciplina;
import br.com.disciplinas.LimiteAlunosAlcancadoException;
import br.com.professor.Professor;
import br.com.usuario.repositorios.RepositorioUsuario;

public class Main {

  public static void main(String[] args) {
    RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
    try {
      Professor professor = new Professor("professor", "11100000000", "Professor da silva");
      Aluno aluno = new Aluno("aluno", "11133322244", "aluno da silva");

      repositorioUsuario.add(professor);
      repositorioUsuario.add(aluno);
      repositorioUsuario.findAll().stream().forEach(System.out::println);
    } catch (ValidationException e) {
      System.out.println(e.getMessage());
    }
  }
}
