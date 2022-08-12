package com.hotelmanagement.Admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanagement.Admin.Model.AdminObject;
import com.hotelmanagement.Admin.Repository.AdminRepo;

@RestController
@RequestMapping("AdminDetails")
public class AdminController {

	@Autowired
	AdminRepo adminrepo;
	
	@GetMapping(path="/show")
	public List<AdminObject> getAllDetails(){
		return adminrepo.findAll();
	}
	
}
