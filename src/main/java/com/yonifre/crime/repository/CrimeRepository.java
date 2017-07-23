package com.yonifre.crime.repository;

import org.springframework.data.repository.CrudRepository;

import com.yonifre.crime.model.dao.CrimeDao;

public interface CrimeRepository extends CrudRepository<CrimeDao, Long>  {

}
