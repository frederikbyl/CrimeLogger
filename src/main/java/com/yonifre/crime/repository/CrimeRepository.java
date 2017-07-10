package com.yonifre.crime.repository;

import org.springframework.data.repository.CrudRepository;

import com.yonifre.crime.model.Crime;

public interface CrimeRepository extends CrudRepository<Crime, Long>  {

}
