package semana_01;

public class Expositor {
	public int codigo, horasTrabajadas;
	public String nombre;
	public double  tarifaHora;
	
	public double sueldoBruto() {
		return tarifaHora * horasTrabajadas;
	}
	
	public double descuentoEPS() {
		return 0.05*sueldoBruto();
	}
	
	public double descuentoAFP() {
		return 0.1*sueldoBruto();
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAFP() - descuentoEPS();
	}
}
