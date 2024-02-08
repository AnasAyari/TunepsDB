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

import com.Enteties.Transaction;
import com.Repositories.TransactionRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class TransactionController {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@GetMapping("/transaction")
	public List<Transaction> getAllTransactions(){
		return transactionRepository.findAll();
	}
	
	
	@GetMapping("/transaction/{id}")
	public Transaction getAppelById(@PathVariable Long id) {
		return transactionRepository.findById(id).get();
	}
	
	@PostMapping("/transaction")
    public Transaction createClient(@RequestBody Transaction t) {
        return transactionRepository.save(t);
    }

    @PutMapping("/transaction/{id}")
    public Transaction updateClient(@PathVariable Long id, @RequestBody Transaction t) {
    	Transaction trans = transactionRepository.findById(id).get();
        trans = t;
        return transactionRepository.save(trans);
    }

    @DeleteMapping("/transaction/{id}")
    public void deleteClientById(@PathVariable Long id) {
    	transactionRepository.deleteById(id);
    }
}
