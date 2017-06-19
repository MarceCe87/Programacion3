package ejercicio2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Ejercicio2Test {

	List<Tarea>lista = new ArrayList();
	SolucionEjercicio2 s = new SolucionEjercicio2();
	
	@Before
	public void agregarElementos(){
		Tarea e1 = new Tarea(1,2);
		lista.add(e1);
		Tarea e5 = new Tarea(9,24);
		lista.add(e5);
		Tarea e4 = new Tarea(8,20);
		lista.add(e4);
		Tarea e3 = new Tarea(4,12);
		lista.add(e3);
		Tarea e2 = new Tarea(2,3);
		lista.add(e2);
		
		s.setTiempoTotal(10);
		
	}
	
	@Test
	public void testMaxActividades() {
		int resultadoReal = Ejercicio2.MaxActividades(lista, s);
		float resultadoEsperado = 3.0f;
		assertEquals(resultadoEsperado,resultadoReal,0.01);
	}
}
