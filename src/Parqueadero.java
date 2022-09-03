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
	// Vehiculo vehiculo2 = new Vehiculo("moto", "abc" );
	// RegistroParqueadero registro1 = new RegistroParqueadero(12, 3);

	public boolean administrarCupos(String tipoVehiculo) {
		if (tipoVehiculo.equals("carro")) {
			for (int i = 0; i < cuposCarros.length; i++) {
				if (cuposCarros[i] == 0) {
					cuposCarros[i] = 1;
					return true;
				}
			}
			return false;
		}

		else {
			for (int i = 0; i < cuposMotos.length; i++) {

				if (cuposMotos[i] == 0) {
					cuposMotos[i] = 1;
					return true;
				}
			}
			return false;
		}
	}

	public LocalTime calcularTiempoTotal(LocalTime horaIngreso, LocalTime horaSalida) {
		// Conversion de tipos de datos (de LocalTime a String)
		String tiempo1 = String.valueOf(horaIngreso);
		String tiempo2 = String.valueOf(horaSalida);

		// Division de las horas y los minutos de la hora de ingreso
		String[] partsHoraIngreso = tiempo1.split(":");
		String tiempoHoras1 = partsHoraIngreso[0];
		String tiempoMinutos1 = partsHoraIngreso[1];

		// Division de las horas y los minutos de la hora de salida
		String[] partsHoraSalida = tiempo2.split(":");
		String tiempoHoras2 = partsHoraSalida[0];
		String tiempoMinutos2 = partsHoraSalida[1];

		// Conversion de tipos de datos (de String a Int) para poder operar
		int tiempoHora1Numero = Integer.parseInt(tiempoHoras1);
		int tiempoMinutos1Numero = Integer.parseInt(tiempoMinutos1);

		int tiempoHora2Numero = Integer.parseInt(tiempoHoras2);
		int tiempoMinutos2Numero = Integer.parseInt(tiempoMinutos2);

		// Calculo
		int horasFinal = tiempoHora2Numero - tiempoHora1Numero;
		int minutosFinal = tiempoMinutos2Numero - tiempoMinutos1Numero;

		// conversion de datos
		// String horaFinalString = String.valueOf(horasFinal);
		// String minutosFinalString = String.valueOf(minutosFinal);
		// Unión de los dos Strings (horas y minutos)
		// String tiempoFinal = String.join(horaFinalString,":",minutosFinalString);
		LocalTime tiempoTotal = LocalTime.of(horasFinal, minutosFinal);

		return tiempoTotal;

	}

	public double calcularValorTotal(LocalTime tiempoTotal, String tipoVehiculo) {

		String tiempo = String.valueOf(tiempoTotal);

		String[] partsTiempo = tiempo.split(":");
		String horas = partsTiempo[0];
		String minutos = partsTiempo[1];

		int horasNumero = Integer.parseInt(horas);
		int minutosNumero = Integer.parseInt(minutos);

		System.out.println(minutosNumero);
		if (minutosNumero < 45 && horasNumero == 0) {

			if (tipoVehiculo.equals("carro")) {
				if (minutosNumero % 15 == 0) {
					return (minutosNumero / 15) * valorCuartoHoraCarro;
				} else {
					return (minutosNumero / 15) * valorCuartoHoraCarro + valorCuartoHoraCarro;
				}

			} else {
				if (minutosNumero % 15 == 0) {
					return (minutosNumero / 15) * valorCuartoHoraMoto;					
				}else {
					return (minutosNumero / 15) * valorCuartoHoraMoto + valorCuartoHoraCarro;
				}

			}
		}

		else if (minutosNumero >= 45 && horasNumero == 0 || minutosNumero < 60 && horasNumero == 0) {

			if (tipoVehiculo.equals("carro")) {

				return valorHoraCarro;
			}

			else {

				return valorHoraMoto;
			}
		} else if (horasNumero > 0 && minutosNumero > 0) {
			if (tipoVehiculo.equals("carro")) {

				return (horasNumero * valorHoraCarro) + valorHoraCarro;
			} else {
				return (horasNumero * valorHoraMoto) + valorHoraMoto;
			}
		} else if (horasNumero > 0 && minutosNumero == 0) {
			if (tipoVehiculo.equals("carro")) {

				return (horasNumero * valorHoraCarro);
			} else {
				return (horasNumero * valorHoraMoto);
			}

		}
		return 0;
	}

	// Aqui lo que hace es por medio del metodo set es llenar el arreglo cuposMotos
	// lo mismo con set carros
	public void setCuposMotos(int indice, int numero) {
		this.cuposMotos[indice] = numero;
	}

	// con este metodo me retorna el arreglo cuposMotos y lo mismo hace en get
	// carros
	public int[] getCuposMotos() {
		return this.cuposMotos;
	}

	public void setCuposCarros(int indice, int numero) {
		this.cuposCarros[indice] = numero;
	}

	public int[] getCuposCarros() {
		return this.cuposCarros;
	}
}
