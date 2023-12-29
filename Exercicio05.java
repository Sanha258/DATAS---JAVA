package datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.print("Informe a sua data de nascimento no formato dd/MM/yyyy HH:mm:ss: ");
		LocalDateTime dataNascimento = LocalDateTime.parse(teclado.nextLine(), fin);
		LocalDateTime agora = LocalDateTime.now();
		
		Duration tempo = Duration.between(dataNascimento, agora);
		System.out.println("Você possui:");
		System.out.println("Horas: " +  tempo.toHours());
		//System.out.println("Minutos: " + tempo.toMinutesPart());
		//System.out.println("Segundos: " + tempo.toSecondsPart());
		
		teclado.close();

	}

}
