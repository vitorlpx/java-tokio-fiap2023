package logica.aulas.aula08;

public class MathOperadores {

	public static void main(String[] args) {
		
		double pi = Math.PI;
		System.out.println(pi);
		
		System.out.println(Math.sqrt(25));
		
		System.out.println(Math.abs(-25));
		
		double num = 3.05;
		
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));

		//-----------------------------------------------------
		
		double random = Math.random();
		System.out.println(random);
		
		double mult = random * 5;
		System.out.println(mult);
		
		System.out.println(Math.ceil(mult));
		
		double min = 5;
		double max = 10;
		
		double preparandoIntervalo = random * (max - min);
		System.out.println("Preparando intervalo: " + preparandoIntervalo);
		
		double intervalo = min + random * (max - min);
		System.out.println("Intervalo: " + intervalo);
	}

}
