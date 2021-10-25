package br.com.professor;

import br.com.alunos.ValidationException;
import br.com.usuario.Usuario;

public class Professor extends Usuario {

  public Professor(String login, String cpf, String nome) throws ValidationException {
    super(login, cpf, nome);
  }
}
