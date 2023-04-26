package logica.aulas.aula08;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date data = new Date();
		System.out.println("Data agora: " + data);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Data e hora atual: " + c.getTime());
	
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Ano: " + c.get(Calendar.MONTH));		
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		int minuto = c.get(Calendar.MINUTE);
		
		System.out.println(" ");
		System.out.println(hora + "h");
		System.out.println(minuto + "min");
	
	}

}
