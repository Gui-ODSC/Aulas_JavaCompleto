package Instanciacao;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {
	public static void main(String [] args) {
		LocalDate data1 = LocalDate.now();//Função.now puxa a data do sistema operacional
		LocalDateTime data2 = LocalDateTime.now();//Função.now puxa a data e hora do sistema operacional
		Instant data3 = Instant.now();//Função Instant puxa a hora exata e exibe a hora em GMT (Com fuso de londres)
		
		//conversão de texto (string) em data formato ISO
		LocalDate data4 = LocalDate.parse("2022-07-20");
		LocalDateTime data5 = LocalDateTime.parse("2022-07-20T14:45:42");
		Instant data6 = Instant.parse("2022-07-20T14:45:42Z");
		Instant data7 = Instant.parse("2022-07-20T14:45:42-03:00");
		
		//Transformar Texto personalizado em um data e hora Utiliza-se (DateTimeFormatter)
		//Link de Referencia: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter formt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate data8 = LocalDate.parse("20/07/2022", formt1);//necessita de padrão de formatação que foi declarado na linha de cima, e passado como parâmetro(formt1)
		LocalDateTime data9 = LocalDateTime.parse("20/07/2022 01:30", formt2);//necessita de padrão de formatação que foi declarado na linha de cima, e passado como parâmetro(formt2)
		
		//Instanciação de Datas a partir de dados isolados dia, mes e ano(separados)
		LocalDate data10 = LocalDate.of(2022, 7, 20);//Método .of aceita ano mes e dia separadamente.
		LocalDateTime data11 = LocalDateTime.of(2022, 7, 20, 1, 30);//Método .of aceita ano mes dia hora e minuto separadamente.
				
		System.out.println("Data 1 = " + data1);
		System.out.println("Data 2 = " + data2);
		System.out.println("Data 3 = " + data3);
		System.out.println("Data 4 = " + data4);
		System.out.println("Data 5 = " + data5);
		System.out.println("Data 6 = " + data6);
		System.out.println("Data 7 = " + data7);
		System.out.println("Data 8 = " + data8);
		System.out.println("Data 9 = " + data9);
		System.out.println("Data 10 = " + data10);
		System.out.println("Data 11 = " + data11);
	}
}

//Instanciacao de datas e horários
/* 
 * Data e Hora Local
 * Somente data(d/m/a)Utiliza-se (LocalDate)
 * Data + Hora Local Utiliza-se (LocalDateTime)
 * 
 * Data e HOra Global
 * Utiliza-se (instant)
 * 
 * Duração
 * utiliza-se (Duration)
 * 
 * Outros
 * utiliza-se (Zoneld, ChronoUnit)
 */
