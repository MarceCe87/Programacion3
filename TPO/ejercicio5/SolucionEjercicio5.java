package ejercicio5;


public class SolucionEjercicio5 {
	public ElementoMochilaDyn mochila;
	public int instrucciones;
	public int capacidad;
	

	public ElementoMochilaDyn getMochila() {
		return mochila;
	}
	public void setMochila(ElementoMochilaDyn mochila) {
		this.mochila = mochila;
	}
	public int getInstrucciones() {
		return instrucciones;
	}
	public void setInstrucciones(int instrucciones) {
		this.instrucciones = instrucciones;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	/*
	public int maximaGanancia(ArrayList<ElementoMochilaDyn> elementos, int capacidad){
		
		int longVector= elementos.size();
		int[][] matriz= new int[longVector+1][capacidad+1];
		for(int i=0; i< longVector;i++)
		{
			matriz[i][0]= 0;
		}
		for(int j=0;j<capacidad;j++){
			matriz[0][j]=0;
		}
		for(int i=1;i<longVector;i++){
			for(int j=1;j<capacidad;j++){
				if(j-elementos.get(i).getPeso()>=0){
					matriz[i][j]=Math.max(elementos.get(i).getGanancia()
							+matriz[i-1][j-elementos.get(i).getPeso()]
							,matriz[i-1][j]);	
					System.out.println("Elemento "+i+j+": "+matriz[i][j]);
				}
				else
					matriz[i][j]= matriz[i-1][j];
				   System.out.println("Elemento "+i+j+": "+matriz[i][j]);
			}
		}
		return matriz[longVector][capacidad];
		
	}*/
}
