package com.einfo.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.einfo.demo.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer> {

	
}
