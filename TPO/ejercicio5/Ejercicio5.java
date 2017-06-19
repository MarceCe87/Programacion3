package ejercicio5;

import java.util.List;


public class Ejercicio5 {
	
	public static SolucionEjercicio5 Ejercicio5(List<ElementoMochilaDyn> lista){
		
		SolucionEjercicio5 s = new SolucionEjercicio5();
		MaximaGanancia(lista,s);
		
		return s;
	}
	
	public static int MaximaGanancia(List<ElementoMochilaDyn> elementos, SolucionEjercicio5 s){
		
		int longVector= elementos.size();
		int[][] matriz= new int[longVector+1][s.capacidad+1];
		for(int i=0; i< longVector;i++)
		{
			matriz[i][0]= 0;
			s.instrucciones++;	
		}
		for(int j=0;j<s.capacidad+1;j++){
			matriz[0][j]=0;
			s.instrucciones++;
		}
		for(int i=1;i<longVector;i++){
			for(int j=1;j<s.capacidad+1;j++){
				if(j-elementos.get(i).getPeso()>=0){
					matriz[i][j]=Math.max(elementos.get(i).getGanancia()
							+matriz[i-1][j-elementos.get(i).getPeso()]
							,matriz[i-1][j]);
					s.instrucciones++;
				}
				else{
					matriz[i][j]= matriz[i-1][j];
					s.instrucciones++;
				}
			}
		}
		return matriz[longVector-1][s.capacidad];
		
	}
	}
	

