package com.sharmi.SocialmediaDatabase.Controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmi.SocialmediaDatabase.Model.Comment;
import com.sharmi.SocialmediaDatabase.Model.Post;
import com.sharmi.SocialmediaDatabase.Repo.CommentRepo;
import com.sharmi.SocialmediaDatabase.Repo.PostRepo;

@RestController
@RequestMapping("/post")
@Produces(MediaType.APPLICATION_XML)
public class PostController {
	@Autowired
	 private PostRepo repo;
	 @GetMapping
	 public List<Post> getAll()
	 {
		 return repo.findAll();
	 }
	 @GetMapping("/{id}")
	 public Post get(@PathVariable("id") Long id)
	 {
		return repo.findById(id).get();
	 }
	 
	 @PostMapping
	 public void add(@RequestBody Post post)
	 {
		 repo.save(post);
	 }
	 
	 @PutMapping
	 public void update(@RequestBody Post post)
	 {
		 repo.save(post);
	 }
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable("id") Long id)
	 {
		 repo.deleteById(id);
	 }
}
