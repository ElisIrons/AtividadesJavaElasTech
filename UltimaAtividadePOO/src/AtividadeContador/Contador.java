package AtividadeContador;

public class Contador {

    private int contador;

    public Contador(int contador) {
        this.contador = contador;
    }

    public int getItem() {
        return contador;
    }

    public void setItem(int item) {
        this.contador = item;
    }
    public void zerar() {
        this.contador = 0;
        System.out.println("Valor zerado: " + contador);
    }

    public void incrementar() {
        this.contador++;
        System.out.println("Incrementado " + contador);
    }


}

