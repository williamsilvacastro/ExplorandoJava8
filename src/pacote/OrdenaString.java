package pacote;
import java.util.ArrayList;

import static java.util.Comparator.comparing;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrdenaString {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 5));
		
		cursos.sort(comparing(Curso::getAlunos));
		cursos.stream()
			.filter(s->s.getAlunos()>=100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		cursos.stream().mapToInt(Curso::getAlunos).average().ifPresent(System.out::println);
		
		List<Curso> list = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		
	}
	 
	

}


class Curso  {
	private String nome;
	private Integer alunos;
	public Curso(String nome, Integer alunos) {
		this.nome = nome;
		this.alunos=alunos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		nome = nome;
	}
	public Integer getAlunos() {
		return alunos;
	}
	public void setAlunos(Integer alunos) {
		this.alunos = alunos;
	}
}
