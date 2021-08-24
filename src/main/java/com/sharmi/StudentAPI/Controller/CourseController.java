package com.sharmi.StudentAPI.Controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmi.StudentAPI.Model.Course;
import com.sharmi.StudentAPI.Repo.Repo;
@RestController
@RequestMapping("/course")
public class CourseController {
	private Repo<String,Course> courseRepo=new Repo<String,Course>();
 	
	@GetMapping
	public Collection<Course> getAll()
	{
		
		return courseRepo.getAll();
	}
	
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") String id)
	{
		
		return courseRepo.get(id);
	}
	@PostMapping
	public void add(@RequestBody Course course) {
		courseRepo.add(course);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		courseRepo.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Course cou)
	{
		courseRepo.update(id, cou);
	}
	
}
