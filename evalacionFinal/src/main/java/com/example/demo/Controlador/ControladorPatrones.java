package com.example.demo.Controlador;

import org.springframework.http.ResponseEntity;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Models.MunicipioDTO;
import com.example.demo.Models.Patrones;

import org.springframework.web.client.RestTemplate;

 
@Controller
@RequestMapping("/Patrones")
public class ControladorPatrones {

	@GetMapping("{cl}")
	public String startMethod (@PathVariable("cl") String cl, Model model) {
		String titulo = "Pagina API con Spring Boot";
		model.addAttribute("name", cl);
		model.addAttribute("titulo", titulo);
		Patrones startMunicipioDTO = startMunicipiosDTO (cl);
		model.addAttribute("startPTN", startMunicipioDTO);
		return "patrones";
	}
	
	public Patrones startMunicipiosDTO (String numID) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Patrones> resp =
				restTemplate
				.getForEntity(
						String.format("https://myappfb-4718b.firebaseio.com/campeche/patrones/%s"+".json", numID),
						Patrones.class);
		return resp.getBody();
	
	
	}
}
