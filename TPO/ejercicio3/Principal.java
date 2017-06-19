package ejercicio3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Principal {
	
	
	public static SoluciónEjercicio3 Ejercicio3(Grafo g){
		
		SoluciónEjercicio3 s3 = new SoluciónEjercicio3();
		
		// Inicizlizo las Particiones
		HashMap<Vertice, Integer> dic = Inicializar(g, s3);
		
		// Ordeno las aristas
		Collections.sort(g.A, new Comparator<Arista>(){
			  public int compare(Arista a1, Arista a2){
			    return a1.Peso > a2.Peso? 1 : 0;
			  }
			});
		
		for(Iterator<Arista> a = g.A.iterator(); a.hasNext();){
			Arista ar = (Arista) a;
			if(dic.get(ar.Origen) != dic.get(ar.Destino)){
				UnirParticiones(dic, ar, s3);
				s3.Sumatoria += ar.Peso; 
			}
			s3.Cantidad++;
		}
		
		return s3;		
	}	
	
	private static HashMap<Vertice, Integer> Inicializar (Grafo g, SoluciónEjercicio3 s3)
	{
		HashMap<Vertice, Integer> dic =  new HashMap();
		int cant = 1;
		
		for(Iterator<Vertice> i = g.V.iterator(); i.hasNext();){
			s3.Cantidad++;
			dic.put((Vertice) i, cant);
			cant++;
		}				
		return dic;
	}
	
	private static void UnirParticiones(HashMap<Vertice, Integer> dic, Arista a, SoluciónEjercicio3 s3){
		
		int max = MAX((int)dic.get(a.Origen), (int)dic.get(a.Destino));
		int min = MIN((int)dic.get(a.Origen), (int)dic.get(a.Destino));
		
		for(Map.Entry<Vertice, Integer> entry : dic.entrySet()){
			
			if(dic.get(entry) == max)
				dic.put((Vertice) entry, min);
			
			s3.Cantidad++;		
		}			
	}
	
	private static int MAX(int o, int d){		
		return o > d ? o: d;  
	}
	
	private static int MIN(int o, int d){		
		return o > d ? d: o;  
	}
}
