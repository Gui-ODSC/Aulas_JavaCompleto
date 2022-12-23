package Formatacao;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {
	public static void main(String[] args) {
		LocalDate data4 = LocalDate.parse("2022-07-20");
		LocalDateTime data5 = LocalDateTime.parse("2022-07-20T14:45:42");
		Instant data6 = Instant.parse("2022-07-20T14:45:42Z");
		
		//Trsnformar "datas" em "textos"
		
		DateTimeFormatter formt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//utiliza-se este tipo de método para trabalhar com Instant, uma vez que o mesmo é variável de acordo com os fusos horários.
		DateTimeFormatter formt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("Data 4 = " + data4.format(formt1));//utiliza-se o (.format), passadno de argumento o (formt1), de modo que consigo escolher como a data será exibida na tela
		//ou inverte
		System.out.println("Data 4 = " + formt1.format(data4));//inverte formt1 por data4
		
		System.out.println("Data 5 = " + data5.format(formt1));
		System.out.println("Data 5 = " + data5.format(formt2));
		System.out.println("Data 5 = " + data5.format(formt4));
		
		System.out.println("Data 6 = " + formt3.format(data6));//Como data6 é Instant usa-se a formatação(formt3 + .format (data6)).
		System.out.println("Data 6 = " + formt5.format(data6));//Como data6 é Instant usa-se a formatação(formt3 + .format (data6)).
	}
}
