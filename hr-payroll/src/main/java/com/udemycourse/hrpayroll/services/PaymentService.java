package com.udemycourse.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.udemycourse.hrpayroll.entities.Payment;
import com.udemycourse.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String  hrWorkerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker =  restTemplate.getForObject(hrWorkerHost + "/workers/" + workerId, Worker.class);
		return new Payment(worker.getName(),worker.getDailyIncome(), days);
	}

}
