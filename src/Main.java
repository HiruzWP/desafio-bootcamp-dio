import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Descrição Java");
		curso1.setCargaHoraria(8);
		//System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descrição JavaScript");
		curso2.setCargaHoraria(7);
		//System.out.println(curso2);
		
		
		
		//pode apenas usar membros da classe Conteudo.
		Conteudo conteudo = new Curso();
		//tudo que tenho em Conteudo, eu tenho em Curso, então posso intanciar um novo obj Curso do tipo Conteudo
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Desc. Mentoria Java");
		mentoria1.setData(LocalDate.now());
		//System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descriçao Bootcamp Java Dev");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devTiago = new Dev();
		devTiago.setNome("Tiago");
		devTiago.increverBootcamp(bootcamp);
		System.out.println(devTiago.getConteudosInscritos());
		devTiago.progredir();
		System.out.println(devTiago.getConteudosInscritos());
		System.out.println(devTiago.getConteudosConcluidos());
		System.out.println("XP: " + devTiago.calcularTotalXp());
		
		System.out.println("-----------");
		
		Dev devRodrisvaldo = new Dev();
		devRodrisvaldo.setNome("Rodrisvaldo");
		devRodrisvaldo.increverBootcamp(bootcamp);
		System.out.println(devRodrisvaldo.getConteudosInscritos());
		devRodrisvaldo.progredir();
		System.out.println(devRodrisvaldo.getConteudosInscritos());
		System.out.println(devRodrisvaldo.getConteudosConcluidos());
		System.out.println("XP: " + devRodrisvaldo.calcularTotalXp());
	}
}
