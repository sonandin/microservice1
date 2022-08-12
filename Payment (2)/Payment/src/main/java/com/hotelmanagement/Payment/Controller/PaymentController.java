package com.hotelmanagement.Payment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanagement.Payment.Model.PaymentObject;
import com.hotelmanagement.Payment.Repository.PaymentInterface;


@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentInterface paymentinterface;

	@GetMapping("/details")
	public List<PaymentObject> getAllPayments(){
        return paymentinterface.findAll();
    }
    
	
	
}
