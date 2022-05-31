package com.example.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.workflow.model.Job;
import com.example.workflow.model.User;

@Component("jobs")
public interface JobRepository extends JpaRepository<Job, Integer>{

//	@Query("SELECT j FROM Jobs j WHERE j.job_id = ?1")
    public Job findByJobId(Integer jobId);
}
