package semana_01;

public class Persona {
	// Atributos
		public int edad;
		public double estatura,peso;
		public String nombre,apellido;
			
	// Constructor
		
	// Métodos
		public String estadoPersona() {
			if(edad >= 18) {
				String msg = "Mayor de edad";
				return msg;
			} else if (edad < 18){
				String msg = "Mayor de edad";
				return msg;
			} else {
				String msg = "Error";
				return msg;
			}
			
		}
		
		public Double indiceMasaC() {
			return peso/(estatura * estatura);
		}
}

