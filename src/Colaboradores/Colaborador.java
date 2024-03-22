package Colaboradores;

public class Colaborador {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Colaborador(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getCalcularSalarioAnual() {
        return salarioMensal * 12;
    }
    public double aplicarAumento() {
        return salarioMensal *= 1.1;
    }
}

