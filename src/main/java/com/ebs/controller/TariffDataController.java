package com.ebs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebs.exception.TariffNotFoundException;
import com.ebs.model.TariffData;
import com.ebs.repository.TariffRepo;



@RestController
@CrossOrigin("http://localhost:3000/")
public class TariffDataController {
	
	@Autowired
	TariffRepo trepo;
	
	@PostMapping("/Tariff")
	public String save(@RequestBody TariffData td) {
		trepo.save(td);
		return "Tariff Saved";
	}
	
	@GetMapping("/Tariff")
	public List<TariffData> doFind() {
		return trepo.findAll();
	}


	
}
