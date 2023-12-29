package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe uma quantiade de dias: ");
		int dias = Integer.parseInt(teclado.nextLine());
		
		LocalDate data = LocalDate.now();
		data = data.plusDays(dias);
		
		System.out.println("Daqui a " + dias + " será " 
				+ data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ " (" + data.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"))
				+ ").");
		
		teclado.close();
	}

}
