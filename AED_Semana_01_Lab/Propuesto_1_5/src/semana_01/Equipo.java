package semana_01;

public class Equipo {
	public int codigo;
	public double precioDolares;
	public String marca,color;
	
	public double precioSol() {
		return precioDolares * 3.65;
	}
	
	public double precioEuro() {
		return precioDolares/1.2;
	}
	
}
