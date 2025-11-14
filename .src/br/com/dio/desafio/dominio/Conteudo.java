package br.com.dio.desafio.dominio;

// Classe abstrata: serve para ser herdada.
public abstract class Conteudo { 

    // Constante protegida, acessível apenas por classes filhas
    protected static final double XP_PADRAO = 10d;

    // Atributos privados (Encapsulamento)
    private String titulo;
    private String descricao;

    // Método abstrato (Polimorfismo)
    public abstract double calcularXp();

    // Getters e Setters (para acesso controlado aos atributos privados)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}