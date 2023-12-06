package cl.inacap.clientewar.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.clienteejb.business.ServicioLocal;
import cl.inacap.clienteejb.model.Cliente;

/**
 * Servlet implementation class ClienteControlador
 */
@WebServlet("/ClienteControlador")
public class ClienteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    private ServicioLocal servicioLocal;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rut = request.getParameter("rut");
		String boton = request.getParameter("boton");
		
		switch (boton) {
		case "1":
			String nombre = request.getParameter("nombre");
			String apellidoPaterno = request.getParameter("apellidoPaterno");
			String apellidoMaterno = request.getParameter("apellidoMaterno");
			Cliente cl = new Cliente(rut, nombre, apellidoPaterno, apellidoMaterno);
			servicioLocal.saveCliente(cl);
			response.sendRedirect("mostrar.jsp");
			break;
		case "2":
			String mensaje = servicioLocal.deleteCliente(rut);
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("eliminar.jsp").forward(request, response);
			break;
		case "3":
			 Cliente cli = servicioLocal.findCliente(rut);
			 request.setAttribute("cliente", cli);
			 request.getRequestDispatcher("modificar.jsp").forward(request, response);
			 servicioLocal.deleteCliente(rut);
			break;
		case "4":
			String nombreModificar = request.getParameter("nombre");
			String apellidoPaternoModificar = request.getParameter("apellidoPaterno");
			String apellidoMaternoModificar = request.getParameter("apellidoMaterno");
			Cliente cliente = new Cliente(rut,nombreModificar, apellidoPaternoModificar, apellidoMaternoModificar);
			servicioLocal.saveCliente(cliente);
			mensaje = "Cliente modificado";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("modificar.jsp").forward(request, response);
			break;
		default:
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
