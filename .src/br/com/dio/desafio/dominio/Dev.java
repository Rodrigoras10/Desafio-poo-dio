package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    // LinkedHashSet mantém a ordem de inscrição/conclusão
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); 
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    // Método Inscrever (Abstração)
    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Adiciona todos os conteúdos do bootcamp à lista de inscritos do Dev
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        // Adiciona o Dev à lista de inscritos do Bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    // Método Progredir (Abstração)
    public void progredir() {
        // Pega o primeiro Conteudo da lista de inscritos (usa Optional para segurança)
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    // Método Calcular XP (Polimorfismo em ação)
    public double calcularTotalXp() {
        // Usa Stream API para iterar sobre os concluídos e somar o XP
        return this.conteudosConcluidos
                .stream()
                // Chamando calcularXp() que será diferente para Curso e Mentoria
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    
    // Implementação de equals e hashCode (Fundamental para classes que usam Set)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}