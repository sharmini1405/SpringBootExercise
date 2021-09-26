package com.sharmi.DressSewer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharmi.DressSewer.Model.Sewer;
@Repository
public interface  SewerRepo extends JpaRepository<Sewer, String> {

}
