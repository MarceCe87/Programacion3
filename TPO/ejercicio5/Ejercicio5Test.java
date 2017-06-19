package ejercicio5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class Ejercicio5Test {

	List<ElementoMochilaDyn>elementos = new ArrayList();
	SolucionEjercicio5 s = new SolucionEjercicio5();
	
	@Before
	public void agregarElementos(){
		ElementoMochilaDyn m= new ElementoMochilaDyn();
		ElementoMochilaDyn a= new ElementoMochilaDyn();
		ElementoMochilaDyn b= new ElementoMochilaDyn();
		ElementoMochilaDyn x = new ElementoMochilaDyn();
		x.setPeso(0);
		x.setGanancia(0);
		elementos.add(x);
		m.setPeso(1);
		m.setGanancia(2);
		elementos.add(m);
		a.setPeso(2);
		a.setGanancia(2);
		elementos.add(a);
		b.setPeso(2);
		b.setGanancia(3);
		elementos.add(b);
		
		s.setCapacidad(4);
		
	}
	
	@Test
	public void testMaximaGanancia() {
		int resultadoReal = Ejercicio5.MaximaGanancia(elementos, s);
		float resultadoEsperado = 5.0f;
		assertEquals(resultadoEsperado,resultadoReal,0.01);
	}

}
