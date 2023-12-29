package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Digite uma data no formato dd/MM/yyyy: ");
		
		LocalDate data = LocalDate.parse(teclado.nextLine(), fin);
		
		Locale brasil = new Locale("pt", "BR");
		DateTimeFormatter fout1 = DateTimeFormatter.ofPattern("EEEE", brasil);
		DateTimeFormatter fout2 = DateTimeFormatter.ofPattern("EEEE");
		System.out.println("Dia da semana: " +  fout1.format(data.getDayOfWeek()));
		System.out.println("Dia da semana: " +  fout2.format(data.getDayOfWeek()));
		System.out.println("Dia da semana: " +  data.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		
		teclado.close();
	}

}
