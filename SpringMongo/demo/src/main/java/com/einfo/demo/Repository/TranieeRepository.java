package com.einfo.demo.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.einfo.demo.model.Trainee;

@Repository
public interface TranieeRepository extends MongoRepository<Trainee,String>{
		
	
	 	
}
