package com.converter.mysql.repository;

import com.converter.mysql.entity.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/index")
public interface ValueRepository extends JpaRepository<Value, String> {

}
