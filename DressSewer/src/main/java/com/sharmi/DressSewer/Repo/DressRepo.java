package com.sharmi.DressSewer.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharmi.DressSewer.Model.Dress;
@Repository
public interface DressRepo extends JpaRepository<Dress, String> {

}

