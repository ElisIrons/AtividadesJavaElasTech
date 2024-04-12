package AtividadeContador;

import AtividadeContador.Contador;

public class Main {
    public static void main(String[] args) {

        Contador contador = new Contador(15);
        System.out.println("Valor atual do contador: " + contador.getItem());
        contador.incrementar();
        contador.zerar();
    }
}