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


@RestController
@RequestMapping("/student")
public class StudentController {
	
	private Map<String,Student> students=new HashMap<String,Student>();
	//private List<Student> studentList=new ArrayList<Student>();
	
	@GetMapping
	public Collection<Student> getStudents()
	{
		
		return students.values();
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") String id)
	{
		
		return students.get(id);
	}
	@PostMapping
	public void add(@RequestBody Student student) {
		students.put(student.getId(),student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		students.remove(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Student st)
	{
		students.replace(id,st);
	}
	
	
	
	
	
}
