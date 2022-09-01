public class Vehiculo {
	
	private String placa = "";
	private String tipoVehiculo = "";
	private int horaLlegada;
	private int horaSalida;
	
	public Vehiculo(String tipoVehiculo, String placa) {
		this.tipoVehiculo = tipoVehiculo;
		this.placa = placa;
	}
	
	public String getTipoVehiculo() {
		return this.tipoVehiculo;
	}
	
	public void setHoraLlegada(int horaLllegada) {
		this.horaLlegada = horaLllegada;
	}
	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public int getHoraLlegada() {
		return this.horaLlegada;
	}
	public int getHoraSalida() {
		return this.horaSalida;
	}
	
}


