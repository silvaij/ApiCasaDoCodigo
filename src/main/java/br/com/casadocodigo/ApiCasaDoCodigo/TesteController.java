package br.com.casadocodigo.ApiCasaDoCodigo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	
	@GetMapping(value = "/api/test")
	public String teste() {
		return "está configurado";
	}	

}
