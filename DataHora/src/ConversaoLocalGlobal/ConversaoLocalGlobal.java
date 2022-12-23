package ConversaoLocalGlobal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoLocalGlobal {
	public static void main(String[] args) {
		//Para conversões de datas globais para locais é necessário informar o timezone
		LocalDate data4 = LocalDate.parse("2022-07-20");
		LocalDateTime data5 = LocalDateTime.parse("2022-07-20T14:45:42");
		Instant data6 = Instant.parse("2022-07-20T01:30:42Z");
		
//		for (String s : ZoneId.getAvailableZoneIds()) {//serve para acessar todas as id das zonas de fuso horário
//			System.out.println(s);
//		}
		LocalDate r1 = LocalDate.ofInstant(data6, ZoneId.systemDefault());//serve para converter a data do data6 para uma data do tipo local utilizando como parâmetro o sistema operacional padrão.
		LocalDate r2 = LocalDate.ofInstant(data6, ZoneId.of("Portugal"));//serve para converter a data do data6 para uma data do tipo local utilizando como parâmetro o sistema operacional padrão.
		LocalDateTime r3 = LocalDateTime.ofInstant(data6, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(data6, ZoneId.of("Portugal"));
				
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		//pegar dia mes e ano separadamente
		System.out.println("data4 dia = " + data4.getDayOfMonth());//pega o dia
		System.out.println("data4 dia = " + data4.getMonthValue());//pega o mes
		System.out.println("data4 dia = " + data4.getYear());//pega o ano
		
		System.out.println("data5 dia = " + data5.getHour());//pega a hora
		System.out.println("data5 dia = " + data5.getMinute());//pega o minuto
	}
}
