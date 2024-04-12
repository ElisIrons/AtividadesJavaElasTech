package AtividadeContinente;

import java.util.ArrayList;

public class Continente {
    private String nomeContinente;
    private ArrayList<Pais> paises;
    private double dimensaoTotal;
    private double populacaoTotal;

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
        this.paises = new ArrayList<>();
        this.dimensaoTotal = 0;
        this.populacaoTotal = 0;
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
        dimensaoTotal += pais.getDimensao();
        populacaoTotal += pais.getPopulacao();
    }

    public void mostrarPaises() {
        System.out.println("Países da " + nomeContinente + ":");
        for (Pais pais : paises) {
            System.out.println("\n* " + pais.getNome() + " - Dimensão: " + pais.getDimensao() + " - População: " + pais.getPopulacao());
        }
    }

    public double getDimensaoTotal() {
        return dimensaoTotal;
    }

    public void setDimensaoTotal(double dimensaoTotal) {
        this.dimensaoTotal = dimensaoTotal;
    }

    public double getPopulacaoTotal() {
        return populacaoTotal;
    }

    public void setPopulacaoTotal(double populacaoTotal) {
        this.populacaoTotal = populacaoTotal;
    }

    public double densidadePopulacional() {
        if (dimensaoTotal > 0 && populacaoTotal > 0) {
            double densidade = populacaoTotal / dimensaoTotal;
            return densidade;

        } else {
            System.out.println("É necessário os dados da dimensão e população do País adicionado para obter a densidade");
            return 0;
        }
    }

    public Pais maiorPopulacao() {
        if (paises.size() == 0) {
            System.out.println("Sem dados.");
            return null;
        }

        Pais paisMaiorPopulacao = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getPopulacao() > paisMaiorPopulacao.getPopulacao()) {
                paisMaiorPopulacao = pais;
            }
        }
        return paisMaiorPopulacao;
    }

    public Pais menorPopulacao() {
        if (paises.size() == 0) {
            System.out.println("Sem dados.");
            return null;
        }

        Pais paisMenorPopulacao = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getPopulacao() < paisMenorPopulacao.getPopulacao()) {
                paisMenorPopulacao = pais;
            }
        }
        return paisMenorPopulacao;
    }

    public Pais maiorDimensao() {
        if (paises.size() == 0) {
            System.out.println("Sem dados.");
            return null;
        }

        Pais paisMaiorDimensao = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensao() > paisMaiorDimensao.getDimensao()) {
                paisMaiorDimensao = pais;
            }
        }
        return paisMaiorDimensao;
    }


    public Pais menorDimensao() {
        if (paises.size() == 0) {
            System.out.println("Sem dados.");
            return null;
        }

        Pais paisMenorDimensao = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensao() < paisMenorDimensao.getDimensao()) {
                paisMenorDimensao = pais;
            }
        }
        return paisMenorDimensao;
    }

    public double razaoTerritorial() {
        if (paises.size() == 0) {
            System.out.println("Sem dados.");
            return 0;
        }

        double dimensaoMaiorPais = 0;
        double dimensaoMenorPais = 0;

        for (Pais pais : paises) {
            if (pais.getDimensao() > dimensaoMaiorPais) {
                dimensaoMaiorPais = pais.getDimensao();
            }
            if (pais.getDimensao() < dimensaoMenorPais || dimensaoMenorPais == 0) {
                dimensaoMenorPais = pais.getDimensao();
            }
        }

        if (dimensaoMaiorPais > 0 && dimensaoMenorPais > 0) {
            double razao = dimensaoMaiorPais / dimensaoMenorPais;
            return razao;
        } else {
            System.out.println("É necessário os dados da dimensão e população do país adicionado para obter a densidade");
            return 0;
        }
    }
}

