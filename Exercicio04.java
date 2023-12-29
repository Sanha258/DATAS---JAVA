package datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Informe a sua data de nascimento no formato dd/MM/yyyy: ");
		LocalDate dataNascimento = LocalDate.parse(teclado.nextLine(), fin);
		LocalDate agora = LocalDate.now();
		
		Period tempo = Period.between(dataNascimento, agora);
		System.out.println("Você possui:");
		System.out.println("Anos: " +  tempo.getYears());
		System.out.println("Meses: " + tempo.getMonths());
		System.out.println("Dias: " + tempo.getDays());
		
		teclado.close();
	}

}
