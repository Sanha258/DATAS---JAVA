package datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio07 {

	public static void main(String[] args) {

		DateTimeFormatter fout = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		ZonedDateTime fusoSP = ZonedDateTime.now();
		fusoSP = fusoSP.withHour(19).withMinute(0).withSecond(0);
		fusoSP = fusoSP.plusHours(11).plusMinutes(20);
		
		ZonedDateTime fusoParis = fusoSP.withZoneSameInstant(ZoneId.of("Europe/Paris"));
		System.out.println("Fuso São Paulo: " +  fusoSP.format(fout));
		System.out.println("Fuso Paris: " +  fusoParis.format(fout));
	}

}
