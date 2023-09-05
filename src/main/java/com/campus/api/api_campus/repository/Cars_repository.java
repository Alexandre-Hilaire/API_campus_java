package com.campus.api.api_campus.repository;

import com.campus.api.api_campus.api.model.Cars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cars_repository extends CrudRepository<Cars, Long> {

}
