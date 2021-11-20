package org.ciberfarma.controller;

import org.ciberfarma.model.Producto;
import org.ciberfarma.repository.ICategoriaRepository;
import org.ciberfarma.repository.IProductoRepository;
import org.ciberfarma.repository.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductoController {

	
	
	@Autowired
	private IProductoRepository repo;
	
	@Autowired
	private ICategoriaRepository repoc;
	@Autowired
	private IProveedorRepository repop;
	
	
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("lstProductos",repo.findAll());
		model.addAttribute("lstCategorias", repoc.findAll());
		model.addAttribute("lstProveedor", repop.findAll());
		return "crudproductos";
	}
	
	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Producto producto, Model model) {
		System.out.println("Listo para grabar");
		System.out.println(producto);
		repo.save(producto);	//funciona como el merge, o sea que no solo graba tambien actualiza
		model.addAttribute("lstCategorias", repoc.findAll());
		model.addAttribute("lstProveedor", repop.findAll());
	
		return "crudproductos";
	}
	
	@GetMapping("/listar")
	public String listadoProductos(Model model) {
		model.addAttribute("lstProductos",repo.findAll());
		model.addAttribute("lstCategorias", repoc.findAll());
		model.addAttribute("lstProveedor", repop.findAll());
		return "listado";
	}
	
	
	@PostMapping("/editar")
	public String buscarProducto(@ModelAttribute Producto p, Model model) {
		System.out.println(p);
		model.addAttribute("producto", repo.findById(p.getCodigo()));
		model.addAttribute("lstCategorias", repoc.findAll());
		model.addAttribute("lstProveedor", repop.findAll());
		return "crudproductos";
	}
}
