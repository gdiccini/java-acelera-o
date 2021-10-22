package br.com.alunos;

public class Aluno {

  private String login;
  private String cpf;
  private String nome;

  public Aluno(String login, String cpf, String nome) {
    this.login = login;
    this.cpf = cpf;
    this.nome = nome;
  }

  public String getCpf() { return cpf; }
  public String getLogin() { return login; }
  public void setLogin(String login) {
    if(validateLogin(login)) {
      this.login = login;
    } else {
      System.out.println("Login inválido");
    }
  }
  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }
  private boolean validarCpf() { return this.cpf != null && this.cpf.length() == 13; }
  private static boolean validateLogin(String login) {
    return login != null && !login.isEmpty() && login.length() < 20;
  }

}
