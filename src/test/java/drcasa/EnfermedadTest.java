package drcasa;

import org.junit.Assert;
import org.junit.Test;

public class EnfermedadTest {

	//con eso hago todo
	@Test
	public void unaEnfermedadInfecciosaEsAgresiva() {
		// precondiciones escenario
		Infecciosa malaria = new Infecciosa();
		Persona frank = new Persona();
		frank.setCantidadCelulasAmenazadas(1000);
		malaria.setCantidadCelulasAmenazadas(100);
		// se hace algo
		boolean esAgresiva = malaria.esAgresiva(frank);
		// postcondiciones se verifica
		Assert.assertTrue(esAgresiva);
	}

}
