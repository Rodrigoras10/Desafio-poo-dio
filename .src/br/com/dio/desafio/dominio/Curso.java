package br.com.dio.desafio.dominio;

// Herda de Conteudo
public class Curso extends Conteudo { 
    
    private int cargaHoraria;

    // Construtor
    public Curso() {
    }

    @Override // Implementação específica (Polimorfismo)
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; 
    }

    // Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método toString para fácil visualização
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}