public class Parqueadero {

	private String nombreParqueadero = "Don Pedro";
	private int[] cuposMotos = new int[125];
	private int[] cuposCarros = new int[60];
	private int valorCuartoHoraMoto = 200;
	private int valorHoraMoto = 700;
	private int valorCuartoHoraCarro = 500;
	private int valorHoraCarro = 1800;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo1 = new Vehiculo("carro", "abc" );
		vehiculo1.setHoraLlegada(12);
		vehiculo1.setHoraSalida(14);
		
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
				for (int i = 0; i < cuposMotos; i++) {

					if(cuposMotos[i]==0) {
						cuposMotos[i]=1;
						return true;
					}
				}
				return false;
			}




		}
		
		
	}

}
