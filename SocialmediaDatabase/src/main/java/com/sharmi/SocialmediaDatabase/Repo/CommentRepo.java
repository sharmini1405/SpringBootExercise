package com.sharmi.SocialmediaDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharmi.SocialmediaDatabase.Model.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {

}
