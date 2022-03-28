package semana_01;

public class Caja {
	public double largo,ancho,alto,peso;
	
	public double volumen() {
		return largo*ancho*alto;
	}
	
	public double pesoVolumetrico() {
		return volumen()/5000;
	}
	
	public double pesoFacturable() {
		if(peso > pesoVolumetrico()) {
			return peso;
		} else {
			return pesoVolumetrico();
		}
		
	}
}
