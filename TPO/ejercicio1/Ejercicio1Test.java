package ejercicio1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Ejercicio1Test {

	List<Punto>lista = new ArrayList();
	SolucionEjercicio1 s = new SolucionEjercicio1();
	
	@Before
	public void agregarElementos(){
		Punto e1= new Punto(2,7);
		lista.add(e1);
		Punto e2= new Punto(20,50);
		lista.add(e2);
		Punto e3= new Punto(5,9);
		lista.add(e3);
		Punto e4= new Punto(1,1);
		lista.add(e4);
		Punto e5= new Punto(2,2);
		lista.add(e5);
		Punto e6= new Punto(9,15);
		lista.add(e6);
	}
	
	@Test
	public void testMenorDistancia() {
		int resultadoReal = Ejercicio1.menorDistancia(lista, s);
		float resultadoEsperado = 1.0f;
		assertEquals(resultadoEsperado,resultadoReal,1);
	}
}
