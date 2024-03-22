package Colaboradores;

import LojaSuprimentos.Suprimentos;

public class Main {
    public static void main(String[] args) {

        Colaborador colaboradora = new Colaborador("Elis", "Rodrigues", 1000.0);


        System.out.println("Primeiro nome: " + colaboradora.getPrimeiroNome());
        System.out.println("Sobrenome " + colaboradora.getSobrenome());
        System.out.println("Salário mensal: " + colaboradora.getSalarioMensal());
        System.out.println("Salário anual: " + colaboradora.getCalcularSalarioAnual());
        System.out.println("Com aumento de 10%: " + colaboradora.aplicarAumento());

    }
}