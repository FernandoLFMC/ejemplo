package net.javaguides.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Incremen;
import net.javaguides.springboot.repository.IncremenRepository;

@RestController
@RequestMapping("/api/v1/")
public class IncremenController {
	
	@Autowired
	private IncremenRepository incremenRepository;
	
	@GetMapping("incremen")
	public List<Incremen> getAllIncremen(){
		return incremenRepository.findAll();
	}
	
	@PostMapping ("incremen")
	public Incremen createIncremen(Incremen incremen) {
		return incremenRepository.save(incremen);
	}
	

}
