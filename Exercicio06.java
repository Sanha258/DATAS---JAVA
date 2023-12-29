package datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
				.withZone(ZoneId.of("America/Sao_Paulo"));
		
		System.out.print("Digite uma data no padrão dd/MM/yyyy HH:mm:ss: ");
		ZonedDateTime dataHora = ZonedDateTime.parse(teclado.nextLine(), fin);
		
		
		Locale[] localidades = {new Locale("pt", "BR"), Locale.US, Locale.FRANCE, Locale.JAPAN};
		String[] fusos = {"America/Sao_Paulo", "America/New_York", "Europe/Paris", "Asia/Tokyo"};
		
		DateTimeFormatter fout = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy HH:mm:ss ZZZZ");
		
		for(int i = 0; i < localidades.length; i++) {
			System.out.println("Pais: " + localidades[i].getDisplayCountry());
			System.out.println("Dia da Semana, Data e Hora: " 
					+ dataHora.format(fout.withLocale(localidades[i]).withZone(ZoneId.of(fusos[i]))));
			System.out.println("--------------");
		}
		
		teclado.close();
	}

}
