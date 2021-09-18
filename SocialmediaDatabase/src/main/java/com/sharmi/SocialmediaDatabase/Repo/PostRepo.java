package com.sharmi.SocialmediaDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharmi.SocialmediaDatabase.Model.Post;
@Repository
public interface PostRepo extends JpaRepository<Post, Long> {

}