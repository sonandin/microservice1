package com.hotelmanagement.Receptionist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanagement.Receptionist.Model.Checkin;
import com.hotelmanagement.Receptionist.Repository.CheckinRepo;

@RestController
@RequestMapping("/Receptionist")
public class CheckinController {

	@Autowired
	CheckinRepo checkinrepo;
	
	@GetMapping("/Checkin")
	public List<Checkin>getAllCheckins(){
	return checkinrepo.findAll();
	}
}
