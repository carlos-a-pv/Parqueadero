import java.util.Iterator;

public class Parqueadero {
	
	private String nombreParqueadero = "Don Pedro";
	private int[] cuposMotos = new int[125];
	private int[] cuposCarros = new int[60];
	private int valorCuartoHoraMoto = 200;
	private int valorHoraMoto = 700;
	private int valorCuartoHoraCarro = 500;
	private int valorHoraCarro = 1800;
	
	public void setCuposCarros(int indice, int numero) {
		this.cuposCarros[indice] = numero;
	}
	public int[] getCuposCarros(){
		return this.cuposCarros;
	}
	public void setCuposMotos(int indice, int numero) {
		this.cuposMotos[indice] = numero;
	}
	
	public int[] getCuposMotos(){
		return this.cuposMotos;
	}

}
