package com.sharmi.SocialmediaDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharmi.SocialmediaDatabase.Model.User;
@Repository
public interface UserRepo extends JpaRepository<User, String>  {

}
