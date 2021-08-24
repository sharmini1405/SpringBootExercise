package com.sharmi.StudentAPI.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmi.StudentAPI.Model.Student;
import com.sharmi.StudentAPI.Repo.Repo;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	private Repo<String,Student> studentRepo=new Repo<String,Student>();
	//private List<Student> studentList=new ArrayList<Student>();
	
	@GetMapping
	public Collection<Student> getAll()
	{
		
		return studentRepo.getAll();
	}
	
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id)
	{
		
		return studentRepo.get(id);
	}
	@PostMapping
	public void add(@RequestBody Student student) {
		studentRepo.add(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		studentRepo.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Student st)
	{
		studentRepo.update(id, st);
	}
	
	
	
	
	
}
