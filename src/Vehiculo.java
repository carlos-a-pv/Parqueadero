import java.time.LocalTime;

public class Vehiculo {
	
	private String placa = "";
	private String tipoVehiculo = "";
	private LocalTime horaLlegada;
	private LocalTime horaSalida;
	
	public Vehiculo(String tipoVehiculo, String placa) {
		this.tipoVehiculo = tipoVehiculo;
		this.placa = placa;
	}
	
	public String getTipoVehiculo() {
		return this.tipoVehiculo;
	}
	
	public void setHoraIngreso(int horas, int minutos) {
		this.horaLlegada = LocalTime.of(horas,minutos);
	}
	public void setHoraSalida(int horas, int minutos) {
		this.horaSalida = LocalTime.of(horas,minutos);
	}
	
	public LocalTime getHoraLlegada() {
		return this.horaLlegada;
	}
	public LocalTime getHoraSalida() {
		return this.horaSalida;
	}
	
}


