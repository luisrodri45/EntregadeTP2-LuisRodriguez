package are.edu.unju.fi.tp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import are.edu.unju.fi.tp2.model.Producto;
import are.edu.unju.fi.tp2.service.IProductoService;
@Controller
public class ProductoController {
	
		@Autowired
		IProductoService productoService;
		
		@GetMapping("/producto")
		public String cargarProducto(Model model) {
			model.addAttribute("unProducto", productoService.obtenerProductoNuevo());
			return "producto";
		}
		@PostMapping("/producto")
		public String guardarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model) {
			productoService.guardarProducto(nuevoProducto);
			//mostrar el listado de producto luego de la carga de un producto
			System.out.println(productoService.obtenerTodosProductos().get(0).getMarca());
			model.addAttribute("productos", productoService.obtenerTodosProductos());
			return "resultado";
		}
		@GetMapping("/ultimo")
		public String cargarUltimoProducto(Model model) {
			model.addAttribute("ultimoProducto", productoService.obtenerUltimoProducto());
			return("mostrar-ultimo");
		}
		@GetMapping("/volver")
		public String cargarNuevoProducto(Model model) {		
			return("redirect:/producto");
		}
}
