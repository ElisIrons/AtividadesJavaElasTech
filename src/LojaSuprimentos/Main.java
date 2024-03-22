package LojaSuprimentos;

public class Main {
    public static void main(String[] args){
        Suprimentos item =  new Suprimentos(1, "Monitor", 3, 369.90);
        System.out.println("Número do item faturado: " + item.getItemFaturado());
        System.out.println("Descrição do item: " + item.getDescricao());
        System.out.println("Quantidade comprada: " + item.getQuantidade());
        System.out.println("Preço unitário: " + item.getPrecoUnitario());
        System.out.println("Valor da fatura: " + item.getInvoiceAmount());
    }
}