package com.udemycourse.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemycourse.hrworker.entities.Worker;
import com.udemycourse.hrworker.repositories.WorkerRepository;

@Controller
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;

	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> worker = workerRepository.findAll();
		return ResponseEntity.ok().body(worker);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		
		/*
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Optional<Worker> worker = workerRepository.findById(id);
		Worker obj = worker.get();
		return ResponseEntity.ok().body(obj);
	}

}
