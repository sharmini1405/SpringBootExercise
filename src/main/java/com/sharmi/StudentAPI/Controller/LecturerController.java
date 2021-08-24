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

import com.sharmi.StudentAPI.Model.Lecturer;
import com.sharmi.StudentAPI.Repo.Repo;
@RestController
@RequestMapping("/lecturer")
public class LecturerController {
	private Repo<Long,Lecturer> lecturerRepo=new Repo<Long,Lecturer>();
	//private List<Student> studentList=new ArrayList<Student>();
	
	@GetMapping
	public Collection<Lecturer> getAll()
	{
		
		return lecturerRepo.getAll();
	}
	
	@GetMapping("/{id}")
	public Lecturer get(@PathVariable("id") Long id)
	{
		
		return lecturerRepo.get(id);
	}
	@PostMapping
	public void add(@RequestBody Lecturer lecturer) {
		lecturerRepo.add(lecturer);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id)
	{
		lecturerRepo.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Long id,@RequestBody Lecturer lt)
	{
		lecturerRepo.update(id, lt);
	}
	
}
