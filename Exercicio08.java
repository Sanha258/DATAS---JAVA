package datas;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercicio08 {

	public static void main(String[] args) {
		
		ZonedDateTime fusoParis = ZonedDateTime.of(2022, 10, 18, 19, 0, 0, 0, ZoneId.of("Europe/Paris"));
		ZonedDateTime fusoSP = ZonedDateTime.of(2022, 10, 19, 1, 20, 0, 0, ZoneId.of("America/Sao_Paulo"));
		
		Duration tempo = Duration.between(fusoParis, fusoSP);
		System.out.println("Duração: " + tempo.toHours() + ":" + tempo.toMinutes()%60);
	}

}
