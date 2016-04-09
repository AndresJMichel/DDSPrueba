package drcasa;

public class Infecciosa {

	private Object cantidadCelulasAmenazadas;

	public void setCantidadCelulasAmenazadas(int cantidadCelulasAmenazadas) {
		// TODO Auto-generated method stub
		this.cantidadCelulasAmenazadas = cantidadCelulasAmenazadas;
		
	}

	public boolean esAgresiva(Persona unaPersona) {
		// TODO Auto-generated method stub
		return unaPersona.getCantidadCelulasTotales() * 0.1 < this.cantidadCelulasAmenazadas;
	}


}
