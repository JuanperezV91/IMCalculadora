package IMC;


public class Calculadora {
	
	public static void imc(float altura, float peso) {
		
		float imc=peso/(altura*altura);
		
		String rango= "";
		String rangoFinal="";
		 
		if ( imc<=15 ) { 
			rango = "Delgadez muy severa";
			rangoFinal = rango;
		}
		
		else if ( imc>15 && imc<16 ) {
			rango = "Delgadez severa";
			rangoFinal = rango;
		}		

		else if ( imc>=16 && imc<=18.4 ) {
			rango = "Delgadez";
			rangoFinal = rango;
		}
		
		else if ( imc>=18.5 && imc<=24.9 ) {
			rango = "Peso saludable";
			rangoFinal = rango;
		}
		
		else if ( imc>=25 && imc<=29.9 ) {
			rango = "Sobrepeso";
			rangoFinal = rango;
		}
		
		else if ( imc>=30 && imc<34.9 ) {
			rango = "Obesidad severa";
			rangoFinal = rango;
		}
		
		else if ( imc>=35 ) {
			rango = "Obesidad morbida";
			rangoFinal = rango;
		}
		
		System.out.println("IMC: " + imc + " || Rango: " + rangoFinal);
	}

}
