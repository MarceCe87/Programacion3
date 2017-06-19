package ejercicio4;

import java.util.List;

import ejercicio5.ElementoMochilaDyn;
import ejercicio5.SolucionEjercicio5;

public class Ejercicio4 {

	public static SolucionEjercicio4 Ejercicio4(List<ElementoMochila> lista){
		
		SolucionEjercicio4 s = new SolucionEjercicio4();
		maximaGanancia(s,lista,s.capacidad);
		
		return s;
	}
	
	public static int maximaGanancia(SolucionEjercicio4 s,List<ElementoMochila> lista, int capacidad){
		int resultado=0;
		if(s.capacidad<0){
			resultado=-1;
		}
		else if(s.capacidad>0 && lista.size()>0)
		{
			
			for(int i=0; i<lista.size();i++)
			{
				resultado=Math.max(s.getMochila().getGanancia()
						+maximaGanancia(s,lista.get(i+1),s.capacidad-lista.get(i).getPeso())
						,maximaGanancia(s,lista.get(i+1),s.getCapacidad()));
			}
			
		}
		return resultado;	
	}	
}
