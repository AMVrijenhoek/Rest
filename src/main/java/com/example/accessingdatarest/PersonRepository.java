package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// Class for interacting with the database
@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

    // Define search options
    List<Person> findByName(@Param("name") String name);
    List<Person> findByAge(@Param("age") int age);
    List<Person> findByactiveTrue();
    List<Person> findByactiveFalse();
}
