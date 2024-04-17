package com.bandiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bandiClasses.DMS.Models.Dog;


@Repository
public interface DogRepository extends CrudRepository<Dog,Integer>{

}
