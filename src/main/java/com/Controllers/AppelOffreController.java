package com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Enteties.AppelOffre;
import com.Repositories.AppelOffreRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class AppelOffreController {
	
	@Autowired
	private AppelOffreRepository appelOffreRepository;
	
    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/appeloffre")
	public List<AppelOffre> getAllAppel(){
		return appelOffreRepository.findAll();
	}
	
	@GetMapping("/appeloffre/{id}")
	public AppelOffre getAppelById(@PathVariable Long id) {
		return appelOffreRepository.findById(id).get();
	}
	
	@PostMapping("/appeloffre")
    public AppelOffre createClient(@RequestBody AppelOffre a) {
        return appelOffreRepository.save(a);
    }

    @PutMapping("/appeloffre/{id}")
    public AppelOffre updateClient(@PathVariable Long id, @RequestBody AppelOffre a) {
        AppelOffre appel = appelOffreRepository.findById(id).get();
        appel = a;
        return appelOffreRepository.save(appel);
    }

    @DeleteMapping("/appeloffre/{id}")
    public void deleteClientById(@PathVariable Long id) {
    	appelOffreRepository.deleteById(id);
    }
	
}
