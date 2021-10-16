package aula1.tarefas;

public class Tarefa {

  String descricao;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public void showTask() {
    System.out.println(descricao);
  }

  public int taskSize() {
    return descricao.length();
  }

}
