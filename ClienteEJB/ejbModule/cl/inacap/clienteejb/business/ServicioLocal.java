package cl.inacap.clienteejb.business;

import java.util.ArrayList;

import javax.ejb.Local;

import cl.inacap.clienteejb.model.Cliente;

@Local
public interface ServicioLocal {
	public void saveCliente(Cliente cl);
	Cliente findCliente(String rut);
	ArrayList<Cliente> getClientes();
	String deleteCliente(String rut);
	String updateCliente(Cliente cl);
}

