package calculator;

public class SalaryCalculator {

  public class CalculadoraSalario {

    public long calcularSalarioLiquido(double salarioBase) {
      double salarioInss = calcularInss(salarioBase);
      double salarioLiquido = calcularIrrf(salarioInss);
      return Math.round(salarioLiquido);
    }

    private double calcularInss(double salarioBase) {
      if (salarioBase < 1039) {
        return 0;
      } else if (salarioBase <= 1500) {
        return salarioBase * 0.92;
      } else if (salarioBase <= 4000){
        return salarioBase * 0.91;
      } else {
        return salarioBase * 0.89;
      }
    }

    private double calcularIrrf(double salarioInss) {
      if (salarioInss <= 3000) {
        return salarioInss;
      } else if (salarioInss <= 6000) {
        return salarioInss * 0.925;
      } else {
        return salarioInss * 0.85;
      }
    }

  }
}
