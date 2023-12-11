package cl.inacap.clienteejb.business;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.clienteejb.model.Cliente;

/**
 * Session Bean implementation class Servicio
 */
@Stateless
@LocalBean
public class Servicio implements ServicioLocal {
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    /**
     * Default constructor. 
     */
    public Servicio() {
        clientes.add(new Cliente("1", "Daniel", "Alvarez", "Zamorano"));
    }

	@Override
	public void saveCliente(Cliente cl) {
		clientes.add(cl);
	}

	@Override
	public Cliente findCliente(String rut) {
		for (Cliente cl : clientes) {
			if (rut.equalsIgnoreCase(cl.getRut())) {
				return cl;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	@Override
	public String deleteCliente(String rut) {
		Cliente cl = findCliente(rut);
		if (cl == null) {
			return "El cliente no existe";
		}
		else {
			clientes.remove(cl);
			return "Cliente eliminado";
		}
		
	}

	@Override
	public String updateCliente(Cliente cl) {
		return "Cliente modificado";
	}
}
