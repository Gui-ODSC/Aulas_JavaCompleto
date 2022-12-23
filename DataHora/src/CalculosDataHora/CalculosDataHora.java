package CalculosDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class CalculosDataHora {
	public static void main(String[] args) {
		//Implementa e reduz datas e horas
		LocalDate data4 = LocalDate.parse("2022-07-20");
		LocalDateTime data5 = LocalDateTime.parse("2022-07-20T14:45:42");
		Instant data6 = Instant.parse("2022-07-20T14:45:42Z");
		
		LocalDate pastWeekLocalDate = data4.minusDays(7);//data 4 menos 7 dias, esta é uma maneira de alterar uma data, ja que datas são imutaveis, é necessário criar outro objeto
		LocalDate nextWeekLocalDate = data4.plusDays(7);//acrescentar dias na data 4
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = data5.minusDays(7);//data 4 menos 7 dias, esta é uma maneira de alterar uma data, ja que datas são imutaveis, é necessário criar outro objeto
		LocalDateTime nextWeekLocalDateTime = data5.plusDays(7);//acrescentar dias na data 4
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = data6.minus(7, ChronoUnit.DAYS);//data 4 menos 7 dias, esta é uma maneira de alterar uma data, ja que datas são imutaveis, é necessário criar outro objeto
		Instant nextWeekInstant = data6.plus(7, ChronoUnit.DAYS);//acrescentar dias na data 4
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		
		//Duração, a partir de duas data e horas determinar a quantidade de intervalo entre elas
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data4.atStartOfDay());//necessária a conversão de LocalDate para LocalDateTime; pois a duração só aceita LocalDate Time
		Duration t2 = Duration.between(pastWeekLocalDateTime, data5);
		Duration t3 = Duration.between(pastWeekInstant, data6);
		Duration t4 = Duration.between(data6, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}
