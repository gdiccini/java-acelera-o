package challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

  List<Carro> carros = new ArrayList<>();

  public void estacionar(Carro carro) {
    boolean allSeniors = checkSeniors();
    int size = carros.size();
    if (size < 10) {
      carros.add(carro);
    } else if (allSeniors == false) {
      int firstNonSenior = getFirstNonSeniorIndex();
      carros.remove(firstNonSenior);
      carros.add(carro);
    } else if (allSeniors == true) {
      throw new EstacionamentoException("todos são seniors");
    }
  }

  public int carrosEstacionados() {
    return carros.size();
  }

  public boolean carroEstacionado(Carro carro) {
    return carros.contains(carro);
  }

  private boolean checkSeniors() {
    boolean allSeniors = true;
    Motorista motorista;
    for (int i = 0; i < carros.size(); i++) {
      motorista = carros.get(i).getMotorista();
      if (motorista.getIdade() < 55) {
        allSeniors = false;
      }
    }
    return allSeniors;
  }

  private int getFirstNonSeniorIndex() {
    Motorista motorista;
    int index = 0;
    for (int i = 0; i < carros.size(); i++) {
      motorista = carros.get(i).getMotorista();
      if (motorista.getIdade() < 55) {
        index = i;
        break;
      }
    }
    return index;
  }
}
