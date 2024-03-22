package LojaSuprimentos;

public class Suprimentos {
    private int itemFaturado;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Suprimentos(int itemFaturado, String descricao, int quantidade, double precoUnitario) {
        this.itemFaturado = itemFaturado;
        this.descricao = descricao;
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public int getItemFaturado() {
        return itemFaturado;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public double getInvoiceAmount() {
        double invoiceAmount = quantidade * precoUnitario;
        return invoiceAmount;
    }
}

