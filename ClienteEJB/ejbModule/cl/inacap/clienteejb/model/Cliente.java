package cl.inacap.clienteejb.model;

public class Cliente {
	String rut;
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	
	public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
			+ ", apellidoMaterno=" + apellidoMaterno + "]";
	}
}
