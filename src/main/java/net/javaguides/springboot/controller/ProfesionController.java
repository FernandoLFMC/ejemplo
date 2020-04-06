package net.javaguides.springboot.controller;

import java.util.HashMap; 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Profesion;
import net.javaguides.springboot.repository.ProfesionRepository;


@RestController
@RequestMapping("api/v1/")
public class ProfesionController {
	@Autowired
	private ProfesionRepository profesionRepository;
	
	@GetMapping("profesion")
	public List<Profesion> getAllProfesion(){
		return profesionRepository.findAll();
	}
	
	
	//save employee
	@PostMapping("profesion")
	public Profesion createProfesion(Profesion profesion) {
		return profesionRepository.save(profesion);
	}
	
	@DeleteMapping("profesion/{id}")
	public Map<String, Boolean> deleteProfesion(@PathVariable (value = "id") Long profesionId)
			throws ResourceNotFoundException {
		Profesion profesion = profesionRepository.findById(profesionId)
				.orElseThrow(() -> new ResourceNotFoundException("Profesion not found for this id :: " + profesionId));

		this.profesionRepository.delete(profesion);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}