package com.example.workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.example.workflow.model.Job;
import com.example.workflow.repository.JobRepository;
import com.example.workflow.repository.UserRepository;


@Component("jobService")
public class JobService  {
	
	@Autowired
    private JobRepository jobRepo;
	
	@Autowired
    @Qualifier("users")
    private UserRepository userRepo;
    
	
	public void calculateStatus(Job job) {
		
		if(job.getAcceptCount()>job.getRejectCount()) {
			job.setStatus("Accepted");
		}
		else if(job.getAcceptCount()<job.getRejectCount()) {
			job.setStatus("Rejected");
		}
		else {
			job.setStatus("Nil");
		}
		jobRepo.save(job);
	}
	
	public void SaveJob(Job job) {
		jobRepo.save(job);
	}
	
	public void Jobmodel(Model model) {
		java.util.List<Job> listJobs = jobRepo.findAll();
        model.addAttribute("listJobs", listJobs);
	}
	
	public void accept(Job job) {
		Integer count=job.getAcceptCount();
    	job.setAcceptCount(count+1);
    	jobRepo.save(job);
    
	}
	public void reject(Job job) {
		Integer count=job.getRejectCount();
    	job.setRejectCount(count+1);
    	jobRepo.save(job);
    	
	}
	
	public void assignment(Job job) {
		job.setAssign(job.getAssign());
		jobRepo.save(job);
	}

	public void deleteJob(Job job) {
		Integer id = job.getJobId();
		if(jobRepo.existsById(id)){
			jobRepo.deleteById(id);
		}
		
	}

     
    
    
 

}
