package pl.krystian;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class VueApi {

	List<Job> list;
	
	@GetMapping("/getJobs")
	public List<Job> getJobs(){
		list = new  ArrayList<>();
		
		Job job1 = new Job();
		Job job2 = new Job();
		Job job3 = new Job();
		
		job1.setId(1);
		job1.setName("Programista backend java");
		job1.setSalary(12000);
		
		job2.setId(2);
		job2.setName("Programista frontend vue.js");
		job2.setSalary(7000);
		
		job3.setId(3);
		job3.setName("Pracownik fizyczny");
		job3.setSalary(2000);
		
		list.add(job1);
		list.add(job2);
		list.add(job3);
		
		return list;
	}
	
	@GetMapping("/getJob")
	public Job getJob(@RequestParam int id) {
		Job job = null;
		
		for(Job jobs : list) {
			if(jobs.getId() == id) {
				job = jobs;
			}
		}
		
		return job;
	}
}
