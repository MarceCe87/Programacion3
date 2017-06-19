package ejercicio1;

import java.util.*;
import java.lang.*;

public class Ejercicio1 {	
	
	public static SolucionEjercicio1 Ejercicio1(List<Punto> lista){
		
		SolucionEjercicio1 s = new SolucionEjercicio1();		
		menorDistancia(lista, s);
		
		return s;
	}
	
	// Lista de puntos ordenada por la coordenada X
	public static int menorDistancia(List<Punto> lista, SolucionEjercicio1 s){					
		int n = lista.size(); 
		
		s.instrucciones++;		
		if(n <= 3)
			return fuerzaBruta(lista, n, s);
			
		// Mitad de la lista
		int mitad = n/2;			
	    Punto puntomedio = lista.get(mitad);
	 

	    // Lista con la mitad izquierda
	    int dl = menorDistancia(dividirLista(lista, true), s);
	    // Lista con la mitad derecha
	    int dr = menorDistancia(dividirLista(lista, false), s);
	 
	    // Menor distancia
	    int distMin = min(dl, dr);	    
	 
	    // Lista con los puntos mas cercanos a una linea divisoria 	
		List<Punto> listaRectaDivisoria = new ArrayList<Punto>();
		int j = 0;
	    for (int i = 0; i < n; i++){
	        if ((lista.get(i).x - puntomedio.x) < distMin){
	        	listaRectaDivisoria.add(lista.get(i));
	            j++;
	        }		        		
	    }
	 
	    return min(distMin, distanciaRectaDivisoria(listaRectaDivisoria, j, distMin) );
	}
	
	
	// Métodos auxiliares privados
	private static int fuerzaBruta(List<Punto> l, int n, SolucionEjercicio1 s)
	{
		// Siendo 1000 el valor maximo permitido para las coordenadas del punto
	    int min = 1000;
	    
	    for (int i = 0; i < n; ++i)
	        for (int j = i+1; j < n; ++j)
	            if (distancia(l.get(i), l.get(j)) < min){
	                min = distancia(l.get(i), l.get(j));
	                s.punto1 =l.get(i);
	                s.punto2 = l.get(j);
	            }
	    
	    return min;
	}
	 	
	private static int distancia(Punto p1, Punto p2 ){
		return (int)Math.sqrt((Math.pow(p2.x-p1.x, 2) + Math.pow(p2.y-p1.y, 2)));
	}
	
	private static int min(int a, int b){
		return a > b ? b: a; 
	}
	
	private static List<Punto> dividirLista(List<Punto> listaOrigen, boolean desdeInicio){
		
		List<Punto> listaRetorno = new ArrayList<Punto>();
		// listaOrigen debe estar ordenada por la coordenada Y
		
		int m = listaOrigen.size() / 2;
		if(desdeInicio){			
			for(int i = 0; i < m; i ++)
				listaRetorno.add(listaOrigen.get(i));
		}else{
			for(int i = m; i < listaOrigen.size(); i ++)
				listaRetorno.add(listaOrigen.get(i));
		}
				
		return listaRetorno;
	}
	
	private static	int distanciaRectaDivisoria(List<Punto> listaRectaDivisoria, int tamaño, int d)
	{
	    int min = d;
	 	    	 	   
	    for (int i = 0; i < tamaño; ++i)
	        for (int j = i+1; j < tamaño && (listaRectaDivisoria.get(j).y - listaRectaDivisoria.get(i).y) < min; ++j)
	            if (distancia(listaRectaDivisoria.get(i),listaRectaDivisoria.get(j)) < min)
	                min = distancia(listaRectaDivisoria.get(i), listaRectaDivisoria.get(j));	 
	    return min;
	}
	
}