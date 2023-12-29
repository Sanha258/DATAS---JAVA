package datas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter fin = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.print("Informe o horário de início da partida no formato HH:mm:ss: ");
		LocalTime horaInicio = LocalTime.parse(teclado.nextLine(), fin);
		System.out.print("Informe o horário de término da partida no formato HH:mm:ss: ");
		LocalTime horaTermino = LocalTime.parse(teclado.nextLine(), fin);
		
		Duration tempoJogo = Duration.between(horaInicio, horaTermino);
		System.out.println("A partida durou: ");
		//System.out.println("Horas: " +  tempoJogo.toHoursPart());
		//System.out.println("Minutos: " +  tempoJogo.toMinutesPart());
		//System.out.println("Segundos: " +  tempoJogo.toSecondsPart());
		teclado.close();
	}

}
