package ejercicio2;

import java.util.List;

public class Ejercicio2 {

	public static SolucionEjercicio2 Ejercicio2(List<Tarea> lista){
		
		SolucionEjercicio2 s = new SolucionEjercicio2();		
		MaxActividades(lista, s);
		
		return s;
	}
	
	private static void ordenarTareas(List<Tarea> lista){
		Tarea aux;
        for(int i=0;i<lista.size()-1;i++)
             for(int j=0;j<lista.size()-i-1;j++)
                  if(lista.get(j+1).getFin()<lista.get(j).getFin()){
                     aux=lista.get(j+1);
                     lista.set(j+1, lista.get(j));
                     lista.set(j,aux);
 
                  }
}
	public static int MaxActividades(List<Tarea> lista, SolucionEjercicio2 s){
		int i=0;
		int cantidad=0;
		int t = s.getTiempoTotal();
		
		ordenarTareas(lista);
		
		
		if(t>=lista.get(i).getDuracion()){
			cantidad=1;
			t=t-lista.get(i).getDuracion();
			i++;
		}
		while(i<lista.size())
		{
			if(t>=lista.get(i).getDuracion())
			{
				if(lista.get(i).getInicio()>=lista.get(i-1).getFin()){
					cantidad= cantidad+1;
					t=t-lista.get(i).getDuracion();
				}
				
			}
			i++;	
		}
		return cantidad;
	}
	
}
