package com.udemycourse.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
