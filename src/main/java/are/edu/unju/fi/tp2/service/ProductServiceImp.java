package are.edu.unju.fi.tp2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import are.edu.unju.fi.tp2.model.Producto;
@Service
public class ProductServiceImp implements IProductoService{
	private static final Log LUIS = LogFactory.getLog(ProductServiceImp.class);
	//como se hace la solucion del problema
			//guardar en Array		
			//guarde en una BD MySQL		
			//guarde en una DB Oracle
	@Autowired
	Producto unProducto;
	//estoy creando una estructura que guardará todos los productos
		ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	@Override
	public void guardarProducto(Producto unProducto) {
		// TODO Auto-generated method stub
		//esta línea la puse solo para que escriba en la consola el nombre del producto que llega
				//una línea que me sirve a mí de control
				//un log artesanal
				System.out.println(unProducto.getNombre());
				listaDeProductos.add(unProducto);

				//otra línea de control
				//quiero saber cuántos elementos hay en el arreglo
				System.out.println(listaDeProductos.size());
				LUIS.info("METHOD: ingresando a Guardar Producto");
				LUIS.info("RESULT: guardado " + listaDeProductos.get(listaDeProductos.size()-1).getNombre()+" de forma exitosa");
	}

	@Override
	public void modificarProducto(Producto productoModificado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Producto productoaEliminar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto obtenerProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return unProducto;
	}

	@Override
	public ArrayList<Producto> obtenerTodosProductos() {
		// TODO Auto-generated method stub
		return listaDeProductos;
	}

	@Override
	public Producto obtenerProductoNuevo() {
		// TODO Auto-generated method stub
		return unProducto;
	}

	@Override
	public Producto obtenerUltimoProducto() {
		// TODO Auto-generated method stub
		int i = listaDeProductos.size() - 1;
		LUIS.error("METHOD: Buscando ultimo producto");
		LUIS.error("RESULT: encontrado " + listaDeProductos.get(listaDeProductos.size()-1).getNombre()+" de forma exitosa");
		return listaDeProductos.get(i);
	}

}
