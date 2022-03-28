package semana_01;

public class Trabajador {
	public int codigo,horasTrabajadas;
	public double tarifaHora;
	public String nombre;
	
	public double sueldo() {
		return horasTrabajadas - tarifaHora;
	}
}
