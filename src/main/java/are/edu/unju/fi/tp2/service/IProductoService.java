package are.edu.unju.fi.tp2.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import are.edu.unju.fi.tp2.model.Producto;
@Service
public interface IProductoService {
	//que hace con Producto( clase) 
	//*
	//como se hace la solucion al problema 
	//guardar en una array o en una BD de oracle o MySql
	public void guardarProducto(Producto unProducto);
	public void modificarProducto(Producto productoModificado);
	public void eliminarProducto(Producto productoaEliminar);
	public Producto obtenerProducto(String nombreProducto);
	public ArrayList<Producto> obtenerTodosProductos();
	public Producto obtenerProductoNuevo();
	public Producto obtenerUltimoProducto();
	
}
