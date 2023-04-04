import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Descrição do curso Java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("Curso JavaScript");
      curso2.setDescricao("Descrição do Curso JavaScript");
      curso2.setCargaHoraria(4);

      //Conteudo conteudo = new Conteudo(); não se pode instaciar
      //Realize Polimorfismo
      //Conteudo conteudo = new Curso();   //Exemplo de Polimorfismo

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("Descrição Mentoria Java");
      mentoria.setData(LocalDate.now());


      System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descricao Bootcampo Java developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devManoel = new Dev();
    devManoel.setNome("Manoel");
    devManoel.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos" + devManoel.getConteudosInscritos());
    devManoel.progredir();
    devManoel.progredir();
    System.out.println("_");

    System.out.println("Conteúdos Inscritos" + devManoel.getConteudosInscritos());
      System.out.println("Conteúdos Concluídos" + devManoel.getConteudosConcluidos());
      System.out.println("XP: "+devManoel.calcularTotalXp());

    Dev devTitto = new Dev();
    devTitto.setNome("Titto");
    devTitto.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos"+ devTitto.getConteudosInscritos());
    devTitto.progredir();
    devTitto.progredir();
    devTitto.progredir();
    System.out.println("_");


    System.out.println("Conteúdos Inscritos" + devTitto.getConteudosInscritos());
      System.out.println("Conteúdos Concluídos"+ devTitto.getConteudosConcluidos());
      System.out.println("XP: "+devTitto.calcularTotalXp());

    }
}
