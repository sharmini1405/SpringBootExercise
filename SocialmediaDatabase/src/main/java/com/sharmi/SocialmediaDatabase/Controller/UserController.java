package com.sharmi.SocialmediaDatabase.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
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
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.sharmi.SocialmediaDatabase.Model.Comment;
import com.sharmi.SocialmediaDatabase.Model.Post;
import com.sharmi.SocialmediaDatabase.Model.User;
import com.sharmi.SocialmediaDatabase.Repo.UserRepo;

@RestController
@RequestMapping("/user")
@Produces(MediaType.APPLICATION_XML)
//@Consumes(MediaType.APPLICATION_XML) for input xml ttype
public class UserController {
 @Autowired
 private UserRepo repo;
 @GetMapping
 public List<User> getAll()
 {
	 List<User> users=repo.findAll();
	 for(User u : users)
	 {
		 String selfUrl= linkTo(UserController.class).slash(u.getUserid()).toString();
		 String postUrl=linkTo(UserController.class).slash(u.getUserid()).slash("post").toString();
		 String commentUrl=linkTo(UserController.class).slash(u.getUserid()).slash("comment").toString();
		 
		 u.addLink(selfUrl, "self");
		 u.addLink(postUrl, "post");
		 u.addLink(commentUrl, "comment");
		 
	 }
	 return users ;
 }
 @GetMapping("/{id}")
 public User get(@PathVariable("id") String id)
 {
	User u=repo.findById(id).get();
	String postUrl=linkTo(UserController.class).slash(u.getUserid()).slash("post").toString();
	 String commentUrl=linkTo(UserController.class).slash(u.getUserid()).slash("comment").toString();
	 u.addLink(postUrl, "post");
	 u.addLink(commentUrl, "comment");
	 
	return u;
 }
 
 @PostMapping
 public void add(@RequestBody User user)
 {
	 repo.save(user);
 }
 
 @PutMapping
 public void update(@RequestBody User user)
 {
	 repo.save(user);
 }
 @DeleteMapping("/{id}")
 public void delete(@PathVariable("id") String id)
 {
	 repo.deleteById(id);
 }
 @GetMapping("/{id}/post")
 public List<Post> getPosts(@PathVariable("id") String id)
 {
	return repo.findById(id).get().getPosts();
 }
 @GetMapping("/{id}/comment")
 public List<Comment> getComments(@PathVariable("id") String id)
 {
	return repo.findById(id).get().getComments();
 }
 
 
 

 
}
