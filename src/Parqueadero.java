import java.util.Iterator;

public class Parqueadero {
	
	private String nombreParqueadero = "Don Pedro";
	private int[] cuposMotos = new int[125];
	private int[] cuposCarros = new int[60];
	private int valorCuartoHoraMoto = 200;
	private int valorHoraMoto = 700;
	private int valorCuartoHoraCarro = 500;
	private int valorHoraCarro = 1800;
	
		
//---------------------------------------------------------------------------------------------
		//Vehiculo vehiculo2 = new Vehiculo("moto", "abc" );
		//RegistroParqueadero registro1 = new RegistroParqueadero(12, 3);
		
		public boolean administrarCupos(String tipoVehiculo){

			if (tipoVehiculo.equals("carro")){
				for (int i = 0; i < cuposCarros.length; i++) {
					if(cuposCarros[i]==0) {
						cuposCarros[i]=1;
						return true;
					}
				}
				return false;
			}

			else {
				for (int i = 0; i < cuposMotos.length; i++) {

					if(cuposMotos[i]==0) {
						cuposMotos[i]=1;
						return true;
					}
				}
				return false;
			}


	}
	public void setCuposMotos(int indice, int numero) {
		this.cuposMotos[indice] = numero;
	}
	
	public int[] getCuposMotos(){
		return this.cuposMotos;
	}
	public void setCuposCarros(int indice, int numero) {
		this.cuposCarros[indice] = numero;
	}
	public int[] getCuposCarros(){
		return this.cuposCarros;

}}
