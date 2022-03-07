import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila");
        System.out.println(devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Camila:");
        System.out.println(devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:");
        System.out.println(devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        if (devCamila.calcularTotalXp() == 150) {
            System.out.println("Parábens voce finalizou o Bootcamp");
        }else {
            System.out.println("Continue progredindo para finalizar o Bootcamp");
        }

        System.out.println("----------------------");

        Dev devJoao =new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos João");
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" );
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        if (devJoao.calcularTotalXp() == 150) {
            System.out.println("Parábens voce finalizou o Bootcamp");
        }else {
            System.out.println("Continue progredindo para finalizar o Bootcamp");
        }





    }
}
