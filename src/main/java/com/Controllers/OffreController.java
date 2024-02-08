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

import com.Enteties.Offre;
import com.Repositories.OffreRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class OffreController {
	
	@Autowired
	private OffreRepository offreRepository;
	
	@GetMapping("/offre")
	public List<Offre> getAllOffres(){
		return offreRepository.findAll();
	}
	
	@GetMapping("/offre/{id}")
	public Offre getAppelById(@PathVariable Long id) {
		return offreRepository.findById(id).get();
	}
	
	@PostMapping("/offre")
    public Offre createClient(@RequestBody Offre o) {
        return offreRepository.save(o);
    }

    @PutMapping("/offre/{id}")
    public Offre updateClient(@PathVariable Long id, @RequestBody Offre o) {
        Offre offer = offreRepository.findById(id).get();
        offer = o;
        return offreRepository.save(offer);
    }

    @DeleteMapping("/offre/{id}")
    public void deleteClientById(@PathVariable Long id) {
    	offreRepository.deleteById(id);
    }
}
