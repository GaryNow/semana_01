package semana_01;

public class Coordinador {
	// Atributos
		public String nombre;
		public int codigo,categoria,celular;
	// Constructor
	
	// Métodos
		public int sueldo() {
			int sueldo = 0;
			if (categoria == 0)	sueldo = 8500;
			if (categoria == 1)	sueldo = 6850;
			if (categoria == 2)	sueldo = 5500;
					
			return sueldo;
		}
}
