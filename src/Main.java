import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição curso C#");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eduardo" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Eduardo" + devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Eduardo" + devEduardo.getConteudosConcluidos());
        System.out.println("XP: " + devEduardo.calcularTotalXp());

        System.out.println("-------------------");

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aline" + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        devAline.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Aline" + devAline.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Aline" + devAline.getConteudosConcluidos());
        System.out.println("XP: " + devAline.calcularTotalXp());
    }
}
