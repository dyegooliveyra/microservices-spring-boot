package com.udemycourse.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemycourse.hrpayroll.entities.Payment;
import com.udemycourse.hrpayroll.services.PaymentService;

@Controller
@RequestMapping(value = "/payments")
public class PaymentResource {

	@Autowired
	private PaymentService service;

	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable long workerId,@PathVariable int days) {
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok().body(payment);
	}
}
