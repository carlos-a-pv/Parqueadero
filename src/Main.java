import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parqueadero parqueadero = new Parqueadero();
		//Llenao inicial del arreglo cuposCarros con ceros  
		for (int i = 0; i < parqueadero.getCuposCarros().length; i++) {
			parqueadero.setCuposCarros(i, 0);
		}
		//Llenao inicial del arreglo cuposMotos con ceros  
		for (int i = 0; i < parqueadero.getCuposMotos().length; i++) {
			parqueadero.setCuposMotos(i, 0);
		}
		
		Vehiculo vehiculo1 = new Vehiculo("carro", "abc" );
		if(parqueadero.administrarCupos(vehiculo1.getTipoVehiculo()) == true) {
			System.out.println("SI HAY CUPO!!!");
		}
		
		vehiculo1.setHoraLlegada(12);
		vehiculo1.setHoraSalida(14);
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------
		//Vehiculo vehiculo2 = new Vehiculo("moto", "abc" );
		//RegistroParqueadero registro1 = new RegistroParqueadero(12, 3);
		
		
		
	}

}
