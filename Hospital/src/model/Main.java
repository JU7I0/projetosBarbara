package model;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime dataEHora = LocalDateTime.of(2023, Month.MARCH, 21, 13, 30);

		
		Paciente paciente01 = new Paciente("Julio", 31, "013456", 1.75, 106.3, false);
		paciente01.addSintomas("Virose");
		Paciente paciente02 = new Paciente("Fabiana", 47, "15478", 1.75, 72.1, true);
		paciente02.addSintomas("Arritmia");
		Paciente paciente03 = new Paciente("Addonis", 19, "045795", 1.80, 97.5, true);
		paciente03.addSintomas("Dor de garganta");
		
		
		Medico medico01 = new Medico("Pedro Miguel", 2515, "Medico", "Clinico Geral", 8564);
		Medico medico02 = new Medico("Roberto", 2585, "Medico", "Cirurgião", 5864);
		
		Atendimento atendimento01 = new Atendimento(dataEHora);
		
		Sala sala01 = new Sala(01, "Centro cardiologico");
		Sala sala02 = new Sala(02, "Ambulatorio");
		Sala sala03 = new Sala (03,"Otorrinarigologista");

		
		System.out.println("O paciente, " + paciente01.getNome()+", "+paciente01+"\n será atendido pelo médico "+medico01+" na sala: "+sala02);
		System.out.println("-----------------------------------");
		System.out.println("O paciente, " + paciente02.getNome()+", "+paciente02+"\n será atendido pelo médico "+medico02+" na sala: "+sala01);
		System.out.println("-----------------------------------");
		System.out.println("O paciente, " + paciente03.getNome()+", "+paciente03+" \n está aguardando uma cirurgia marcada para"+atendimento01);
		
}
}		//"Julio", 31, "013456", 1.75, 106.3, false
		//String nome, int matricula, String cargo, String especialidade, int numCRM) {
