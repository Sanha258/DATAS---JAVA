package datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe uma data no formato dd/MM/yyyy: ");
		LocalDate data = LocalDate.parse(teclado.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR")));
		
		//Forma alternativa de fazer sem usar o switch abaixo...
		System.out.println("Data da última terça-feira: " 
				+ data.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE")));
		//-----------------------------------------------------
		
		DateTimeFormatter fout = DateTimeFormatter.ofPattern("EEEE");
		switch(data.format(fout)) {
			case "Domingo":{
				data = data.minusDays(5);
				break;
			}
			case "Segunda-feira":{
				data = data.minusDays(6);
				break;
			}
			case "Terça-feira":{
				data = data.minusDays(7);
				break;
			}
			case "Quarta-feira":{
				data = data.minusDays(1);
				break;
			}
			case "Quinta-feira":{
				data = data.minusDays(2);
				break;
			}
			case "Sexta-feira":{
				data = data.minusDays(3);
				break;
			}
			case "Sábado":{
				data = data.minusDays(4);
				break;
			}
		}
		System.out.println("Data da última terça-feira: " 
				+ data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE")));
		
		teclado.close();
	}

}
