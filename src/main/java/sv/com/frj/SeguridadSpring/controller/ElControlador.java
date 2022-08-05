package sv.com.frj.SeguridadSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElControlador {
	
	
	@GetMapping("/")
	public String muestraInicio(){
		
		return "inicio";
		
	}
	//Agregar mapeo de Administradores
	
	@GetMapping("/administradores")
	public String muestraAdministradores() {
		
		return "administradores";
	}
	
	@GetMapping("/acceso-denegado")
	public String muestraAccesoDenegado() {
		
		return "acceso-denegado";
	}
}
