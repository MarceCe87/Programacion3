package ejercicio2;

public class Tarea {
	private int inicio;
	private int fin;
	private int duracion;
	
	
	
	public Tarea(int inicio, int fin) {
		super();
		this.inicio = inicio;
		this.fin = fin;
		this.duracion = fin-inicio;
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getFin() {
		return fin;
	}
	public void setFin(int fin) {
		this.fin = fin;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = this.duracion;
	}
}
