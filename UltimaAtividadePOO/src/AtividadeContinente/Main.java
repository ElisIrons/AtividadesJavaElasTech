package AtividadeContinente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Continente continente1 = new Continente("América do Sul");

        while (true) {
            System.out.println("\n*** Continente: " + continente1.getNomeContinente() +" ***");
            System.out.println("1. Adicionar país ao continente:");
            System.out.println("2. Mostrar países");
            System.out.println("3. Mostrar densidade populacional do continente:");
            System.out.println("4. Mostrar o país com maior população:");
            System.out.println("5. Mostrar o país com menor população:");
            System.out.println("6. Mostrar o país com maior dimensão territorial no continente:");
            System.out.println("7. Mostrar o país com menor dimensão territorial no continente:");
            System.out.println("8. Mostra a razão territorial do maior país em relação ao menor país");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do país a ser adicionado: ");
                    String nomePais = scanner.nextLine();
                    System.out.print("Digite a dimensão do país: ");
                    double dimensaoPais = scanner.nextDouble();
                    System.out.print("Digite a população do país: ");
                    double populacaoPais = scanner.nextLong();
                    scanner.nextLine();
                    Pais novoPais = new Pais(nomePais, dimensaoPais, populacaoPais);
                    continente1.adicionarPais(novoPais);
                    System.out.println("\n" + novoPais.getNome() + " foi adicionado à lista de países do continente " + continente1.getNomeContinente());
                    break;
                case 2:
                    continente1.mostrarPaises();
                    break;
                case 3:
                    System.out.println("\nDensidade populacional do continente " + continente1.getNomeContinente() + ": " + continente1.densidadePopulacional());
                    break;
                case 4:
                    Pais comMaiorPopulacao = continente1.maiorPopulacao();
                    System.out.println("\nO país com maior população no continente é: " + comMaiorPopulacao.getNome());
                    break;
                case 5:
                    Pais comMenorPopulacao = continente1.menorPopulacao();
                    System.out.println("\nO país com menor população no continente é: " + comMenorPopulacao.getNome());
                    break;
                case 6:
                    Pais comMaiorDimensao = continente1.maiorDimensao();
                    System.out.println("\nO país com maior dimensão territorial no continente é: " + comMaiorDimensao.getNome());
                    break;
                case 7:
                    Pais comMenorDimensao = continente1.menorDimensao();
                    System.out.println("\nO país com menor dimensão no continente é: " + comMenorDimensao.getNome());
                    break;
                case 8:
                    System.out.println("\nA razão territorial do maior país em relação ao menor país.: " + continente1.razaoTerritorial());
                    break;
                case 9:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}