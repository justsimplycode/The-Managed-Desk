package com.shaswat.submissionservice.service;

import com.shaswat.submissionservice.dtos.TaskDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "TASK-SERVICE",url = "http://localhost:5002")
public interface TaskService {
   @GetMapping("/api/tasks/{id}")
   public TaskDto getTaskById(@PathVariable Long id,
                                   @RequestHeader("Authorization") String jwt);

   @PutMapping("/api/tasks/{id}/complete")
   public TaskDto completeTask(@PathVariable Long id);
}
