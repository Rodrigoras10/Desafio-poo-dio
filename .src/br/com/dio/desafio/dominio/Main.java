package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Criação de Conteúdos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Aprenda o básico de Java.");
        curso1.setCargaHoraria(8); // XP: 10 * 8 = 80

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Desenvolvimento de APIs com Spring.");
        curso2.setCargaHoraria(12); // XP: 10 * 12 = 120

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de POO");
        mentoria.setDescricao("Sessão ao vivo de aprofundamento em OO.");
        mentoria.setData(LocalDate.now()); // XP: 10 + 20 = 30

        // 2. Criação do Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Domine a stack Java!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);

        // 3. Criação e Inscrição de Dev
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("XP Total Inicial: " + devJoao.calcularTotalXp());
        
        System.out.println("---------------------------------------------");

        // 4. Progresso do Dev (Simulação)
        devJoao.progredir(); // Conclui curso1
        devJoao.progredir(); // Conclui mentoria

        System.out.println("Progrediu...");
        System.out.println("Conteúdos Inscritos de " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total Final: " + devJoao.calcularTotalXp()); 
        // Deve ser: 80 (Curso 1) + 30 (Mentoria) = 110.0
    }
}