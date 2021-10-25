package br.com.usuario;

import br.com.alunos.ValidationException;

public class Usuario {

  private String login;
  private String cpf;
  private String nome;

  public Usuario(String login, String cpf, String nome) throws ValidationException {
    setLogin(login);
    setCpf(cpf);
    setNome(nome);
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) throws ValidationException {
    if(validateLogin(login)) {
      this.login = login;
    } else {
      throw new ValidationException("Login inválido");
    }
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) throws ValidationException {
    if(validateCpf(cpf)) {
      this.cpf = cpf;
    } else {
      throw new ValidationException("CPF inválido");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  private boolean validateLogin(String login) {
    return login != null && !login.isEmpty() && login.length() > 3 && login.length() < 20;
  }

  private boolean validateCpf(String cpf) {
    return cpf != null && !cpf.isEmpty() && (cpf.length() == 11 || cpf.length() == 14);
  }

  @Override
  public String toString() {
    return this.nome;
  }
}
