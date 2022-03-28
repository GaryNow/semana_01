package semana_01;

public class Numeros {
	public int numero1,numero2,numero3;
	
	public int numeroMayor() {
		int mayor = 0;
		if ( (numero1 > numero2) && (numero2 > numero3)) mayor = numero1;
		if ( (numero1 > numero3) && (numero3 > numero2)) mayor = numero1;
		if ( (numero2 > numero1) && (numero1 > numero3)) mayor = numero2;
		if ( (numero2 > numero3) && (numero3 > numero1)) mayor = numero2;
		if ( (numero3 > numero1) && (numero1 > numero2)) mayor = numero3;
		if ( (numero3 > numero2) && (numero2 > numero1)) mayor = numero3;
		return mayor;
	}
	
	public int numeroMenor() {
		int menor = 0;
		if ( (numero1 > numero2) && (numero2 > numero3)) menor = numero3;
		if ( (numero1 > numero3) && (numero3 > numero2)) menor = numero2;
		if ( (numero2 > numero1) && (numero1 > numero3)) menor = numero3;
		if ( (numero2 > numero3) && (numero3 > numero1)) menor = numero1;
		if ( (numero3 > numero1) && (numero1 > numero2)) menor = numero2;
		if ( (numero3 > numero2) && (numero2 > numero1)) menor = numero1;
		return menor;
	}
	
	public int numeroMedio() {
		int medio = 0;
		if ( (numero1 > numero2) && (numero2 > numero3)) medio = numero2;
		if ( (numero1 > numero3) && (numero3 > numero2)) medio = numero3;
		if ( (numero2 > numero1) && (numero1 > numero3)) medio = numero1;
		if ( (numero2 > numero3) && (numero3 > numero1)) medio = numero3;
		if ( (numero3 > numero1) && (numero1 > numero2)) medio = numero1;
		if ( (numero3 > numero2) && (numero2 > numero1)) medio = numero2;
		return medio;
	}
}
