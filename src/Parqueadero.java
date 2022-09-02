import java.util.Iterator;
import java.time.LocalTime;

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

	public LocalTime calcularTiempoTotal(LocalTime horaIngreso, LocalTime horaSalida) {
		//Conversion de tipos de datos (de LocalTime a String)
		String tiempo1 = String.valueOf(horaIngreso);
		String tiempo2 = String.valueOf(horaSalida);
		
		//Division de las horas y los minutos de la hora de ingreso
		String[] partsHoraIngreso = tiempo1.split(":");
		String tiempoHoras1 = partsHoraIngreso[0];
		String tiempoMinutos1 = partsHoraIngreso[1];
		
		//Division de las horas y los minutos de la hora de salida
		String[] partsHoraSalida = tiempo2.split(":");
		String tiempoHoras2 = partsHoraSalida[0];
		String tiempoMinutos2 = partsHoraSalida[1];
		
		//Conversion de tipos de datos (de String a Int) para poder operar
		int tiempoHora1Numero = Integer.parseInt(tiempoHoras1);
		int tiempoMinutos1Numero = Integer.parseInt(tiempoMinutos1);
		
		int tiempoHora2Numero = Integer.parseInt(tiempoHoras2);
		int tiempoMinutos2Numero = Integer.parseInt(tiempoMinutos2);
		
		//Calculo
		int horasFinal = tiempoHora2Numero - tiempoHora1Numero;
		int minutosFinal = tiempoMinutos2Numero - tiempoMinutos1Numero;
		
		//conversion de datos
		//String horaFinalString = String.valueOf(horasFinal);
		//String minutosFinalString = String.valueOf(minutosFinal);
		//Unión de los dos Strings (horas y minutos)
		//String tiempoFinal = String.join(horaFinalString,":",minutosFinalString);
		LocalTime tiempoTotal = LocalTime.of(horasFinal, minutosFinal);
		
		return tiempoTotal;
		
	}
		
		public double calcularValorTotal(Vehiculo vehiculo1,int tiempoTotal, String tipoVehiculo) {
			
			double valorTotal=0.0;
			
			if(vehiculo1.getTipoVehiculo().equals("carro")) {
				
				if (tiempoTotal<=15) {
					valorTotal=tiempoTotal *500;
				}
				if(tiempoTotal>15 && tiempoTotal<=59) {
					valorTotal=tiempoTotal *1000;
				}
				if(tiempoTotal==60) {
					valorTotal=tiempoTotal *1800;
				}
			}
				
			else {
				if (tiempoTotal<=15) {
					valorTotal=tiempoTotal *200;
				}
				if(tiempoTotal>15 && tiempoTotal<=59) {
					valorTotal=tiempoTotal *400;
				}
				if(tiempoTotal==60) {
					valorTotal=tiempoTotal *700;
				}	
				
			}	
					
			return valorTotal;
			}
			
	
	//Aqui lo que hace es por medio del metodo set es llenar el arreglo cuposMotos lo mismo con set carros
	public void setCuposMotos(int indice, int numero) {
		this.cuposMotos[indice] = numero;
	}
	
	//con este metodo me retorna el arreglo cuposMotos y lo mismo hace en get carros
	public int[] getCuposMotos(){
		return this.cuposMotos;
	}
	public void setCuposCarros(int indice, int numero) {
		this.cuposCarros[indice] = numero;
	}
	public int[] getCuposCarros(){
		return this.cuposCarros;
	}
}
