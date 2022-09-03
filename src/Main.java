import java.time.LocalTime;
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
			vehiculo1.setHoraIngreso(0, 0);
			vehiculo1.setHoraSalida(1, 20);
			
			LocalTime tiempoTotal = parqueadero.calcularTiempoTotal(vehiculo1.getHoraLlegada(), vehiculo1.getHoraSalida());
			System.out.println("El tiempo final es: " +tiempoTotal);
			
			System.out.println(parqueadero.calcularValorTotal(tiempoTotal, vehiculo1.getTipoVehiculo()));
		}else{
			System.out.println("NO HAY CUPO!!!");
				
		}
		
	
		
		
		
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------
		//Vehiculo vehiculo2 = new Vehiculo("moto", "abc" );
		//RegistroParqueadero registro1 = new RegistroParqueadero(12, 3);
		
		
		
	}

}
