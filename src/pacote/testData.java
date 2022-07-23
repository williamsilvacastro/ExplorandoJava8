package pacote;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class testData {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(hoje);
		
		LocalDateTime olimpiadasRio = LocalDateTime.of(LocalDate.of(2016, Month.JUNE, 5), LocalTime.of(0, 0));
		
		Duration duracao = Duration.between(agora, olimpiadasRio);
		System.out.println(duracao.toDays());
		
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(agora.format(formatadorComHoras));
				
				
	}

}
