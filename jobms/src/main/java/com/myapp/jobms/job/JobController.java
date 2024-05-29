package com.myapp.jobms.job;

import com.myapp.jobms.job.dto.JobDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<JobDTO>> findAll(){
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job){
        jobService.createJod(job);
        return new ResponseEntity<>("Job added successfully", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobDTO> getJobById(@PathVariable("id") Long id){
        JobDTO jobDTO = jobService.getJobById(id);

        if (jobDTO != null) return new ResponseEntity<>(jobDTO, HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable("id") Long id){
        boolean deleted = jobService.deleteJob(id);
        if (deleted)
            return new ResponseEntity<>("Job deleted successfully", HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateJob(@PathVariable("id") Long id, @RequestBody Job updatedJob){
        boolean updated = jobService.updateJob(id, updatedJob);
        if (updated)
            return new ResponseEntity<>("Job updated successfully", HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}
