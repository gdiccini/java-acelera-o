package desafio.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class DesafioFibonaccci {
  public static List<Integer> fibonacci() {
    ArrayList<Integer> fibonacci = new ArrayList<>();

    int limit = 350;
    int compare = 0;

    while (compare < limit) {
      if (fibonacci.size() == 0) {
        fibonacci.add(0);
      } else if (fibonacci.size() == 1) {
        fibonacci.add(1);
      } else {
        int size = fibonacci.size();
        int nextNumber = fibonacci.get(size - 1)+ fibonacci.get(size - 2);
        compare = nextNumber;
        fibonacci.add(nextNumber);
      }
    }
    return fibonacci;
  }

  public static Boolean isFibonacci(Integer a) {
    ArrayList<Integer> fibonacci = (ArrayList<Integer>) fibonacci();
    boolean contain = fibonacci.contains(a);
    return contain;
  }
}
